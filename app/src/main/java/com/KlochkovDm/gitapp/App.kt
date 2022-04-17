package com.KlochkovDm.gitapp

import android.app.Application
import android.content.Context
import com.KlochkovDm.gitapp.domain.UserRepository
import com.KlochkovDm.gitapp.domain.MockUserRepositoryImpl

class App : Application() {
    val repository: UserRepository by lazy { MockUserRepositoryImpl() }
}
val Context.app: App
    get() = applicationContext as App