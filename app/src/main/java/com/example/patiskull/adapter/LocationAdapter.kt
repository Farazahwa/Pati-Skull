package com.example.patiskull.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.patiskull.LocationFragment
import com.example.patiskull.R
import com.example.patiskull.model.SchoolViewModel

class LocationAdapter (
    private val shareViewModel: SchoolViewModel
        )
    : RecyclerView.Adapter<LocationAdapter.LocationViewHolder>() {

    val location = shareViewModel.getAllLocations().toList()

    class LocationViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val button = view.findViewById<Button>(R.id.button_item)
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
        holder.button.text = location.toString()

        holder.button.text = item.toString()

        holder.view.setOnClickListener {
            shareViewModel.getSchoolFromLocation(item)
            holder.view.findNavController().navigate(R.id.action_locationFragment_to_schoolFragment2)
        }
    }
}