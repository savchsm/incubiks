package com.inkubiks.eventservice.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.inkubiks.eventservice.adapters.ScheduleEventsAdapter
import com.inkubiks.eventservice.databinding.FragmentHomeBinding
import com.inkubiks.eventservice.defaultScheduleEvents
import com.inkubiks.eventservice.getRandomDrawableId
import com.inkubiks.eventservice.viewmodel.HomeViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel


class HomeFragment : Fragment() {

    private val viewModel: HomeViewModel by viewModel()
    private var binding: FragmentHomeBinding? = null
    private var scheduleEventsAdapter: ScheduleEventsAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        scheduleEventsAdapter = ScheduleEventsAdapter(
            listener = object : ScheduleEventsAdapter.Listener {
                override fun onEventClicked() {}
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

        scheduleEventsAdapter?.updateData(
            defaultScheduleEvents.map {
                it.copy(image = getRandomDrawableId())
            }
        )
    }

    private fun setupUI() = binding?.apply {
        val linearLayoutManager = LinearLayoutManager(context)
        linearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        rvScheduleEvents.apply {
            layoutManager = linearLayoutManager
            adapter = scheduleEventsAdapter
        }
    }

    private fun setupObservers() {}
}