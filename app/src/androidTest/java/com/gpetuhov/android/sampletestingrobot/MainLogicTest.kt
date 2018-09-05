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
        // The test knows nothing of the UI views, only business logic.
        // All implementation details are contained inside the robots.
        // We have 3 actions here:
        // 1. Enter user name
        // 2. Press Process button
        // 3. Check result
        // Because all details are implemented inside the robots,
        // and thanks to the convenience functions we have for each robot,
        // the tests remain clean and independent of the UI views.

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