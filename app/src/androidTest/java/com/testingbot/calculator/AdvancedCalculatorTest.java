package com.testingbot.calculator;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class AdvancedCalculatorTest {

    /**
     * Use {@link ActivityScenarioRule} to create and launch the activity under test.
     */
    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule =
            new ActivityScenarioRule<MainActivity>(MainActivity.class);

    @Test
    @LargeTest
    public void ensureLargeNumbersWork() {
        // Type text and then press the button.
        onView(withId(R.id.but1)).perform(click());
        onView(withId(R.id.but0)).perform(click());
        onView(withId(R.id.but0)).perform(click());
        onView(withId(R.id.but0)).perform(click());
        onView(withId(R.id.but0)).perform(click());
        onView(withId(R.id.but0)).perform(click());
        onView(withId(R.id.but0)).perform(click());
        onView(withId(R.id.butdiv)).perform(click());
        onView(withId(R.id.but2)).perform(click());
        onView(withId(R.id.but0)).perform(click());
        onView(withId(R.id.but0)).perform(click());
        onView(withId(R.id.but0)).perform(click());
        onView(withId(R.id.buteq)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("50e.0")));
    }
}