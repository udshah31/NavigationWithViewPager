package com.example.navigationwithviewpager.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.navigationwithviewpager.R
import com.example.navigationwithviewpager.model.User

class HomeAdapter : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    private var itemList = emptyList<User>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_row, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itemList[position]
        holder.bind(item)
        holder.itemView.setOnClickListener {
            onItemClickListener?.let { it(item) }
        }
    }

    private var onItemClickListener: ((User) -> Unit)? = null
    fun setOnItemClickListener(listener: (User) -> Unit) {
        onItemClickListener = listener
    }


    override fun getItemCount(): Int {
        return itemList.size
    }

    fun setData(user: List<User>) {
        this.itemList = user
        notifyDataSetChanged()
    }

    inner class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        private val name = item.findViewById<TextView>(R.id.name)
        private val image = item.findViewById<ImageView>(R.id.image)

        fun bind(user: User) {
            name.text = user.name
            image.setImageResource(user.image)
        }
    }
}