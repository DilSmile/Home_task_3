package com.example.home_task_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

private lateinit var newRecyclerView: RecyclerView
private lateinit var newArrayList:ArrayList<Workouts>
lateinit var imageId:Array<Int>
lateinit var title: Array<String>
lateinit var description: Array<String>
lateinit var price: Array<String>


override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    imageId = arrayOf(
        R.drawable.fullbody,
        R.drawable.pilates,
        R.drawable.zumba,
        R.drawable.cardio,
        R.drawable.joggin,
        R.drawable.yogo,
        R.drawable.streching,
    )

    title = arrayOf(
        "Full-Body",
        "Pilates",
        "Zumba",
        "Cardio",
        "Jogging",
        "Yogo",
        "Streching"
    )
    description = arrayOf(
        "Full-body refer to exercise routines target various muscle groups throughout the body",
        "Pilates is a form of mind-body exercise that focuses on the core muscles",
        "Zumba is a fitness program that involves cardio and Latin-inspired dance",
        "Cardio is shorthand for cardiovascular training, and it encompasses any exercise",
        "Jogging is a form of running at a leisurely and steady pace",
        "Yoga is a practice that combines physical postures, breathing techniques, meditation",
        "Stretching is a crucial component of any fitness regimen and is often overlooked"
    )
    price = arrayOf(
        "14 exercise 13999T",
        "20 exercise 13999T",
        "12 exercise 11999T",
        "23 exercise 15999T",
        "10 exercise 9999T",
        "20 exercise 12999T",
        "18 exercise 13999T",

    )

    newRecyclerView = findViewById(R.id.recyclerView)
    newRecyclerView.layoutManager=LinearLayoutManager(this)
    newRecyclerView.setHasFixedSize(true)
    newArrayList= arrayListOf<Workouts>()
    getUserdata()
}
private fun getUserdata(){

    for(i in imageId.indices){

        val workouts=Workouts(imageId[i],title[i], description[i],price[i])
        newArrayList.add(workouts)
    }
    newRecyclerView.adapter = Adapter(newArrayList)
}
}


//
//
//private var titlesList = mutableListOf<String>()
//private var descList = mutableListOf<String>()
//private var imageList = mutableListOf<Int>()
//private var priceList = mutableListOf<String>()
//
//override fun onCreate(savedInstanceState: Bundle?) {
//    super.onCreate(savedInstanceState)
//    setContentView(R.layout.activity_main)
//
//    postToList()
//
//    rv_recyclerView.layoutManager = LinearLayoutManager(this)
//    rv_recyclerView.adapter = Adapter(titlesList, descList, imageList, priceList)
//}
//
//private fun addToList(title: String, description: String, image: Int, price: String) {
//    titlesList.add(title)
//    descList.add(description)
//    imageList.add(image)
//    priceList.add(price)
//}
//
//private fun postToList() {
//    for (i in 1..25) { // Fixed the typo in the for loop
//        addToList("Title $i", "Description $i", R.mipmap.ic_launcher_round, "")
//    }
//}
//}