package com.example.indimon

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class tajFragment : Fragment(R.layout.fragment_taj) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btn : Button = view.findViewById(R.id.tajBtn)
        btn.setOnClickListener {
            val intent:Intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://asi.payumoney.com/quick/taj"))
            startActivity(intent)
        }
    }
}