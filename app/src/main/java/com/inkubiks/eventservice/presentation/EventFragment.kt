package com.inkubiks.eventservice.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.google.android.material.badge.BadgeUtils
import com.google.android.material.snackbar.Snackbar
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
        binding?.apply {
            topAppBar.setNavigationOnClickListener { findNavController().navigateUp() }
            Glide.with(requireContext())
                .load(R.drawable.woman2)
                .circleCrop()
                .into(ivParticipant1)
            Glide.with(requireContext())
                .load(R.drawable.man3)
                .circleCrop()
                .into(ivParticipant2)

            btnAcceptEvent.setOnClickListener {
                Snackbar.make(it, "Вы идете на мероприятие", Snackbar.LENGTH_LONG)
                    .setAnchorView(btnAcceptEvent)
                    .setAction("Позвать друзей") {}
                    .show()
            }
            btnDeclineEvent.setOnClickListener {
                Snackbar.make(it, "Мероприятие отклонено", Snackbar.LENGTH_LONG).show()
            }
        }
    }

    private fun setupObservers() {}
}