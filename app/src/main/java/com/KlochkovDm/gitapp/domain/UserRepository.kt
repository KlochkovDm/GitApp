package com.KlochkovDm.gitapp.domain

import com.KlochkovDm.gitapp.domain.entities.UserProfile

interface UserRepository {
        fun getUserList() : List<UserProfile>
}
