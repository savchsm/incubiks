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

val defaultScheduleEvents = listOf<ScheduleEventModel>(
    ScheduleEventModel(
        id = UUID.randomUUID().toString(),
        title = "MeetUp Android Team"
    ),
    ScheduleEventModel(
        id = UUID.randomUUID().toString(),
        title = "Samokat.Tech"
    ),
    ScheduleEventModel(
        id = UUID.randomUUID().toString(),
        title = "Basketball"
    ),
    ScheduleEventModel(
        id = UUID.randomUUID().toString(),
        title = "CI/CD"
    ), ScheduleEventModel(
        id = UUID.randomUUID().toString(),
        title = "Head Conference"
    ),
    ScheduleEventModel(
        id = UUID.randomUUID().toString(),
        title = "Football"
    )
)

//defaultScheduleEvents.map { event ->
//    event.copy(
//        image = ContextCompat.getDrawable(
//            activity?.applicationContext ?: requireContext(),
//            getRandomDrawableId()
//        )
//    )
//},

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