package com.example.patiskull.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.patiskull.data.Datasource

class SchoolViewModel : ViewModel() {

    // Map of School list
    val schoolItems = Datasource.schoolMenus

    lateinit var school: List<SchoolMenu>

    fun getAllLocations() : List<String> {
        val locations = schoolItems
            .map { s -> s.second.location }
            .distinct()
        return locations
    }

    fun getSchoolFromLocation(item: String) {
        school = schoolItems
            .map { it.second}
            .filter { it.location == item }
    }

}