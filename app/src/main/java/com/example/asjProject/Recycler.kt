package com.example.asjProject
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import android.content.Intent
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

     inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        var itemImage: ImageView = itemView.findViewById(R.id.image_1)
        var itemTitle: TextView  =itemView.findViewById(R.id.text_title)
        val intent: Intent? = null
        init{
        itemView.setOnClickListener{
            val position: Int =adapterPosition

            Toast.makeText(itemView.context,"you clicked on ${title[position]}", Toast.LENGTH_LONG).show()
            if(position==0)
            itemView.context.startActivity(Intent(itemView.context, Activity2::class.java))
            if(position==1)
                itemView.context.startActivity(Intent(itemView.context, Activity3::class.java))
            if(position==2)
                itemView.context.startActivity(Intent(itemView.context, Activity4::class.java))}}

        }
    }
    }
