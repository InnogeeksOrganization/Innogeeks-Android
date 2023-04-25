package com.example.indimon

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
/*
 * A simple [Fragment] subclass.
 * Use the [qutubMinarFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class qutubMinarFragment : Fragment(R.layout.fragment_qutub_minar) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val QutubBtn:Button=view.findViewById(R.id.qutubBtn)
        QutubBtn.setOnClickListener {
            val intent: Intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://asi.payumoney.com/quick/qum"))
            startActivity(intent)
        }
    }
}