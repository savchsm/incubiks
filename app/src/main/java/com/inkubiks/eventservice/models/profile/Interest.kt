package com.inkubiks.eventservice.models.profile

data class Interest(
    val id: String,
    val name: String,
    val selected: Boolean = false,
)
