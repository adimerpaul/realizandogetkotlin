package com.cursos.moviles.adimer.apis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private val TAG="MYTAG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val quotesApi=RetrofitHelper.getInstance().create(QuotesApi::class.java)
        GlobalScope.launch {
            val result=quotesApi.getQuotes()
            if (result!=null){
                Log.e(TAG,result.body().toString())
            }
        }
    }
}