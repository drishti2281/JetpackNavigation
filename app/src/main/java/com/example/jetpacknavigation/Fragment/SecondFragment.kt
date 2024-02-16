package com.example.jetpacknavigation.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.jetpacknavigation.R
import com.example.jetpacknavigation.Fragments.SecondFragment
import com.example.jetpacknavigation.databinding.FragmentFirstBinding
import com.example.jetpacknavigation.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    var binding : FragmentSecondBinding?= null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.btnMovetothird?.setOnClickListener(){
            findNavController().navigate(R.id.thirdFragment)
        }

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SecondFragment.
         */

    }
}