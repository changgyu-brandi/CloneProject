package com.changgyu.cloneproject.ui.mypage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.changgyu.cloneproject.R
import com.changgyu.cloneproject.databinding.FragmentBookmarkBinding
import com.changgyu.cloneproject.databinding.FragmentHomeBinding
import com.changgyu.cloneproject.databinding.FragmentMypageBinding

class MypageFragment: Fragment() {

    lateinit var binding: FragmentMypageBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_mypage, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}