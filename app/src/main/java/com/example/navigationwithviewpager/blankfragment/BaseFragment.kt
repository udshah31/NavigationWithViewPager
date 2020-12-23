package com.example.navigationwithviewpager.blankfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {

    @LayoutRes
    abstract fun getLayoutRes(): Int


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

//        println("🤣 ${this.javaClass.simpleName} #${this.hashCode()} onCreateView()")

        // Inflate the layout for this fragment
        return inflater.inflate(getLayoutRes(), container, false)
    }

}