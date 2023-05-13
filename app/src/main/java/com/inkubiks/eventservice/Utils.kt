package com.inkubiks.eventservice

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.inkubiks.eventservice.models.ScheduleEventModel
import java.util.UUID

fun getRandomDrawableId(): Int = listOf(
    R.drawable.def_picture_1,
    R.drawable.def_picture_2,
    R.drawable.def_picture_3,
    R.drawable.def_picture_4
).random()

fun getRandomEventTitle(): String = listOf(
    "MeetUp Android Team", "Samokat.Tech", "Basketball", "CI/CD", "Head Conference", "Football"
).random()

fun getDefaultEventsData(): List<ScheduleEventModel> {
    val list: MutableList<ScheduleEventModel> = mutableListOf()
    repeat(10) {
        list.add(
            ScheduleEventModel(
                id = UUID.randomUUID().toString(),
                title = getRandomEventTitle(),
                image = getRandomDrawableId()
            )
        )
    }
    return list
}

inline fun <reified V : ViewBinding> ViewGroup.toBinding(): V {
    return V::class.java.getMethod(
        "inflate",
        LayoutInflater::class.java,
        ViewGroup::class.java,
        Boolean::class.java
    ).invoke(null, LayoutInflater.from(context), this, false) as V
}

open class BindingViewHolder<VB : ViewBinding>(val binding: VB) :
    RecyclerView.ViewHolder(binding.root) {
    val context: Context = binding.root.context
}