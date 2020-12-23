package com.example.navigationwithviewpager.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.navigationwithviewpager.blankfragment.DashboardFragment1
import com.example.navigationwithviewpager.blankfragment.HomeFragment1
import com.example.navigationwithviewpager.blankfragment.NotificationFragment1

class ChildFragmentStateAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
        FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {

        return when (position) {
            0 -> HomeFragment1()
            1 -> DashboardFragment1()
            else -> NotificationFragment1()
        }
    }

}