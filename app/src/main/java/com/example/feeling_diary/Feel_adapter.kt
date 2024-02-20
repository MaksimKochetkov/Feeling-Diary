package com.example.feeling_diary

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class Feel_adapter (val con: Context, val list2:List<quotes_data>): RecyclerView.Adapter<Feel_adapter.Link>() {

    class Link(vi: View) : RecyclerView.ViewHolder(vi) {
        val im_di: ImageView = itemView.findViewById(R.id.imagefeel)
        val text_di: TextView = itemView.findViewById(R.id.textfeel)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Feel_adapter.Link {
        val root = LayoutInflater.from(con).inflate(R.layout.spok, parent, false)
        return Link(root)
    }

    override fun onBindViewHolder(holder: Feel_adapter.Link, position: Int) {
        Glide.with(con).load(list2[position].image).into(holder.im_di)
        holder.text_di.setText(list2[position].title)
    }

    override fun getItemCount(): Int {
        return list2.size
    }
}
