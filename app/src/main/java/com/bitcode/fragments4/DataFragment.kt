package com.bitcode.fragments4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bitcode.fragments4.databinding.DataFragmentBinding

class DataFragment : Fragment(), FormFragment.OnDataListener {

    private lateinit var binding: DataFragmentBinding

    var data : String = ""
    set(value) {
        field = value
        binding.txtData.text = field
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataFragmentBinding.inflate(inflater)

        binding.btnUpdateData.setOnClickListener {

        }

        return binding.root
    }

    override fun onData(data: String) {
        this.data = data
    }
}