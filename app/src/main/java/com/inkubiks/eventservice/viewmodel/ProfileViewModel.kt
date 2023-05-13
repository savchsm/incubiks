package com.inkubiks.eventservice.viewmodel

import androidx.lifecycle.ViewModel
import com.inkubiks.eventservice.R
import com.inkubiks.eventservice.models.profile.Profile
import com.inkubiks.eventservice.models.profile.Status


private val userProfile = Profile(
    id = "1",
    name = "Зарипов Тимур",
    avatar = R.drawable.man1,
    status = Status.ONLINE.value,
    city = "Томск",
    points = 400,
    isTeamLead = false,
    department = "Отдел разработки",
    position = "Android Developer",
    experience = "1 год 9 месяцев",
    team = listOf(),
    friends = listOf(),
    isGuest = false,
    interests = listOf()
)


class ProfileViewModel: ViewModel() {

    val value = userProfile

}