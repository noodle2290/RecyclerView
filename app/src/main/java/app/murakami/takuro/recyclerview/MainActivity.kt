package app.murakami.takuro.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val courseData: List<CourseData> = listOf(
        CourseData(R.drawable.masaru ,"バイト先のマスコットキャラクターマサル","メガネとひげがチャームポイント"),
        CourseData(R.drawable.ore ,"たくたくだよ","一緒に頑張ろう"),
        CourseData(R.drawable.namahage ,"なまはげ","なくこはいねが")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = RecyclerViewAdapter(this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        adapter.addAll(courseData)

     }
}