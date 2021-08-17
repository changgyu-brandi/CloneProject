package com.changgyu.cloneproject.ui.home.life

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import com.changgyu.cloneproject.MainActivity
import com.changgyu.cloneproject.MainActivity.Companion.rootNavController
import com.changgyu.cloneproject.R
import com.changgyu.cloneproject.databinding.FragmentHomeBinding
import com.changgyu.cloneproject.databinding.FragmentHomeLifeBinding

class HomeLifeFragment: Fragment() {

    lateinit var binding: FragmentHomeLifeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home_life, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textView.setOnClickListener {

            rootNavController()?.navigate(R.id.action_to_mypageFragment)
//            findNavController().navigate(R.id.action_to_mypageFragment)
        }

    }

}