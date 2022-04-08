package com.example.patiskull

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.patiskull.model.SchoolViewModel
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Test
    fun SchoolFragmentTest() {
        val viewModel = SchoolViewModel()
        viewModel.getAllSchoolFromLocation(item = "Sukolilo")
        assertEquals( "SD Negeri Gelur" , viewModel._schoolMenuLocations[0].name)
    }

}