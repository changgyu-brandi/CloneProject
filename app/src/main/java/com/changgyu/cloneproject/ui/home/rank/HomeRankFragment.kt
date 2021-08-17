package com.changgyu.cloneproject.ui.home.rank

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.changgyu.cloneproject.R
import com.changgyu.cloneproject.databinding.FragmentHomeRankBinding

class HomeRankFragment : Fragment() {

    lateinit var binding: FragmentHomeRankBinding
    private val controller: HomeRankController by lazy{HomeRankController(requireContext())}
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home_rank, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val gl = GridLayoutManager(requireContext(),2 )

        controller.spanCount = 2
        gl.spanSizeLookup = controller.spanSizeLookup
        binding.rankRv.layoutManager = gl
        binding.rankRv.adapter = controller.adapter
        controller.setData()

    }

}