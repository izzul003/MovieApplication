package com.example.mymoviewdb.ui.home

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mymoviewdb.databinding.HomeFragmentBinding
import com.example.mymoviewdb.models.Film
import com.example.mymoviewdb.networks.responses.ResultBanner
import com.example.mymoviewdb.networks.responses.ResultCominSoon
import com.example.mymoviewdb.ui.detail_movie.DetailMovieActivity
import com.example.mymoviewdb.ui.detail_movie.DetailMovieActivity.Companion.EXTRA_ID_MOVIE
class HomeFragment : Fragment() {
    private var _binding: HomeFragmentBinding? = null
    private val binding get() = _binding
    private var dataList = ArrayList<Film>()
    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = HomeFragmentBinding.inflate(inflater,container,false)

        return binding?.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)[HomeViewModel::class.java]

        binding?.rvBanner?.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding?.rvPopularMovie?.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding?.rvComingSoon?.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        viewModel.getListBanners()
        viewModel.getListPopulars()
        viewModel.getListComingSoons()

        viewModel.banners.observe(viewLifecycleOwner, {list ->
            generateBanners(list)
        })

        viewModel.populars.observe(viewLifecycleOwner, {list ->
            generatePopularMovie(list)
        })

        viewModel.soons.observe(viewLifecycleOwner, {list ->
            generateSoonMovies(list)
        })

    }

    private fun generateSoonMovies(list: List<ResultCominSoon>) {
        binding?.rvComingSoon?.adapter = SoonMoviesAdapter(list) { data ->
            activity?.let {
                val toDetailMovie = Intent(requireContext(), DetailMovieActivity::class.java)
                toDetailMovie.putExtra(EXTRA_ID_MOVIE, data.id)
                startActivity(toDetailMovie)
            }
        }
    }

    private fun generateBanners(list: List<ResultBanner>) {
        binding?.rvBanner?.adapter = BannerAdapter(list) { data ->
            activity?.let {
                val toDetailMovie = Intent(requireContext(), DetailMovieActivity::class.java)
                toDetailMovie.putExtra(EXTRA_ID_MOVIE, data.id)
                startActivity(toDetailMovie)
            }
        }
    }

    private fun generatePopularMovie(list: List<ResultBanner>) {
        binding?.rvPopularMovie?.adapter = PopularMoviesAdapter(list) { data ->
            activity?.let {
                val toDetailMovie = Intent(requireContext(), DetailMovieActivity::class.java)
                toDetailMovie.putExtra(EXTRA_ID_MOVIE, data.id)
                startActivity(toDetailMovie)
            }
        }
    }

}