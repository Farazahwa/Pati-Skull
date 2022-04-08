package com.example.patiskull.model

import androidx.lifecycle.ViewModel
import com.example.patiskull.data.Datasource

class SchoolViewModel : ViewModel() {

    // Map of School list
    val schoolItems = Datasource.schoolMenus

    lateinit var schoolMenuLocations: List<SchoolMenu>
    lateinit var schoolDetail: List<SchoolMenu>

    fun getAllLocations() : List<String> {
        val locations = schoolItems
            .map { s -> s.second.location }
            .distinct()
        return locations
    }

    fun getAllSchoolFromLocation(item: String) {
        schoolMenuLocations = schoolItems
            .map { it.second}
            .filter { it.location == item }
    }

    fun getSchool(item: String) {
        schoolDetail = schoolItems
            .map { it.second }
            .filter { it.name == item && it.location == schoolMenuLocations[0].location }
    }

}