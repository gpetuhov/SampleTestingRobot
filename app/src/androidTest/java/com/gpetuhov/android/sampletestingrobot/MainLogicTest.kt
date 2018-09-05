package com.gpetuhov.android.sampletestingrobot

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.gpetuhov.android.sampletestingrobot.robots.greeting
import com.gpetuhov.android.sampletestingrobot.robots.result
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainLogicTest {

    // In Kotlin we have to annotate activityTestRule like this
    @get:Rule
    var activityTestRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun enterNameSuccess() {
        // The test must know nothing of the UI views, only business logic

        val user = "Bob"

        greeting {
            name(user)
            process()
        }

        result {
            isSuccess(user)
        }
    }
}