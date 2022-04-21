package com.example.mymoviewdb.ui.popular

import android.content.Context
import android.net.Uri
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mymoviewdb.R
import com.example.mymoviewdb.models.Film
import com.example.mymoviewdb.room.Popular
import java.lang.StringBuilder

class PopularMoviesDetailAdapter(
    private val data: List<Popular>,
    private val listener: (Popular) -> Unit)
    : RecyclerView.Adapter<PopularMoviesDetailAdapter.ViewHolder>() {

    lateinit var çontextAdapter: Context

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PopularMoviesDetailAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        çontextAdapter = parent.context
        val inflatedView =  layoutInflater.inflate(R.layout.row_item_popular_movies_detail, parent, false)
        return ViewHolder(inflatedView)
    }

    override fun onBindViewHolder(holder: PopularMoviesDetailAdapter.ViewHolder, position: Int) {
        holder.bindItem(data[position], listener, çontextAdapter)
    }

    override fun getItemCount(): Int = data.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val tvTitle: TextView = view.findViewById(R.id.tvTitle)
        private val tvDirector: TextView = view.findViewById(R.id.tvDirector)
//        private val tvRate: TextView = view.findViewById(R.id.tvRate)

        private val imgPoster: ImageView = view.findViewById(R.id.ivPosterDetail)

        fun bindItem(data: Popular, listener: (Popular) -> Unit, context: Context) {
            tvTitle.setText(data.title)
            tvDirector.setText(data.overview)
//            tvRate.setText(data.rating)

            val stringImagePoster = StringBuilder().append("https://image.tmdb.org/t/p/w500").append(data.poster_path)

            Log.d("CEK_IMAGE", stringImagePoster.toString())
            Glide.with(context)
                .load(Uri.parse(stringImagePoster.toString()))
                .into(imgPoster)

            itemView.setOnClickListener {
                listener(data)
            }
        }
    }

}
