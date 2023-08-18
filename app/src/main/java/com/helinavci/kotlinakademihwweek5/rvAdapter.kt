package com.helinavci.kotlinakademihwweek5

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.helinavci.kotlinakademihwweek5.databinding.CardviewBinding

class rvAdapter(val mContext : Context, val meslekler : List<meslekler>): RecyclerView.Adapter<rvAdapter.cardviewHolder>(){
    inner class cardviewHolder(val binding : CardviewBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cardviewHolder {
        val binding = CardviewBinding.inflate(LayoutInflater.from(parent.context), parent , false)
        return cardviewHolder(binding)
    }

    override fun getItemCount(): Int {
        return meslekler.size
    }

    override fun onBindViewHolder(holder: cardviewHolder, position: Int) {
        val meslek = meslekler[position]
        val binding = holder.binding
        binding.textViewName.text = meslek.name
        val resId = mContext.resources.getIdentifier(meslek.imageid ,"drawable", mContext.packageName)
        binding.imageView.setImageResource(resId)
    }
}