package com.example.patiskull.model

import androidx.lifecycle.ViewModel
import com.example.patiskull.data.Datasource

class SchoolViewModel : ViewModel() {

    // Map of School list
    private val schoolItems = Datasource.schoolMenus

    private var _schoolMenuLocations: List<SchoolMenu> = schoolItems.map { s -> s.second }
    val schoolMenuLocations: List<SchoolMenu>
        get() = _schoolMenuLocations

    private var _schoolDetail: SchoolMenu? = null
    val schoolDetail: SchoolMenu?
        get() = _schoolDetail

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
            .first { it.name.contains(item) && it.location.contains(_schoolMenuLocations[0].location) }
    }

}