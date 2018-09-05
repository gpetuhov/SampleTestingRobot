package com.gpetuhov.android.sampletestingrobot.robots

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withText

// Here we also have a convenience function for the result robot
fun result(func: ResultRobot.() -> Unit) = ResultRobot().apply { func() }

// Robot for the screen after greeting is displayed
class ResultRobot {
    // Check if greeting is displayed
    fun isSuccess(name: String) {
        onView(withText("Hello, $name!")).check(matches(isDisplayed()))
    }
}