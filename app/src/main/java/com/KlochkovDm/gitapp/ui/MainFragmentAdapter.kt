package com.KlochkovDm.gitapp.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.KlochkovDm.databinding.RecyclerItemBinding
import com.KlochkovDm.gitapp.domain.UserRepository
import com.KlochkovDm.gitapp.domain.entities.UserProfile

class MainFragmentAdapter: RecyclerView.Adapter<MainFragmentAdapter.MainFragmentViewHolder>() {

    private var userProfileList : List<UserProfile> = listOf()

    class MainFragmentViewHolder(private val binding: RecyclerItemBinding) :RecyclerView.ViewHolder(binding.root) {

        fun bind (userProfile: UserProfile) {
            binding.apply{
                recyclerItemText.text = userProfile.login
//                root.setOnClickListener()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainFragmentViewHolder {
        val binding = RecyclerItemBinding.inflate(
            LayoutInflater.from(
                parent.context
            ),
            parent,
            false
        )
        return MainFragmentViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainFragmentViewHolder, position: Int) {
        holder.bind(userProfileList[position])
    }

    override fun getItemCount(): Int {
        return userProfileList.size
    }
}