package com.example.mymoviewdb.ui.favorite

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
import com.example.mymoviewdb.room.Favorite
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonObject
import com.google.gson.reflect.TypeToken
import com.google.gson.stream.JsonReader
import java.io.StringReader


class FavoriteMoviesAdapter(
    private val data: List<Favorite>,
    private val listener: (Favorite) -> Unit)
    : RecyclerView.Adapter<FavoriteMoviesAdapter.ViewHolder>() {

    lateinit var çontextAdapter: Context
    private lateinit var onItemClickCallback: OnItemClickCallback

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FavoriteMoviesAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        çontextAdapter = parent.context
        val inflatedView =  layoutInflater.inflate(R.layout.row_item_favorite, parent, false)
        return ViewHolder(inflatedView)
    }

    override fun onBindViewHolder(holder: FavoriteMoviesAdapter.ViewHolder, position: Int) {
        holder.bindItem(data[position], listener, çontextAdapter, onItemClickCallback)
    }

    override fun getItemCount(): Int = data.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val tvTitle: TextView = view.findViewById(R.id.tvTitleFavorite)
        private val tvGenre: TextView = view.findViewById(R.id.tvGenreFavorite)
//        private val tvRate: TextView = view.findViewById(R.id.tvRate)
        private val btnDeleteFavorite: ImageView = view.findViewById(R.id.btnDeleteFavorite)
        private val imgPoster: ImageView = view.findViewById(R.id.ivPosterFavorite)

        fun bindItem(data: Favorite, listener: (Favorite) -> Unit, context: Context, onDeleteCallback: OnItemClickCallback) {
//            tvRate.setText(data.rating)

            val typeToken = object : TypeToken<List<Genre>>() {}.type
            val genres = Gson().fromJson<List<Genre>>(data.genre_ids, typeToken)

            val stringGenre = StringBuilder()
            genres?.forEachIndexed  { index, item ->
                if (index == genres.size -1) {
                    stringGenre.append(item.name)
                }else {
                    stringGenre.append(item.name).append(", ")
                }
            }
            val stringImagePoster = StringBuilder().append("https://image.tmdb.org/t/p/w500").append(data.backdrop_path)

            tvTitle.setText(data.title)

            tvGenre.setText(stringGenre)

            Glide.with(context)
                .load(Uri.parse(stringImagePoster.toString()))
                .into(imgPoster)

            btnDeleteFavorite.setOnClickListener {
                btnDeleteFavorite.setImageResource(R.drawable.ic_baseline_favorite_gray)
                onDeleteCallback.onItemClicked(data)
            }

            itemView.setOnClickListener {
                listener(data)
            }
        }

    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Favorite)
    }

}
