package com.example.patiskull

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import com.example.patiskull.databinding.FragmentStartBinding
import com.example.patiskull.databinding.FragmentSummaryBinding
import com.example.patiskull.model.SchoolMenu

class SummaryFragment : Fragment() {
    private var binding: FragmentSummaryBinding? = null
    private  var sharedViewModel:LocationFragment by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentSummaryBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            val LifecycleOwner = viewLifecycleOwner

        }
    }

    fun sendDetail() {
        var orderSummary = getString(

        )
    }
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}