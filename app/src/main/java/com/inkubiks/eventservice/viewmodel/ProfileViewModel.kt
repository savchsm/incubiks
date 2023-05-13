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
    team = listOf(
        Profile(
            id = "1",
            name = "Зарипов Тимур",
            avatar = R.drawable.man5,
            status = Status.ONLINE.value,
            city = "Томск",
            points = 400,
            isTeamLead = true,
            department = "Отдел разработки",
            position = "Android Developer",
            experience = "1 год 9 месяцев",
            team = listOf(),
            friends = listOf(),
            isGuest = false,
            interests = listOf()
        ),
        Profile(
            id = "7",
            name = "Зарипов Тимур",
            avatar = R.drawable.man2,
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
    ),
    friends = listOf(
        Profile(
            id = "9",
            name = "Зарипов Тимур",
            avatar = R.drawable.man3,
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
        ),
        Profile(
            id = "9",
            name = "Зарипов Тимур",
            avatar = R.drawable.man4,
            status = Status.OFFLINE.value,
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
        ),
        Profile(
            id = "10",
            name = "Зарипов ",
            avatar = R.drawable.woman1,
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
    ),
    isGuest = false,
    interests = listOf()
)


class ProfileViewModel: ViewModel() {

    val value = userProfile

}