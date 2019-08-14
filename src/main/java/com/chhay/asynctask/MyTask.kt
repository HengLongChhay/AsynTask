package com.chhay.asynctask

import android.content.Context
import android.os.AsyncTask
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView

class MyTask(context: Context,button: Button,progressBar: ProgressBar,textView: TextView) : AsyncTask<Void, Int, String>() {

    var ct = context
    var butt = button
    var pb = progressBar
    var st = textView

    override fun onPreExecute() {
        super.onPreExecute()
        st.text = "wait a bit man"
        butt.isEnabled = false
        Thread.sleep(5000)
    }

    override fun doInBackground(vararg p0: Void?): String {
        for (i in 1..100 step 1){
            Thread.sleep(100)
            publishProgress(i)
        }
        return "dl is completed...."
    }

    override fun onProgressUpdate(vararg values: Int?) {
        val progress = values[0]
        st.text = "$progress dlding"
        pb.progress = progress!!
    }

    override fun onPostExecute(result: String?) {

        st.text = result
        butt.isEnabled = true
    }
}
