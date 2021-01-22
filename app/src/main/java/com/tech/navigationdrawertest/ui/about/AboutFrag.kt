package com.tech.navigationdrawertest.ui.about

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tech.navigationdrawertest.R

class AboutFrag: Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       var view= LayoutInflater.from(context).inflate(R.layout.fragment_about,container,false)


        //logic will execute after clicking on about option



        return  view }
}