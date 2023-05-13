package com.inkubiks.eventservice.di

import com.inkubiks.eventservice.viewmodel.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val appModule = module {
    viewModel<HomeViewModel> { HomeViewModel() }
}