package com.testingbot.calculator;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.filters.MediumTest;
import androidx.test.filters.SmallTest;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class CalculatorTest {

    /**
     * Use {@link ActivityScenarioRule} to create and launch the activity under test.
     */
    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule =
            new ActivityScenarioRule<MainActivity>(MainActivity.class);

    @Before
    public void clear()
    {
        onView(withId(R.id.butclear)).perform(click());
    }

    @Test
    public void ensureButtonsWork() {
        // Type text and then press the button.
        onView(withId(R.id.but1)).perform(click());
        onView(withId(R.id.but2)).perform(click());

        // Check that the text was changed.
        onView(withId(R.id.output)).check(matches(withText("12")));
    }

    @Test
    public void ensureAdditionWorks() {
        // Type text and then press the button.
        onView(withId(R.id.but3)).perform(click());
        onView(withId(R.id.butplus)).perform(click());
        onView(withId(R.id.but5)).perform(click());
        onView(withId(R.id.buteq)).perform(click());

        // Check that the text was changed.
        onView(withId(R.id.output)).check(matches(withText("8.0")));
    }

    @Test
    @SmallTest
    public void ensureMultiplicationWorks() {
        // Type text and then press the button.
        onView(withId(R.id.but8)).perform(click());
        onView(withId(R.id.butmul)).perform(click());
        onView(withId(R.id.but9)).perform(click());
        onView(withId(R.id.buteq)).perform(click());

        // Check that the text was changed.
        onView(withId(R.id.output)).check(matches(withText("72.0")));
    }

    @Test
    @MediumTest
    public void ensureClearWorks() {
        // Type text and then press the button.
        onView(withId(R.id.but8)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("8")));
        onView(withId(R.id.butclear)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("")));
    }

    @Test
    @LargeTest
    public void ensureDivideWorks() {
        // Type text and then press the button.
        onView(withId(R.id.but1)).perform(click());
        onView(withId(R.id.but0)).perform(click());
        onView(withId(R.id.but0)).perform(click());
        onView(withId(R.id.butdiv)).perform(click());
        onView(withId(R.id.but2)).perform(click());
        onView(withId(R.id.buteq)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("50.0")));
    }
}