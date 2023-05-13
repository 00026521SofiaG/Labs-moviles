package com.example.laboratorio05.ui.movie

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.laboratorio05.R
import com.example.laboratorio05.data.model.MovieModel
import com.example.laboratorio05.data.movies
import org.w3c.dom.Text

class MovieViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
    private var nameTextView = itemView.findViewById<TextView>(R.id.movieTitle)
    private var calificationTextView = itemView.findViewById<TextView>(R.id.movieCalification)
    private var pictureImageView = itemView.findViewById<ImageView>(R.id.moviePicture)

    fun bind(movie:MovieModel, onClickListener: (MovieModel) -> Unit){
        nameTextView.text = movie.name
        calificationTextView.text = movie.qualification

        nameTextView.setOnClickListener{
            onClickListener(movie)
        }

        calificationTextView.setOnClickListener {
            onClickListener(movie)
        }



    }
}

