package com.nobrand.aptviewer.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.nobrand.aptviewer.databinding.FragmentViewerBinding
import com.nobrand.aptviewer.viewmodel.ViewerViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class ViewerFragment : Fragment() {

    companion object {
        fun newInstance() = ViewerFragment()
    }

    private lateinit var binding: FragmentViewerBinding

    private val viewModel: ViewerViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentViewerBinding.inflate(inflater, container, false)
        return binding.root
    }

}
