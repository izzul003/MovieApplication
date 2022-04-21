package com.example.mymoviewdb.ui.detail_movie

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mymoviewdb.R
import com.example.mymoviewdb.models.Genre
import com.example.mymoviewdb.networks.responses.Genres

class GenreAdapter(
    private val data: List<Genres>,
    private val listener: (Genres) -> Unit)
    : RecyclerView.Adapter<GenreAdapter.ViewHolder>() {

    lateinit var çontextAdapter: Context

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): GenreAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        çontextAdapter = parent.context
        val inflatedView =  layoutInflater.inflate(R.layout.row_item_genre, parent, false)
        return ViewHolder(inflatedView)
    }

    override fun onBindViewHolder(holder: GenreAdapter.ViewHolder, position: Int) {
        holder.bindItem(data[position], listener, çontextAdapter, position)
    }

    override fun getItemCount(): Int = data.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val tvTitle: TextView = view.findViewById(R.id.tvGenreDetail)
        private val ivPoint: ImageView = view.findViewById(R.id.ivPoint)
//        private val tvGenre: TextView = view.findViewById(R.id.tvGenre)
//        private val tvRate: TextView = view.findViewById(R.id.tvRate)

        fun bindItem(data: Genres, listener: (Genres) -> Unit, context: Context, position: Int) {
            if (position == 0) {
                ivPoint.visibility = View.GONE
            }
            tvTitle.setText(data.name)

            itemView.setOnClickListener {
                listener(data)
            }
        }
    }

}
