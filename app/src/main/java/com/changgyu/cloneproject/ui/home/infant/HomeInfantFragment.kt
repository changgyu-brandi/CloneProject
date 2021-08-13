package com.changgyu.cloneproject.ui.home.infant

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.changgyu.cloneproject.R
import com.changgyu.cloneproject.databinding.FragmentHomeBinding
import com.changgyu.cloneproject.databinding.FragmentHomeInfantBinding

class HomeInfantFragment: Fragment() {

    lateinit var binding: FragmentHomeInfantBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home_infant, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

}