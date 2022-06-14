package com.bitcode.fragments4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bitcode.fragments4.databinding.FormFragmentBinding

class FormFragment : Fragment() {

    private lateinit var binding: FormFragmentBinding

    interface OnDataListener {
        fun onData(data: String)
    }

    var onDataListener: OnDataListener? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FormFragmentBinding.inflate(inflater)

        binding.btnSendData.setOnClickListener {
            onDataListener?.onData(binding.edtData.text.toString())
        }

        return binding.root
    }
}