package com.example.myrecycleview

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    //create array, assume gotten from Database
    var myStudentList = ArrayList<StudentItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        generateData()

        val btn: Button = findViewById(R.id.btnOK)

        btn.setOnClickListener {
            val recyclerView:RecyclerView = findViewById(R.id.myStudentView)

            recyclerView.adapter = MyAdapter(myStudentList)
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.setHasFixedSize(true)
        }

    }

    fun generateData(){
        val stud1 = StudentItem(R.drawable.ic_face,"John","RDS")
        val stud2 = StudentItem(R.drawable.ic_face,"Alex","RSD")
        val stud3 = StudentItem(R.drawable.ic_face,"Mark","RSF")
        val stud4 = StudentItem(R.drawable.ic_face,"Steven","RIT")
        val stud5 = StudentItem(R.drawable.ic_face,"Alice","RIT")

        myStudentList.add(stud1)
        myStudentList.add(stud2)
        myStudentList.add(stud3)
        myStudentList.add(stud4)
        myStudentList.add(stud5)
        myStudentList.add(stud1)
        myStudentList.add(stud2)
        myStudentList.add(stud3)
        myStudentList.add(stud4)
        myStudentList.add(stud5)
    }
}