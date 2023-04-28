package com.example.lab_05.ui.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import com.example.lab_05.R
import com.google.android.material.floatingactionbutton.FloatingActionButton


class FirstFragment : Fragment() {

    private lateinit var btnActionSend : FloatingActionButton
    private lateinit var cardViewStarWars: CardView

    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnActionSend= view.findViewById(R.id.btnActionSend)
        cardViewStarWars=view.findViewById(R.id.cardView_starWars)

        btnActionSend.setOnClickListener{
            it.findNavController().navigate(R.id.action_firstFragment_to_secondFragment)

        }

        cardViewStarWars.setOnClickListener{
            it.findNavController().navigate(R.id.action_firstFragment_to_thirdFragment)
        }
    }
}