package com.example.hwlesson1month4.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.hwlesson1month4.R
import com.example.hwlesson1month4.databinding.FragmentMainBinding
import com.example.hwlesson1month4.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding
    private val args by navArgs<SecondFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getData()
    }

    private fun getData() {
        val userData = args.userData
        if (userData != null) {
            binding.apply {

                txtName.text = userData.name
                txtEmail.text = userData.email
                txtPassword.text = userData.password.toString()

            }
        }

    }
}