package com.example.mymoviewdb.ui.home

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
import com.example.mymoviewdb.networks.responses.ResultBanner
import java.lang.StringBuilder

class BannerAdapter(
    private val data: List<ResultBanner>,
    private val listener: (ResultBanner) -> Unit)
    : RecyclerView.Adapter<BannerAdapter.ViewHolder>() {

    lateinit var çontextAdapter: Context

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BannerAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        çontextAdapter = parent.context
        val inflatedView =  layoutInflater.inflate(R.layout.row_item_banner, parent, false)
        return ViewHolder(inflatedView)
    }

    override fun onBindViewHolder(holder: BannerAdapter.ViewHolder, position: Int) {
        holder.bindItem(data[position], listener, çontextAdapter)
    }

    override fun getItemCount(): Int = data.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val tvTitle: TextView = view.findViewById(R.id.tvTitleBanner)
//        private val tvGenre: TextView = view.findViewById(R.id.tvGenre)
//        private val tvRate: TextView = view.findViewById(R.id.tvRate)

        private val imgPoster: ImageView = view.findViewById(R.id.ivBanner)

        fun bindItem(data: ResultBanner, listener: (ResultBanner) -> Unit, context: Context) {
            tvTitle.setText(data.title)
//            tvGenre.setText(data.genre)
//            tvRate.setText(data.rating)
            val stringImageBackdrop = StringBuilder().append("https://image.tmdb.org/t/p/w500").append(data.backdrop_path)
            Glide.with(context)
                .load(Uri.parse(stringImageBackdrop.toString()))
                .into(imgPoster)

            itemView.setOnClickListener {
                listener(data)
            }
        }
    }

}
