package com.example.monumental_india

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [goldentemple.newInstance] factory method to
 * create an instance of this fragment.
 */
class goldentemple : Fragment() {
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
        val view = inflater.inflate(R.layout.fragment_goldentemple, container, false)
        val txtlink: TextView = view.findViewById(R.id.txtlink)
        val button1: Button = view.findViewById(R.id.button1)
        val button2: Button = view.findViewById(R.id.button2)
        txtlink.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW)
            browserIntent.data = Uri.parse("https://en.wikipedia.org/wiki/Golden_Temple")
            startActivity(browserIntent)
        }
        button1.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW)
            browserIntent.data =
                Uri.parse("https://www.google.com/maps/place/Golden+Temple,+Golden+Temple+Rd,+Atta+Mandi,+Katra+Ahluwalia,+Amritsar+Cantt.,+Punjab+143006/@31.6207132,74.8745191,17z/data=!3m1!4b1!4m6!3m5!1s0x39197ca90747169f:0x905b3bed34afb917!8m2!3d31.6207087!4d74.877094!16s%2Fg%2F11b776wlnd")
            startActivity(browserIntent)
        }
        button2.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW)
            browserIntent.data = Uri.parse("https://traveltriangle.com/punjab-tourism/amritsar/places-to-visit/golden-temple/entry-fees")
            startActivity(browserIntent)
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
         * @return A new instance of fragment goldentemple.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            goldentemple().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}