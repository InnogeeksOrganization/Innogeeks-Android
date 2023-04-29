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
 * Use the [gatewayofindia.newInstance] factory method to
 * create an instance of this fragment.
 */
class gatewayofindia : Fragment() {
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
        val view= inflater.inflate(R.layout.fragment_gatewayofindia, container, false)
        val txtlink: TextView =view.findViewById(R.id.txtlink)
        val button1: Button = view.findViewById(R.id.button1)
        val button2: Button = view.findViewById(R.id.button2)
        txtlink.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW)
            browserIntent.data = Uri.parse("https://en.wikipedia.org/wiki/Gateway_of_India")
            startActivity(browserIntent)
        }
        button1.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW)
            browserIntent.data = Uri.parse("https://www.google.com/maps/place/Gateway+Of+India+Mumbai/@18.9220035,72.8162002,15z/data=!3m1!4b1!4m6!3m5!1s0x3be7d1c73a0d5cad:0xc70a25a7209c733c!8m2!3d18.9219841!4d72.8346543!16zL20vMDJoN3Iy")
            startActivity(browserIntent)
        }
        button2.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW)
            browserIntent.data = Uri.parse("https://www.viator.com/en-IN/Mumbai-attractions/Gateway-of-India/d953-a4622")
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
         * @return A new instance of fragment gatewayofindia.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            gatewayofindia().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}