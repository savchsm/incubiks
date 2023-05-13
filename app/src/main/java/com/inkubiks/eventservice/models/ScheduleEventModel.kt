package com.inkubiks.eventservice.models

data class ScheduleEventModel(
    val id: String,
    val title: String,
    val image: Int? = null
)
