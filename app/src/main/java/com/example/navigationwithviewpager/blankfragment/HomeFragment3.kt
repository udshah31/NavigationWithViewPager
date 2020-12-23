package com.example.navigationwithviewpager.blankfragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.navigationwithviewpager.R

class HomeFragment3 : BaseFragment() {

    override fun getLayoutRes(): Int = R.layout.fragment_home3

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        view.findViewById<Button>(R.id.btnGoToStart).setOnClickListener {
            findNavController().navigate(R.id.action_global_start)
        }

    }
}