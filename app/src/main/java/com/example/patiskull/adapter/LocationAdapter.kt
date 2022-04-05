package com.example.patiskull.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.patiskull.R
import com.example.patiskull.model.SchoolViewModel

class LocationAdapter
    : RecyclerView.Adapter<LocationAdapter.LocationViewHolder>() {

    private val shareViewModel = SchoolViewModel()
    val location = shareViewModel.getAllLocations().toList()

    class LocationViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val button = view.findViewById<Button>(R.id.button_location)
    }

    override fun getItemCount(): Int {
        return location.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LocationViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return LocationViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: LocationViewHolder, position: Int) {
        val item = location[position]
        holder.button.text = item.toString()
    }
}