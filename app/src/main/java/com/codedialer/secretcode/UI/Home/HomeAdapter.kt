package com.codedialer.secretcode.UI.Home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codedialer.secretcode.databinding.ItemCodeBinding
import com.codedialer.secretcode.Domain.Model.SecretCode

class HomeAdapter : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    private val items = mutableListOf<SecretCode>()

    fun submitList(list: List<SecretCode>) {
        items.clear()
        items.addAll(list)
        notifyDataSetChanged()
    }

    inner class ViewHolder(val binding: ItemCodeBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemCodeBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val code = items[position]
        holder.binding.tvCode.text = code.code
        holder.binding.tvDescription.text = code.description
    }

    override fun getItemCount(): Int = items.size
}
