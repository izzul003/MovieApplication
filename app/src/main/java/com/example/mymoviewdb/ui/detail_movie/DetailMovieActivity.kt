package com.example.mymoviewdb.ui.detail_movie

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.mymoviewdb.R
import com.example.mymoviewdb.databinding.ActivityDetailMovieBinding
import com.example.mymoviewdb.networks.responses.DetailMovieResponse
import dagger.hilt.android.AndroidEntryPoint
import java.lang.StringBuilder

@AndroidEntryPoint
class DetailMovieActivity : AppCompatActivity(), View.OnClickListener {
    private var _binding: ActivityDetailMovieBinding? = null
    private val binding get() = _binding
    private lateinit var dataDetail: DetailMovieResponse
    private lateinit var viewModel: DetailMovieViewModel

    private var isFavorite = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityDetailMovieBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        viewModel = ViewModelProvider(this)[DetailMovieViewModel::class.java]

        val movieId = intent.getIntExtra(EXTRA_ID_MOVIE, 0)

        binding?.rvGenres?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding?.rvCasts?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        if (movieId != null) {
            viewModel.getDetailMovie(movieId)
            viewModel.checkDataFavorite(movieId).observe(this, { lokal ->
                if (lokal != null) {
                    isFavorite = true
                    binding?.btnFavorite?.icon = this.getDrawable(R.drawable.ic_baseline_delete_green)
                    binding?.btnFavorite?.text = "Remove from Favorite"
                }
            })
            displayContentMovie()
        }

    }

    private fun displayContentMovie() {
        viewModel.movie.observe(this, { Detail ->
            dataDetail = Detail

            binding?.tvTitleBannerDetail?.text = Detail.title

            binding?.btnBack?.setOnClickListener(this)
            val stringImagePoster = StringBuilder().append("https://image.tmdb.org/t/p/w500").append(Detail.poster_path)
            Glide.with(this)
                .load(Uri.parse(stringImagePoster.toString()))
                .into(binding?.ivBannerDetail!!)

            val hours = Detail.runtime / 60
            val minutes = Detail.runtime % 60
            binding?.tvHoursMovieDetail?.text = StringBuilder().append(hours).append("h")
            binding?.tvMinutesMovieDetail?.text = StringBuilder().append(minutes).append("m")

            binding?.rvGenres?.adapter = GenreAdapter(Detail.genres) {}

            binding?.tvOverview?.text = Detail.overview

            binding?.rvCasts?.adapter = CastAdapter(Detail.production_companies) {}

            binding?.btnFavorite?.setOnClickListener(this)

        })
    }

    companion object {
        const val EXTRA_ID_MOVIE = "extra_id_movie"
    }

    override fun onClick(v: View) {
        when(v.id) {
            binding?.btnBack?.id -> finish()
            binding?.btnFavorite?.id -> {
                if (isFavorite) {
                    viewModel.deleteFavorite(dataDetail)
                    binding?.btnFavorite?.icon = this.getDrawable(R.drawable.ic_baseline_add_green)
                    binding?.btnFavorite?.text = "Add to Favorite"
                    isFavorite = false
                } else {
                    viewModel.insertFavorite(dataDetail)
                    binding?.btnFavorite?.icon = this.getDrawable(R.drawable.ic_baseline_delete_green)
                    binding?.btnFavorite?.text = "Remove from Favorite"
                    isFavorite = true
                }
            }
        }
    }

}