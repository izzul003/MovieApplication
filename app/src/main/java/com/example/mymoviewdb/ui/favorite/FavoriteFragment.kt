package com.example.mymoviewdb.ui.favorite

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mymoviewdb.R
import com.example.mymoviewdb.databinding.FavoriteFragmentBinding
import com.example.mymoviewdb.databinding.PopularFragmentBinding
import com.example.mymoviewdb.models.Film
import com.example.mymoviewdb.room.Favorite
import com.example.mymoviewdb.ui.detail_movie.DetailMovieActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FavoriteFragment : Fragment(), View.OnClickListener {
    private var _binding: FavoriteFragmentBinding? = null
    private val binding get() = _binding
    private var dataList = ArrayList<Film>()

    companion object {
        fun newInstance() = FavoriteFragment()
    }

    private lateinit var viewModel: FavoriteViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FavoriteFragmentBinding.inflate(inflater,container,false)

        return binding?.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FavoriteViewModel::class.java)
        // TODO: Use the ViewModel
        binding?.rvFavorite?.layoutManager = LinearLayoutManager(requireContext())
        viewModel.getAllFavorites().observe(viewLifecycleOwner, { favorites ->
            generateFavorites(favorites)
        })
        binding?.btnSearchFavorite?.setOnClickListener(this)
    }

    private fun generateFavorites(list: List<Favorite>) {
        val adapter = FavoriteMoviesAdapter(list) { data ->
            activity?.let {
                val toDetailMovie = Intent(requireContext(), DetailMovieActivity::class.java)
                toDetailMovie.putExtra(DetailMovieActivity.EXTRA_ID_MOVIE, data.id)
                startActivity(toDetailMovie)
            }
        }
        binding?.rvFavorite?.adapter = adapter
        adapter.setOnItemClickCallback(object: FavoriteMoviesAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Favorite) {
                viewModel.deleteFavorite(data)
            }
        })
    }

    private fun searchMovie(query: String?) {
        viewModel.search(query).observe(viewLifecycleOwner, {list ->
            generateFavorites(list)
        })
    }

    override fun onClick(v: View) {
        when(v.id) {
            binding?.btnSearchFavorite?.id -> {
                searchMovie(binding?.inputResultFavorite?.toString())
            }
        }
    }

}