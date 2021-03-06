package com.example.ezequiel.unittests1.espresso;

import android.app.Activity;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.example.ezequiel.unittests1.main.MainActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class HelloWorldEspressoTest {

    @Rule
    public ActivityTestRule<MainActivity> myActivityRule = new ActivityTestRule(MainActivity.class);

    //use @Before to setup your test fixture
    @Before
    public void setUp() {  }

    @Test
    public void listGoesOverTheFold(){
        onView(withText("Hello World")).check(matches(isDisplayed()));
    }

    @After
    public void tearDown() {  }
}
