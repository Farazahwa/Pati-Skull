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
        viewModel.setAllSchoolFromLocation(item = "Sukolilo")
        assert( viewModel.schoolMenuLocations.map { it.name }.contains("SD Negeri Gelur"))
    }

    @Test
    fun setSchoolDetail() {
        val viewModel = SchoolViewModel()
        viewModel.setAllSchoolFromLocation(item = "Sukolilo")
        viewModel.setSchool(item = "SD Negeri Gelur")
        assert ( viewModel.schoolDetail.map { it.NPSN }.contains(20317109))
    }
}