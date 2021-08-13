package com.changgyu.cloneproject.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.changgyu.cloneproject.R
import com.changgyu.cloneproject.databinding.FragmentHomeBinding
import com.changgyu.cloneproject.ui.home.infant.HomeInfantFragment
import com.changgyu.cloneproject.ui.home.life.HomeLifeFragment
import com.changgyu.cloneproject.ui.home.rank.HomeRankFragment
import com.google.android.material.tabs.TabLayoutMediator
import java.util.HashMap

class HomeFragment: Fragment() {

    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentMap: HashMap<Int, Pair<String, Fragment>> = HashMap()
        fragmentMap[0] = Pair("Rank", HomeRankFragment())
        fragmentMap[1] = Pair("Life", HomeLifeFragment())
        fragmentMap[2] = Pair("Infant", HomeInfantFragment())

        binding.tabPager.apply {
            adapter = HomePagerAdapter(requireActivity(), fragmentMap)
            currentItem = 0
        }

        TabLayoutMediator(binding.tabLayout, binding.tabPager){tab, position->
            tab.text = fragmentMap[position]?.first
        }.attach()
    }

}