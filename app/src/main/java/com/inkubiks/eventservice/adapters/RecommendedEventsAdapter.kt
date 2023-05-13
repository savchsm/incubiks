package com.inkubiks.eventservice.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.inkubiks.eventservice.BindingViewHolder
import com.inkubiks.eventservice.databinding.ItemRecommendedEventBinding
import com.inkubiks.eventservice.databinding.ItemScheduleEventBinding
import com.inkubiks.eventservice.models.ScheduleEventModel
import com.inkubiks.eventservice.toBinding

class RecommendedEventsAdapter(
    private val listener: Listener
) : RecyclerView.Adapter<RecommendedEventsAdapter.EventViewHolder>() {

    private val eventsList: MutableList<ScheduleEventModel> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder =
        EventViewHolder(parent.toBinding())

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        holder.bind(eventsList[position])
    }

    override fun getItemCount(): Int = eventsList.size

    inner class EventViewHolder(binding: ItemRecommendedEventBinding) :
        BindingViewHolder<ItemRecommendedEventBinding>(binding) {

        init {
            binding.root.setOnClickListener { listener.onEventClicked() }
        }

        fun bind(event: ScheduleEventModel) = binding.apply {
            tvEventTitle.text = event.title
            tvEventDescription.text = event.description
            Glide.with(context).load(event.image).into(ivEventImage)
        }
    }

    fun updateData(list: List<ScheduleEventModel>) {
        eventsList.clear()
        eventsList.addAll(list)
        notifyDataSetChanged()
    }

    interface Listener {
        fun onEventClicked()
    }
}