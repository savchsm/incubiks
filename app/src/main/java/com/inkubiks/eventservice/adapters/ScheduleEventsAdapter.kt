package com.inkubiks.eventservice.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.inkubiks.eventservice.BindingViewHolder
import com.inkubiks.eventservice.databinding.ItemSheduleEventBinding
import com.inkubiks.eventservice.getRandomDrawableId
import com.inkubiks.eventservice.models.ScheduleEventModel
import com.inkubiks.eventservice.toBinding

class ScheduleEventsAdapter(
    private val listener: Listener
) : RecyclerView.Adapter<ScheduleEventsAdapter.EventViewHolder>() {

    private val eventsList: MutableList<ScheduleEventModel> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder =
        EventViewHolder(parent.toBinding())

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        holder.bind(eventsList[position])
    }

    override fun getItemCount(): Int = eventsList.size

    inner class EventViewHolder(binding: ItemSheduleEventBinding) :
        BindingViewHolder<ItemSheduleEventBinding>(binding) {

        init {
            binding.root.setOnClickListener { listener.onEventClicked() }
        }

        fun bind(event: ScheduleEventModel) = binding.apply {
            tvEventTitle.text = event.title
            Glide.with(context)
                .asDrawable()
                .load(getRandomDrawableId())
                .into(ivEventImage)
        }
    }

    fun updateData(list: List<ScheduleEventModel>) {
        eventsList.removeAll(list)
        notifyDataSetChanged()
    }

    interface Listener {
        fun onEventClicked()
    }
}