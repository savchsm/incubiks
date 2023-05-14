package com.inkubiks.eventservice.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import androidx.recyclerview.widget.LinearLayoutManager
import com.inkubiks.eventservice.R
import com.inkubiks.eventservice.adapters.RecommendedEventsAdapter
import com.inkubiks.eventservice.adapters.ScheduleEventsAdapter
import com.inkubiks.eventservice.databinding.FragmentHomeBinding
import com.inkubiks.eventservice.getDefaultEventsData
import com.inkubiks.eventservice.viewmodel.HomeViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel


class HomeFragment : Fragment() {

    private val viewModel: HomeViewModel by viewModel()
    private var binding: FragmentHomeBinding? = null
    private var scheduleEventsAdapter: ScheduleEventsAdapter? = null
    private var recommendedEventsAdapter: RecommendedEventsAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        scheduleEventsAdapter = ScheduleEventsAdapter(
            listener = object : ScheduleEventsAdapter.Listener {
                override fun onEventClicked() = findNavController().navigate(
                    R.id.eventFragment,
                    null,
                    navOptions {
                        anim {
                            enter = android.R.animator.fade_in
                            exit = android.R.animator.fade_out
                        }
                    }
                )
            }
        )
        recommendedEventsAdapter = RecommendedEventsAdapter(
            listener = object : RecommendedEventsAdapter.Listener {
                override fun onEventClicked() = findNavController().navigate(
                    R.id.eventFragment,
                    null,
                    navOptions {
                        anim {
                            enter = android.R.animator.fade_in
                            exit = android.R.animator.fade_out
                        }
                    }
                )
            }
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUI()
        setupObservers()

        scheduleEventsAdapter?.updateData(getDefaultEventsData())
        recommendedEventsAdapter?.updateData(getDefaultEventsData())
    }

    private fun setupUI() = binding?.apply {
        val llManagerScheduledEvents = LinearLayoutManager(context)
        llManagerScheduledEvents.orientation = LinearLayoutManager.HORIZONTAL
        rvScheduleEvents.apply {
            layoutManager = llManagerScheduledEvents
            adapter = scheduleEventsAdapter
        }

        val llManagerRecommendedEvents = LinearLayoutManager(context)
        llManagerRecommendedEvents.orientation = LinearLayoutManager.VERTICAL
        rvRecommendedEvents.apply {
            layoutManager = llManagerRecommendedEvents
            adapter = recommendedEventsAdapter
        }

        fabCreateEvent.setOnClickListener { findNavController().navigate(R.id.createEventFragment) }
    }

    private fun setupObservers() {}
}