package com.example.retonav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.retonav.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val navController=findNavController()
        binding = FragmentHomeBinding.inflate(layoutInflater)
        binding.buttonEnviar.setOnClickListener{
            val nombre = binding.editTextNombre.text.toString()
            val appaterno = binding.editTextApPaterno.text.toString()
            val apmaterno = binding.editTextApMaterno.text.toString()
            val usuario=binding.editTextUsuario.text.toString()
            val correo= binding.editTextCorreo.text.toString()

            val destination = HomeFragmentDirections.actionHomeFragmentToInsideFragment(nombre,appaterno,apmaterno,usuario,correo)
            navController.navigate(destination)
        }
        return binding.root
    }
}