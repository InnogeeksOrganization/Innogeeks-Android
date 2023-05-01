package com.example.monuments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Settings.newInstance] factory method to
 * create an instance of this fragment.
 */
class Settings : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1:String? = null
    private var param2:String? = null

    override fun onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater:LayoutInflater, container:ViewGroup?,
        savedInstanceState:Bundle?
    ):View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_settings, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Settings.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1:String, param2:String) =
            Settings().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}

/*import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.Uri
import android.os.Bundle

import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.util.ArrayList
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment


@Suppress("DEPRECATION")
class Settings: () {
    lateinit var amountEt:EditText
    lateinit var noteEt:EditText
    lateinit var nameEt:EditText
    lateinit var upiIdEt:EditText
    lateinit var send:Button

    internal val UPI_PAYMENT = 0

    override fun onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        initializeViews()

        send.setOnClickListener {
            //Getting the values from the EditTexts
            val amount = amountEt.text.toString()
            val note = noteEt.text.toString()
            val name = nameEt.text.toString()
            val upiId = upiIdEt.text.toString()
            payUsingUpi(amount, upiId, name, note)
        }
    }

    internal fun initializeViews() {
        send = findViewById(R.id.send)
        amountEt = findViewById(R.id.amount_et)
        noteEt = findViewById(R.id.note)
        nameEt = findViewById(R.id.name)
        upiIdEt = findViewById(R.id.upi_id)
    }

    fun payUsingUpi(amount:String, upiId:String, name:String, note:String) {

        val uri = Uri.parse("upi://pay").buildUpon()
            .appendQueryParameter("pa", upiId)
            .appendQueryParameter("pn", name)
            .appendQueryParameter("tn", note)
            .appendQueryParameter("am", amount)
            .appendQueryParameter("cu", "INR")
            .build()


        val upiPayIntent = Intent(Intent.ACTION_VIEW)
        upiPayIntent.data = uri

        // will always show a dialog to user to choose an app
        val chooser = Intent.createChooser(upiPayIntent, "Pay with")

        // check if intent resolves
        if (null != chooser.resolveActivity(packageManager)) {
            startActivityForResult(chooser, UPI_PAYMENT)
        } else {
            Toast.makeText(this,
                "No UPI app found, please install one to continue",
                Toast.LENGTH_SHORT).show()
        }

    }

    /* override fun onActivityResult(requestCode:Int, resultCode:Int, data:Intent?) {
         super.onActivityResult(requestCode, resultCode, data)

         when (requestCode) {
             UPI_PAYMENT -> if (Activity.RESULT_OK == resultCode || resultCode == 11) {
                 if (data != null) {
                     val trxt = data.getStringExtra("response")
                     Log.d("UPI", "onActivityResult: $trxt")
                     val dataList = ArrayList<String>()
                     dataList.add(trxt.toString())
                     upiPaymentDataOperation(dataList)
                 } else {
                     Log.d("UPI", "onActivityResult: " + "Return data is null")
                     val dataList = ArrayList<String>()
                     dataList.add("nothing")
                     upiPaymentDataOperation(dataList)
                 }
             } else {
                 Log.d("UPI",
                     "onActivityResult: " + "Return data is null") //when user simply back without payment
                 val dataList = ArrayList<String>()
                 dataList.add("nothing")
                 upiPaymentDataOperation(dataList)
             }
         }
     }*/

    private fun upiPaymentDataOperation(data:ArrayList<String>) {
        if (isConnectionAvailable(this)) {
            var str:String? = data[0]
            Log.d("UPIPAY", "upiPaymentDataOperation: " + str!!)
            var paymentCancel = ""
            if (str == null) str = "discard"
            var status = ""
            var approvalRefNo = ""
            val response = str.split("&".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            for (i in response.indices) {
                val equalStr =
                    response[i].split("=".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
                if (equalStr.size >= 2) {
                    if (equalStr[0].toLowerCase() == "Status".toLowerCase()) {
                        status = equalStr[1].toLowerCase()
                    } else if (equalStr[0].toLowerCase() == "ApprovalRefNo".toLowerCase() || equalStr[0].toLowerCase() == "txnRef".toLowerCase()) {
                        approvalRefNo = equalStr[1]
                    }
                } else {
                    paymentCancel = "Payment cancelled by user."
                }
            }

            if (status == "success") {
                //Code to handle successful transaction here.
                Toast.makeText(this, "Transaction successful.", Toast.LENGTH_SHORT).show()
                Log.d("UPI", "responseStr: $approvalRefNo")
            } else if ("Payment cancelled by user." == paymentCancel) {
                Toast.makeText(this, "Payment cancelled by user.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Transaction failed.Please try again", Toast.LENGTH_SHORT)
                    .show()
            }
        } else {
            Toast.makeText(this,
                "Internet connection is not available. Please check and try again",
                Toast.LENGTH_SHORT).show()
        }
    }

    companion object {

        fun isConnectionAvailable(context:Context):Boolean {
            val connectivityManager =
                context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            if (connectivityManager != null) {
                val netInfo = connectivityManager.activeNetworkInfo
                if (netInfo != null && netInfo.isConnected
                    && netInfo.isConnectedOrConnecting
                    && netInfo.isAvailable
                ) {
                    return true
                }
            }
            return false
        }
    }
}*/