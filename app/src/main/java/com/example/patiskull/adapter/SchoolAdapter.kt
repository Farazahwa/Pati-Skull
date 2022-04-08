package com.example.patiskull.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.patiskull.R
import com.example.patiskull.model.SchoolViewModel

class SchoolAdapter (
    private val shareViewModel: SchoolViewModel
        )
    : RecyclerView.Adapter<SchoolAdapter.SchoolViewHolder>() {

    private val school = shareViewModel.school

    class SchoolViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val button = view.findViewById<Button>(R.id.button_item)
    }

    override fun getItemCount(): Int {
        return school.size
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SchoolAdapter.SchoolViewHolder {
        val adapterLayout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.list_item, parent,false)
        return SchoolViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: SchoolAdapter.SchoolViewHolder, position: Int) {
        val item = school[position].name
        holder.button.text = item.toString()
    }
}