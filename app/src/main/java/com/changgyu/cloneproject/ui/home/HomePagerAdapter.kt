package com.changgyu.cloneproject.ui.home

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.changgyu.cloneproject.ui.home.rank.HomeRankFragment
import java.util.*


class HomePagerAdapter(fragmentActivity: FragmentActivity,
                       private val fragmentMap: HashMap<Int, Pair<String, Fragment>>
) : FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): Fragment {
        return fragmentMap[position]?.second ?: HomeRankFragment()
    }

    override fun getItemCount(): Int {
        return fragmentMap.size
    }

}
