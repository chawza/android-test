package com.example.navtgest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.navtgest.databinding.FragmentProfileBinding

/**
 * A simple [Fragment] subclass.
 * Use the [Profile.newInstance] factory method to
 * create an instance of this fragment.
 */
class Profile : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        binding.profileText.setOnClickListener {
            it.findNavController().navigate(R.id.action_profile_to_idcard)
        }
        binding.setGlobalTextButton.setOnClickListener {
            val activity = activity as MainActivity
            val input = binding.globalTextInput
            activity.setGlobalText(input.text.toString())
            input.setText("")
        }
        return binding.root
    }
}