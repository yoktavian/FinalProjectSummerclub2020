package com.vintech.finalprojectsummerclub.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.vintech.finalprojectsummerclub.R

/**
 * Created by YudaOktavian on 14-May-2020
 */
class CustomAdapter(private val notes: ArrayList<*>) : BaseAdapter() {

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater
            .from(parent?.context)
            .inflate(R.layout.custom_layout_listview, parent, false)
        // set semua view berdasarkan property notes dan
        // manfaatkan position untuk mendapatkan posisi dari array list.
        return view
    }

    override fun getItemId(position: Int): Long = position.toLong()
    override fun getItem(position: Int) = notes[position]
    override fun getCount() = notes.size
}