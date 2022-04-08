package com.example.patiskull

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.patiskull.adapter.LocationAdapter
import com.example.patiskull.data.Datasource
import com.example.patiskull.databinding.FragmentLocationBinding
import com.example.patiskull.model.SchoolViewModel

class DetailSchool : Fragment() {

    companion object {
        const val SEARCH_MAPS = "https://www.google.com/maps/place/"
    }


    private var _binding: FragmentLocationBinding? = null
    private val binding get() = _binding!!
    private lateinit var recyclerView: RecyclerView
    private val viewModel: SchoolViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLocationBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = LocationAdapter(viewModel)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun shareDetail(index: Int)  {
        holder.button.setOnClickListener {
            val queryUrl : Uri = Uri.parse("${SEARCH_MAPS}${viewModel.}")
            val intent = Intent(Intent.ACTION_VIEW, queryUrl)
            context.startActivity(intent)
        }
    }
}