package com.example.mymoviewdb.ui.popular

import android.content.Intent
import android.opengl.Visibility
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.example.mymoviewdb.R
import com.example.mymoviewdb.databinding.HomeFragmentBinding
import com.example.mymoviewdb.databinding.PopularFragmentBinding
import com.example.mymoviewdb.models.Film
import com.example.mymoviewdb.room.Popular
import com.example.mymoviewdb.ui.detail_movie.DetailMovieActivity
import com.example.mymoviewdb.ui.home.PopularMoviesAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PopularFragment : Fragment(), View.OnClickListener {
    private var _binding: PopularFragmentBinding? = null
    private val binding get() = _binding
    private var dataList = ArrayList<Film>()

    companion object {
        fun newInstance() = PopularFragment()
    }

    private lateinit var viewModel: PopularViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = PopularFragmentBinding.inflate(inflater,container,false)

        return binding?.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PopularViewModel::class.java)
        // TODO: Use the ViewModel
        binding?.rvPopularMovieDetail?.layoutManager = GridLayoutManager(requireContext(), 2)

        viewModel.getAllPopulars()

        binding?.btnSearch?.setOnClickListener(this)
    }

    private fun searchMovie(query: String?) {
        viewModel.search(query).observe(viewLifecycleOwner, {list ->
            binding?.txtSearch?.text = "Showing result of "
            binding?.inputResult?.text = "‘${binding?.inputSearch?.text}’"
            binding?.inputResult?.visibility = View.VISIBLE
            generatePopularDetail(list)
        })
    }

    private fun generatePopularDetail(list: List<Popular>) {
        binding?.rvPopularMovieDetail?.adapter = PopularMoviesDetailAdapter(list) { data ->
            activity?.let {
                val toDetailMovie = Intent(requireContext(), DetailMovieActivity::class.java)
                toDetailMovie.putExtra(DetailMovieActivity.EXTRA_ID_MOVIE, data.id)
                startActivity(toDetailMovie)
            }
        }
    }

    override fun onClick(v: View) {
        when (v.id) {
            binding?.btnSearch?.id -> {
                searchMovie(binding?.inputSearch?.text?.toString())
            }
        }
    }


}