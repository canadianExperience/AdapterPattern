package com.me.adapterpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.me.adapterpattern.adapter.Socket
import com.me.adapterpattern.adapter.SocketAdapter

const val TAG = "DESIGN_PATTERNS"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Adapter design pattern (object adapter)
        val socket = Socket()
        val adapter = SocketAdapter(socket)

        val v120 = adapter.get120Volt().volts
        val v12 = adapter.get12Volt().volts
        val v3 = adapter.get3Volt().volts

        Log.d(TAG, "Socket adapter: v_120 = $v120, v_12 = $v12, v_3 = $v3")
    }
}