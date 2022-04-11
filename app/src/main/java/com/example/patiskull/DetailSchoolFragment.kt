package com.example.patiskull

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.patiskull.databinding.FragmentDetailSchoolBinding
import com.example.patiskull.model.SchoolViewModel

class DetailSchoolFragment : Fragment() {

    companion object {
        const val SEARCH_MAPS = "geo:0,0?q="
    }

    private var _binding: FragmentDetailSchoolBinding? = null
    private val binding get() = _binding!!
    private val shareViewModel: SchoolViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailSchoolBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            viewModel = shareViewModel
            detailFragment = this@DetailSchoolFragment
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun shareDetail(name: String)  {
        val queryUrl : Uri = Uri.parse("${SEARCH_MAPS}${name}")
        val intent = Intent(Intent.ACTION_VIEW, queryUrl)
        intent.setPackage("com.google.android.apps.maps")
        context?.startActivity(intent)
    }
}