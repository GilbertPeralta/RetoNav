package com.example.retonav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.retonav.databinding.FragmentInsideBinding


class InsideFragment : Fragment() {
    private lateinit var binding: FragmentInsideBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentInsideBinding.inflate(layoutInflater)
        val nombre = arguments?.getString("nombre")
        val appaterno = arguments?.getString("appaterno")
        val apmaterno = arguments?.getString("apmaterno")
        val usuario = arguments?.getString("usuario")
        val correo = arguments?.getString("correo")
        binding.textView2.setText(nombre)
        binding.textView3.setText(appaterno)
        binding.textView4.setText(apmaterno)
        binding.textView5.setText(usuario)
        binding.textView6.setText(correo)
        return binding.root
    }

}