package com.example.mymoviewdb.ui.detail_movie

import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mymoviewdb.R
import com.example.mymoviewdb.models.Genre
import com.example.mymoviewdb.networks.responses.Genres
import com.example.mymoviewdb.networks.responses.ProductionCompanie
import java.lang.StringBuilder

class CastAdapter(
    private val data: List<ProductionCompanie>,
    private val listener: (ProductionCompanie) -> Unit)
    : RecyclerView.Adapter<CastAdapter.ViewHolder>() {

    lateinit var çontextAdapter: Context

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CastAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        çontextAdapter = parent.context
        val inflatedView =  layoutInflater.inflate(R.layout.row_item_cast, parent, false)
        return ViewHolder(inflatedView)
    }

    override fun onBindViewHolder(holder: CastAdapter.ViewHolder, position: Int) {
        holder.bindItem(data[position], listener, çontextAdapter, position)
    }

    override fun getItemCount(): Int = data.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val tvTitle: TextView = view.findViewById(R.id.tvCast)
//        private val tvGenre: TextView = view.findViewById(R.id.tvGenre)
//        private val tvRate: TextView = view.findViewById(R.id.tvRate)
        private val imgPoster: ImageView = view.findViewById(R.id.ivCast)

        fun bindItem(data: ProductionCompanie, listener: (ProductionCompanie) -> Unit, context: Context, position: Int) {

            val stringImagePoster = StringBuilder().append("https://image.tmdb.org/t/p/w500").append(data.logo_path)

            tvTitle.text = data.name

            Glide.with(context)
                .load(Uri.parse(stringImagePoster.toString()))
                .into(imgPoster)

            itemView.setOnClickListener {
                listener(data)
            }
        }
    }

}
