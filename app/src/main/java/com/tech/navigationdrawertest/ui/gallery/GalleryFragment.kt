package com.tech.navigationdrawertest.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.tech.navigationdrawertest.R

class GalleryFragment : Fragment() {


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
      var inflater=LayoutInflater.from(context)
      var view=  inflater.inflate(R.layout.fragment_gallery,container,false)




        return view
    }
}