package com.testingbot.calculator;

import android.Manifest;
import android.util.Log;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.filters.MediumTest;
import androidx.test.filters.SmallTest;
import androidx.test.rule.GrantPermissionRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;
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

    @Rule
    public RuleChain screenshotRule = RuleChain
            .outerRule(GrantPermissionRule.grant(Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE))
            .around(activityScenarioRule);

    @Before
    public void clear()
    {
        onView(withId(R.id.butclear)).perform(click());
    }


    private void takeActivityScreenshot(String tag) {
        try {
            NativeScreenshot.capture(tag);
        } catch (Exception e) {
            Log.e(CalculatorTest.class.toString(), e.getMessage(), e);
        }
    }

    @Test
    public void ensureButtonsWork() {
        takeActivityScreenshot("buttons_work");
        // Type text and then press the button.
        onView(withId(R.id.but1)).perform(click());
        onView(withId(R.id.but2)).perform(click());

        // Check that the text was changed.
        onView(withId(R.id.output)).check(matches(withText("12")));
    }

    @Test
    public void ensureAdditionWorks() {
        takeActivityScreenshot("addition_works");
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
        takeActivityScreenshot("multiplication_works");
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
        takeActivityScreenshot("clear_works");
        // Type text and then press the button.
        onView(withId(R.id.but8)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("8")));
        onView(withId(R.id.butclear)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("")));
    }

    @Test
    @LargeTest
    public void ensureDivideWorks() {
        takeActivityScreenshot("divide_works");
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