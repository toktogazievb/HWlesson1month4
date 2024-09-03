package com.example.hwlesson1month4.ui.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.example.hwlesson1month4.R
import com.example.hwlesson1month4.data.models.UserData
import com.example.hwlesson1month4.databinding.FragmentMainBinding
import java.io.Serializable

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListener()

    }

    private fun setupListener() {
        val name = binding.etName.text.toString()
        val email = binding.etEmail.text.toString()
        val password = binding.etPassword.text.toString()
        binding.apply {
            btn.setOnClickListener {
                if (name.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty()) {
                    val userData = UserData(name, email, password.toInt())
                    val action = MainFragmentDirections.actionMainFragmentToSecondFragment(userData)
                    findNavController().navigate(action)
                } else
                    Toast.makeText(context, "Неправильно введены данные", Toast.LENGTH_LONG).show()

            }
        }
    }
}