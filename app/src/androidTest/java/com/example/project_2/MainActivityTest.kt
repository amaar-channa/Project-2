package com.example.project_2

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun validateTextViewText() {
        onView(withId(R.id.changeTextView)).check(matches(withText("Text")))
    }

    @Test
    fun validateEditText() {
        onView(withId(R.id.changeEditText)).perform(typeText("123"))
        onView(withId(R.id.changeTextBtn)).perform(click())
        onView(withId(R.id.changeTextView)).check(matches(withText("123")))
    }

    @Test
    fun validateEditTextInDisplayTextActivity() {
        onView(withId(R.id.changeEditText)).perform(typeText("123"))
        onView(withId(R.id.openActivityBtn)).perform(click())
        onView(withId(R.id.nameTextView)).check(matches(withText("123")))
    }

    @Test
    fun validateEmptyEditText() {
        onView(withId(R.id.changeTextBtn)).perform(click())
        onView(withId(R.id.changeTextView)).check(matches(withText("")))
    }

    @Test
    fun validateEmptyEditTextInDisplayTextActivity() {
        onView(withId(R.id.openActivityBtn)).perform(click())
        onView(withId(R.id.nameTextView)).check(matches(withText("")))
    }

    @Test
    fun validateEditTextWithAlphabets() {
        onView(withId(R.id.changeEditText)).perform(typeText("abcdef"))
        onView(withId(R.id.changeTextBtn)).perform(click())
        onView(withId(R.id.changeTextView)).check(matches(withText("abcdef")))
    }

    @Test
    fun validateEditTextWithAlphabetsInDisplayTextActivity() {
        onView(withId(R.id.changeEditText)).perform(typeText("abcdef"))
        onView(withId(R.id.openActivityBtn)).perform(click())
        onView(withId(R.id.nameTextView)).check(matches(withText("abcdef")))
    }
}
