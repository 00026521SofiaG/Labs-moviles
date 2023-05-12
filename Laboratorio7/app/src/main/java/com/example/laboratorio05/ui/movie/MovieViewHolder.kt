package com.example.laboratorio05.ui.movie

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio05.R
import com.example.laboratorio05.data.model.MovieModel
import org.w3c.dom.Text

class MovieViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
    private var nameTextView = itemView.findViewById<TextView>(R.id.movieTitle)
    private var calificationTextView = itemView.findViewById<TextView>(R.id.movieCalification)
    private var pictureImageView = itemView.findViewById<ImageView>(R.id.moviePicture)

    fun bind(movie:MovieModel){
        nameTextView.text = movie.name
        calificationTextView.text = movie.category

    }
}

