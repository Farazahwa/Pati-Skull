package com.example.patiskull.model

import androidx.lifecycle.ViewModel
import com.example.patiskull.data.Datasource

class SchoolViewModel : ViewModel() {

    // Map of School list
    val schoolItems = Datasource.schoolMenus

    private var _schoolMenuLocations: List<SchoolMenu> = schoolItems.map { s -> s.second }
    val schoolMenuLocations: List<SchoolMenu> = _schoolMenuLocations

    private var _schoolDetail: List<SchoolMenu> = schoolItems.map { s -> s.second }
    val schoolDetail: List<SchoolMenu> = _schoolDetail

    fun getAllLocations() : List<String> {
        val locations = schoolItems
            .map { s -> s.second.location }
            .distinct()
        return locations
    }

    fun setAllSchoolFromLocation(item: String) {
        _schoolMenuLocations = schoolItems
            .map { it.second}
            .filter { it.location == item }
    }

    fun setSchool(item: String) {
        _schoolDetail = schoolItems
            .map { it.second }
            .filter { it.name == item && it.location == _schoolMenuLocations[0].location }
    }

}