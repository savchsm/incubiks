package com.inkubiks.eventservice.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.inkubiks.eventservice.R
import com.inkubiks.eventservice.databinding.FragmentEventBinding
import com.inkubiks.eventservice.databinding.FragmentHomeBinding


class EventFragment : Fragment() {

    private var binding: FragmentEventBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEventBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUI()
    }

    private fun setupUI() {
        binding?.topAppBar?.setNavigationOnClickListener { findNavController().navigateUp() }
    }
    private fun setupObservers() {}
}