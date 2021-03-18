package com.example.myrecycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//tell which holder to use, in this case "MyViewHolder"
//to pass in data = MyAdapter()
class MyAdapter(private val studentList: List<StudentItem>):RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    //create a holder
    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val imgView:ImageView = itemView.findViewById(R.id.imgPhoto)
        val tvName:TextView = itemView.findViewById(R.id.tvName)
        val tvProgramme:TextView = itemView.findViewById(R.id.tvProgramme)
    }

    //when class is abstract, we must implement all the methods
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        //inflate means get layout and return item view
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_view, parent,false)

        //do casting
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        //need to indicate which component to display result
        val currentItem = studentList[position]

        //currentItem.imageResource = imgPhoto in studentItem
        holder.imgView.setImageResource(currentItem.imageResource)
        //.text = text =
        holder.tvName.text = currentItem.name
        holder.tvProgramme.setText(currentItem.programme)
    }

    override fun getItemCount(): Int {
        return studentList.size
    }
}