package com.inkubiks.eventservice.presentation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.bumptech.glide.Glide
import com.inkubiks.eventservice.databinding.FragmentGuestProfileBinding
import com.inkubiks.eventservice.models.profile.Profile
import com.inkubiks.eventservice.viewmodel.GuestProfileViewModel

class GuestProfileFragment : Fragment() {

    private var binding: FragmentGuestProfileBinding? = null
    private val viewModel: GuestProfileViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGuestProfileBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val guestProfile = arguments?.getParcelable(DATA_GUEST_PROFILE_ARG) as? Profile
        guestProfile?.let {
            viewModel.setData(it)
        }
        binding?.apply {
            viewModel.questProfile.observe(viewLifecycleOwner) { profile ->
                if (profile.isGuest) {
                    headProfile.ivBack.visibility = View.VISIBLE
                    headProfile.ivSettings.visibility = View.INVISIBLE
                }
                Glide.with(this@GuestProfileFragment)
                    .load(profile.avatar)
                    .override(250, 250)
                    .circleCrop()
                    .into(headProfile.avatar)
                headProfile.tvNameUser.text = profile.name
                headProfile.tvStatus.text = profile.status
                headProfile.tvCity.text = profile.city
            }
        }
    }


    companion object {
        const val DATA_GUEST_PROFILE_ARG = "data_guest_profile_arg"
    }
}