package com.example.patiskull.adapter

import android.content.Context
import android.location.Location
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.patiskull.R

class LocationAdapter(
    private val context: Context,
    ) : RecyclerView.Adapter<LocationAdapter.LocationViewHolder>() {

    val location = context.resources.getStringArray(R.array.locations).toList()

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
        holder.button.text = location.toString()
    }
}