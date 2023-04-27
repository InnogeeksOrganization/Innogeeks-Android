package com.example.monumental_india

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [delhi.newInstance] factory method to
 * create an instance of this fragment.
 */
class delhi : Fragment() {
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
        val view= inflater.inflate(R.layout.fragment_delhi, container, false)
        val humayuntomb : ImageView = view!!.findViewById(R.id.humayuntomb)!!
        humayuntomb!!.setOnClickListener {
            findNavController().navigate(R.id.action_delhi_to_humayuntomb2)
        }
        val redfort : ImageView = view!!.findViewById(R.id.redfort)!!
        redfort!!.setOnClickListener {
            findNavController().navigate(R.id.action_delhi_to_redfort2)
        }
        val jantarmantar : ImageView = view!!.findViewById(R.id.jantarmantar)!!
        jantarmantar!!.setOnClickListener {
            findNavController().navigate(R.id.action_delhi_to_jantarmantar2)
        }
            return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment delhi.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            delhi().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}