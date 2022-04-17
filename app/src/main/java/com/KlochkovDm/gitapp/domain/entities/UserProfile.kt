package com.KlochkovDm.gitapp.domain.entities

    data class UserProfile (
        val login: String,
        val avatarUrl: String,
        val repoList: List<String>
    )