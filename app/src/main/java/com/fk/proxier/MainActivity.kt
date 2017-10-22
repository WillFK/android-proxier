package com.fk.proxier

import android.net.wifi.WifiConfiguration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.R.attr.port
import android.content.Context
import android.content.Context.WIFI_SERVICE
import android.net.wifi.WifiManager
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import android.text.method.TextKeyListener.clear
import java.lang.Character.UNASSIGNED




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setup()
    }

    private fun setup() {
        doItBtn.setOnClickListener {
            doIt()
        }
    }

    private fun doIt() {

    }
}
