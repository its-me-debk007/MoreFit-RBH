package com.example.morefit.database

import android.app.Application
import com.example.morefit.repositories.ContentRepo
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class ContentApplication : Application() {
    val applicationScope = CoroutineScope(SupervisorJob())
    val database by lazy { ContentRoomDatabase.getDatabase(this, applicationScope) }
    val repository by lazy { ContentRepo(database.wordDao()) }

    override fun onCreate() {
        super.onCreate()
//        val currentTime = Calendar.getInstance().time
//        val hour = currentTime.toString().substring(11, 13)
//        val min = currentTime.toString().substring(14, 16)

//        val defaultOptions = JitsiMeetConferenceOptions.Builder()
//            .setServerURL(URL(SERVER_URL))
//            .setFeatureFlag("welcomepage.enabled", false)
//            .build()
//
//        JitsiMeet.setDefaultConferenceOptions(defaultOptions)
    }
}
