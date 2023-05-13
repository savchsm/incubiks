package com.inkubiks.eventservice.di

import com.inkubiks.eventservice.viewmodel.ProfileViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

class AppModule {
    val appModule = module {
        viewModel { ProfileViewModel() }
    }
}