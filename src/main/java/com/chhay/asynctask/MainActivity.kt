package com.chhay.asynctask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun dl(v:View){

        var myTask = MyTask(this@MainActivity, dl, progressBar, text_status)
        myTask.execute()

    }
}
