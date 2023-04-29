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
 * Use the [imambada.newInstance] factory method to
 * create an instance of this fragment.
 */
class imambada : Fragment() {
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
        val view= inflater.inflate(R.layout.fragment_imambada, container, false)
        val loc: ImageView = view.findViewById(R.id.locate)
        val info: ImageView = view.findViewById(R.id.wiki)
        val backb: ImageView = view.findViewById(R.id.goback)
        loc.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW)
            browserIntent.data = Uri.parse("https://www.google.com/maps/place/Bara+Imambara/@26.8708169,80.9109369,17z/data=!4m14!1m7!3m6!1s0x399bfd90dc791ccf:0x8707307204f35f6b!2sBara+Imambara+main+gate!8m2!3d26.8708169!4d80.9135118!16s%2Fg%2F11jzcc9dq7!3m5!1s0x399bfdee2b778b71:0x352e3d138a28173f!8m2!3d26.8693018!4d80.9125977!16zL20vMDZtd25f")
            startActivity(browserIntent)
        }
        info.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW)
            browserIntent.data = Uri.parse("https://en.wikipedia.org/wiki/Bara_Imambara")
            startActivity(browserIntent)
        }
        backb.setOnClickListener {
            findNavController().navigate(R.id.action_imambada_to_f13)
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
         * @return A new instance of fragment imambada.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            imambada().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}