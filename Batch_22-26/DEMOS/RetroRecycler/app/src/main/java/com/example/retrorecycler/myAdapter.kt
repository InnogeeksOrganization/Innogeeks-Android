package com.example.retrorecycler

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide

class myAdapter(var context: Context, var list : List<Meme>) : RecyclerView.Adapter<myAdapter.myViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        return myViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {

       Glide.with(holder.itemView.context)
           .load(list.get(position).url.toString())
           .into(holder.img)
    }

    class myViewHolder (view : View) : RecyclerView.ViewHolder(view){
        val img = view.findViewById<ImageView>(R.id.imageView)

    }
}