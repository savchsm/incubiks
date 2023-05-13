package com.inkubiks.eventservice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.navigation.NavigationBarView
import com.inkubiks.eventservice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        NavigationBarView.OnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.action_home -> {
                    navController.navigate(R.id.homeFragment)
                    true
                }

                R.id.action_staff -> {
                    navController.navigate(R.id.staffFragment)
                    true
                }

                R.id.action_chat -> {
                    navController.navigate(R.id.chatFragment)
                    true
                }

                R.id.action_profile -> {
                    navController.navigate(R.id.profileFragment)
                    true
                }

                else -> false
            }
        }

        binding?.mainBottomNavigation?.getOrCreateBadge(R.id.action_chat)?.apply {
            isVisible = true
            number = 99
        }
    }
}