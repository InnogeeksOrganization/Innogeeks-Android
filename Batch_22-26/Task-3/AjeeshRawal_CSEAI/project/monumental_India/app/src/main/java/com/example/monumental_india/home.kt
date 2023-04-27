package com.example.monumental_india

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [home.newInstance] factory method to
 * create an instance of this fragment.
 */
class home : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_home, container, false)
        val button1: Button =view.findViewById(R.id.Button1)
        val button2: Button =view.findViewById(R.id.Button2)
        val button3: Button =view.findViewById(R.id.Button3)
        val button4: Button =view.findViewById(R.id.Button4)
        button1.setOnClickListener{
            findNavController().navigate(R.id.action_home_frag_to_delhi)
        }
        button2.setOnClickListener{
            findNavController().navigate(R.id.action_home_frag_to_agra)
        }

        button3.setOnClickListener{
            findNavController().navigate(R.id.action_home_frag_to_mumbai)
        }

        button4.setOnClickListener{
            findNavController().navigate(R.id.action_home_frag_to_punjab)
        }


        return view
    }


}