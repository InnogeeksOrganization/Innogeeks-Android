package com.example.wonder_india

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [f1.newInstance] factory method to
 * create an instance of this fragment.
 */
class f1 : Fragment() {
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

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view= inflater.inflate(R.layout.fragment_f1, container, false)


        var button1:Button=view.findViewById(R.id.tajm)
        var button2:Button=view.findViewById(R.id.lotus)
        var button3:Button=view.findViewById(R.id.chr)
        var button4:Button=view.findViewById(R.id.gold)
        var button5:Button=view.findViewById(R.id.qutub)
        var button6:Button=view.findViewById(R.id.imambara)
        var button7:Button=view.findViewById(R.id.jantar)
        var button8:Button=view.findViewById(R.id.gatew)
        var button9:Button=view.findViewById(R.id.jama)
        var button10:Button=view.findViewById(R.id.sanchi)
        var button11:Button=view.findViewById(R.id.rumi)
        var button12:Button=view.findViewById(R.id.redf)
        var button13:Button=view.findViewById(R.id.hawa)
        var button14:Button=view.findViewById(R.id.kon)
        var button15:Button=view.findViewById(R.id.vict)


        button1.setOnClickListener {
            findNavController().navigate(R.id.action_f13_to_taj)
        }
        button2.setOnClickListener {
            findNavController().navigate(R.id.action_f13_to_lotus)
        }
        button3.setOnClickListener {
            findNavController().navigate(R.id.action_f13_to_charminar)
        }
        button4.setOnClickListener {
            findNavController().navigate(R.id.action_f13_to_golden)
        }
        button5.setOnClickListener {
            findNavController().navigate(R.id.action_f13_to_qutub)
        }
        button6.setOnClickListener {
            findNavController().navigate(R.id.action_f13_to_imambada)
        }
        button7.setOnClickListener {
            findNavController().navigate(R.id.action_f13_to_jantarmantar)
        }
        button8.setOnClickListener {
            findNavController().navigate(R.id.action_f13_to_gateway)
        }
        button9.setOnClickListener {
            findNavController().navigate(R.id.action_f13_to_jama)
        }
        button10.setOnClickListener {
            findNavController().navigate(R.id.action_f13_to_sanchi)
        }
        button11.setOnClickListener {
            findNavController().navigate(R.id.action_f13_to_rumi)
        }
        button12.setOnClickListener {
            findNavController().navigate(R.id.action_f13_to_redfort)
        }
        button13.setOnClickListener {
            findNavController().navigate(R.id.action_f13_to_hawa)
        }
        button14.setOnClickListener {
            findNavController().navigate(R.id.action_f13_to_konark)
        }
        button15.setOnClickListener {
            findNavController().navigate(R.id.action_f13_to_victoria)
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
         * @return A new instance of fragment f1.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            f1().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}