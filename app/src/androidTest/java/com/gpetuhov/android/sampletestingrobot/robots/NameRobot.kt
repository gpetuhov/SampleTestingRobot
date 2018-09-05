package com.gpetuhov.android.sampletestingrobot.robots

import android.support.test.espresso.Espresso.closeSoftKeyboard
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.action.ViewActions.typeText
import android.support.test.espresso.matcher.ViewMatchers.withHint
import android.support.test.espresso.matcher.ViewMatchers.withText
import com.gpetuhov.android.sampletestingrobot.R

// This function is needed for convenience.
// It helps to get rid of the robot instantiation inside the test class.
// The function takes function literal with the receiver as a parameter,
// which is then applied to the robot instance.
fun greeting(func: NameRobot.() -> Unit) = NameRobot().apply { func() }

// Tests must contain robots for every app screen.
// This is the robot for the screen before greeting is displayed.
// All Espresso details go here.
class NameRobot {
    // Enter user name
    fun name(name: String) {
        onView(withHint(R.string.enter_name)).perform(typeText(name))
        closeSoftKeyboard()
    }

    // Press the button
    fun process() {
        onView(withText(R.string.process)).perform(click())
    }
}