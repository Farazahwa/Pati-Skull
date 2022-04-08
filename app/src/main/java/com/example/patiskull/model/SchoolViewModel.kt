package com.example.patiskull.model

import androidx.lifecycle.ViewModel
import com.example.patiskull.data.Datasource

class SchoolViewModel : ViewModel() {

    // Map of School list
    val schoolItems = Datasource.schoolMenus

    private lateinit var _schoolMenuLocations: List<SchoolMenu>
    val schoolMenuLocations: List<SchoolMenu> = _schoolMenuLocations

    private lateinit var _schoolDetail: List<SchoolMenu>

    fun getAllLocations() : List<String> {
        val locations = schoolItems
            .map { s -> s.second.location }
            .distinct()
        return locations
    }

    fun getAllSchoolFromLocation(item: String) {
        _schoolMenuLocations = schoolItems
            .map { it.second}
            .filter { it.location == item }
    }

    fun getSchool(item: String) {
        _schoolDetail = schoolItems
            .map { it.second }
            .filter { it.name == item && it.location == _schoolMenuLocations[0].location }
    }

}