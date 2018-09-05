package com.gpetuhov.android.sampletestingrobot.robots

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withText

fun result(func: ResultRobot.() -> Unit) = ResultRobot().apply { func() }

class ResultRobot {
    fun isSuccess(name: String) {
        onView(withText("Hello, $name!")).check(matches(isDisplayed()))
    }
}