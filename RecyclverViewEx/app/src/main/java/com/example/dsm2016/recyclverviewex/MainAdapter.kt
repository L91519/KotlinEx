package com.example.dsm2016.recyclverviewex

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import kotlinx.android.synthetic.main.item_recyclerview.view.*

class MainAdapter: RecyclerView.Adapter<MainViewHolder>() {

    val items = listOf<String>("first", "second", "third");

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context);
        val item = layoutInflater.inflate(R.layout.item_recyclerview, parent, false);
        return MainViewHolder(item);
    }

    override fun getItemCount(): Int {
        return items.size;
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val item = items.get(position);
        holder?.itemView?.textView?.text = item;

    }

}

class MainViewHolder(v: View): RecyclerView.ViewHolder(v) {

}

