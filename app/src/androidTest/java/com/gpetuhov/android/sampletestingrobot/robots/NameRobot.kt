package com.gpetuhov.android.sampletestingrobot.robots

import android.support.test.espresso.Espresso.closeSoftKeyboard
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.action.ViewActions.typeText
import android.support.test.espresso.matcher.ViewMatchers.withHint
import android.support.test.espresso.matcher.ViewMatchers.withText
import com.gpetuhov.android.sampletestingrobot.R

fun greeting(func: NameRobot.() -> Unit) = NameRobot().apply { func() }

class NameRobot {
    fun name(name: String) {
        onView(withHint(R.string.enter_name)).perform(typeText(name))
        closeSoftKeyboard()
    }

    fun process() {
        onView(withText(R.string.process)).perform(click())
    }
}