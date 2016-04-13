package com.emilychen.cse110lab3.tests;

import android.test.ActivityInstrumentationTestCase2;

import com.emilychen.cse110lab3.MainActivity;

/**
 * Created by emilychen on 4/13/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;
    public JUnit_test() {

        super(MainActivity.class);
    }

    public void test_Difference() {
        mainActivity = getActivity();

        int one = 30;
        int two = 15;

        int three = mainActivity.difference(one, two);
        assertEquals(15, three);
    }
}
