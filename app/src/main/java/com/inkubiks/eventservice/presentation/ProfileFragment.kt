package com.inkubiks.eventservice.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.inkubiks.eventservice.R
import com.inkubiks.eventservice.databinding.FragmentProfileBinding
import com.inkubiks.eventservice.viewmodel.ProfileViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class ProfileFragment : Fragment() {

    private var binding: FragmentProfileBinding? = null
    private val viewModel: ProfileViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        uiListener()
        binding?.apply {
            tvNameUser.text = viewModel.value.name
            tvStatus.text = viewModel.value.status
            tvCity.text = viewModel.value.city
        }

    }

    private fun uiListener() {
        binding?.apply {
            ivSettings.setOnClickListener {

            }
            avatar.setOnClickListener {
            }
        }
    }

}
