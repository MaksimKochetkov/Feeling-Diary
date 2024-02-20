package com.example.feeling_diary

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class News_adapter (val con: Context, val list2:ArrayList<News>): RecyclerView.Adapter<News_adapter.Link>() {

    class Link(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val im_di: ImageView = itemView.findViewById(R.id.imagenews)
        val text_di: TextView = itemView.findViewById(R.id.textnews1)
        val text_di2: TextView = itemView.findViewById(R.id.textnews2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): News_adapter.Link {
        val root = LayoutInflater.from(con).inflate(R.layout.news, parent, false)
        return Link(root)
    }

    override fun onBindViewHolder(holder: News_adapter.Link, position: Int) {
        holder.im_di.setImageResource(list2[position].imageId1)
        holder.text_di.setText(list2[position].title1)
        holder.text_di2.setText(list2[position].title11)
    }

    override fun getItemCount(): Int {
        return list2.size
    }
}

