package com.inkubiks.eventservice.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.inkubiks.eventservice.R
import com.inkubiks.eventservice.adapters.ListAvatarUser
import com.inkubiks.eventservice.databinding.FragmentProfileBinding
import com.inkubiks.eventservice.viewmodel.ProfileViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class ProfileFragment : Fragment() {

    private var binding: FragmentProfileBinding? = null
    private val viewModel: ProfileViewModel by viewModel()
    private var teamAdapter: ListAvatarUser? = null
    private var friendsAdapter: ListAvatarUser? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        teamAdapter = ListAvatarUser()
        friendsAdapter = ListAvatarUser()
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
        initTeamRecyclerView()
        initFriendsRecyclerView()
        binding?.apply {
            Glide.with(this@ProfileFragment)
                .load(viewModel.value.avatar)
                .override(250, 250)
                .circleCrop()
                .into(avatar)
            tvNameUser.text = viewModel.value.name
            tvStatus.text = viewModel.value.status
            tvCity.text = viewModel.value.city
        }
        teamAdapter?.setData(viewModel.value.team)
        friendsAdapter?.setData(viewModel.value.friends)
    }

    private fun initTeamRecyclerView() {
        val linearLayoutManager = LinearLayoutManager(context)
        linearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        binding?.rvTeam?.apply {
            layoutManager = linearLayoutManager
            adapter = teamAdapter
        }
    }

    private fun initFriendsRecyclerView() {
        val linearLayoutManager = LinearLayoutManager(context)
        linearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        binding?.rvFriends?.apply {
            layoutManager = linearLayoutManager
            adapter = friendsAdapter
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
