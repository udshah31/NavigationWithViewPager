package com.example.navigationwithviewpager.blankfragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.navigationwithviewpager.R
import com.example.navigationwithviewpager.adapter.HomeAdapter
import com.example.navigationwithviewpager.model.User

class HomeFragment1 : BaseFragment() {

    override fun getLayoutRes(): Int = R.layout.fragment_home1

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = HomeAdapter()
        val recyclerView = view.findViewById<RecyclerView>(R.id.rv_home)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 2, LinearLayoutManager.VERTICAL, false)

        val users = ArrayList<User>()
        users.add(User("uday", R.drawable.avatar_1_raster))
        users.add(User("uday", R.drawable.avatar_2_raster))
        users.add(User("uday", R.drawable.avatar_3_raster))
        users.add(User("uday", R.drawable.avatar_4_raster))
        users.add(User("uday", R.drawable.avatar_5_raster))
        users.add(User("uday", R.drawable.avatar_6_raster))

        adapter.setData(users)

        adapter.setOnItemClickListener {
            Toast.makeText(requireContext(), "$it", Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.action_viewPagerContainerFragment_to_homeFragment2)
        }

        view.findViewById<Button>(R.id.btnNextPage).setOnClickListener {
            findNavController().navigate(R.id.action_viewPagerContainerFragment_to_homeFragment2)
        }
    }
}