package com.example.wonder_india

import android.content.Intent
import android.net.Uri
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
 * Use the [qutub.newInstance] factory method to
 * create an instance of this fragment.
 */
class qutub : Fragment() {
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
        val view= inflater.inflate(R.layout.fragment_qutub, container, false)
        val loc: ImageView = view.findViewById(R.id.locate)
        val info: ImageView = view.findViewById(R.id.wiki)
        val backb: ImageView = view.findViewById(R.id.goback)
        loc.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW)
            browserIntent.data = Uri.parse("https://www.google.com/maps/place/Qutab+Minar,+Seth+Sarai,+Mehrauli,+New+Delhi,+Delhi+110016/@28.5245358,77.1840263,17.54z/data=!4m6!3m5!1s0x390d1e065dc72379:0xf6e7259f610de1d7!8m2!3d28.5244946!4d77.1855177!16zL20vMDNjX2g4")
            startActivity(browserIntent)
        }
        info.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW)
            browserIntent.data = Uri.parse("https://en.wikipedia.org/wiki/Qutb_Minar")
            startActivity(browserIntent)
        }
        backb.setOnClickListener {
            findNavController().navigate(R.id.action_qutub_to_f13)
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
         * @return A new instance of fragment qutub.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            qutub().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}