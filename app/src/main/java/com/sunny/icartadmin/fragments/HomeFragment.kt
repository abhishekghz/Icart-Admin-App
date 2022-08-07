package com.sunny.icartadmin.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.sunny.icartadmin.R
import com.sunny.icartadmin.activity.AllOrderActivity
import com.sunny.icartadmin.databinding.FragmentHomeBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class HomeFragment : Fragment() {

    private lateinit var binding : FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater)


        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_categoryFragment)
        }

        binding.button2.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_productFragment)
        }

        binding.button3.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_sliderFragment)
        }

        binding.button4.setOnClickListener {
            startActivity(Intent(requireContext(), AllOrderActivity::class.java))
        }


        return binding.root
    }


}