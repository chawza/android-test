package com.example.navtgest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navtgest.databinding.FragmentDomicileBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Domicile.newInstance] factory method to
 * create an instance of this fragment.
 */
class Domicile : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentDomicileBinding.inflate(inflater, container, false)

        binding.domicileText.setOnClickListener {
            findNavController().navigate(R.id.action_domicile_to_profile)
        }

        binding.showModalButton.setOnClickListener {
            val activity = activity as MainActivity
            activity.dialog.show()
        }

        return binding.root
    }

}