package com.example.asjProject
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Recycler(): RecyclerView.Adapter<Recycler.ViewHolder>() {
    private var title= arrayOf("Morning Workout","Evening Workout", "Yoga")
    private var images= intArrayOf(R.drawable.sunrise, R.drawable.moon, R.drawable.yoga)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Recycler.ViewHolder {
        val v =LayoutInflater.from(parent.context).inflate(R.layout.select_card, parent, false)
        return ViewHolder(v)
    }
    override fun getItemCount(): Int {
        return title.size
    }
    override fun onBindViewHolder(holder: Recycler.ViewHolder, position: Int) {
        holder.itemTitle.text =title[position]
        holder.itemImage.setImageResource(images[position])
    }

      class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        var itemImage: ImageView = itemView.findViewById(R.id.image_1)
        var itemTitle: TextView  =itemView.findViewById(R.id.text_title)
    }
}