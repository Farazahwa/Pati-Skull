package com.example.patiskull

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.patiskull.model.SchoolViewModel
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

@RunWith(AndroidJUnit4::class)
class ExampleUnitTest {
    @Test
    fun SchoolFragmentTest() {
        val viewModel = SchoolViewModel()
        viewModel.getAllSchoolFromLocation(item = "Sukolilo")
        assert( viewModel.schoolMenuLocations.map { it.name }.contains("SD Negeri Gelur"))
    }

    @Test
    fun setSchoolDetail() {
        val viewModel = SchoolViewModel()
        viewModel.getSchool(item = "SD Negeri Gelur")
        assert ( viewModel.)
    }
}