package com.teremu.secretcodes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.teremu.secretcodes.models.SecretCode

class CodeListAdapter(
    private val codes: List<SecretCode>,
    private val onClick: (SecretCode) -> Unit
) : RecyclerView.Adapter<CodeListAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val codeText: TextView = view.findViewById(android.R.id.text1)
        val descText: TextView = view.findViewById(android.R.id.text2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(android.R.layout.simple_list_item_2, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = codes[position]
        holder.codeText.text = item.code
        holder.descText.text = item.description

        holder.itemView.setOnClickListener { onClick(item) }
    }

    override fun getItemCount(): Int = codes.size
}
