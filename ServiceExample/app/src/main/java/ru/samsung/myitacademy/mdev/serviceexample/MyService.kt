package ru.samsung.myitacademy.mdev.serviceexample

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class MyService : Service() {

    private val TAG = "ServiceExample"

    override fun onCreate() {
        Log.i(TAG, "Service onCreate")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.i(TAG, "Service onStartCommand " + startId)
        var i: Int = 0
        while (i <= 3) {
            try {
                Thread.sleep(10000)
                i++
            } catch (e: Exception) { }
            Log.i(TAG, "Service running")
        }
        return Service.START_STICKY
    }

    override fun onBind(intent: Intent): IBinder? {
        Log.i(TAG, "Service onBind")
        return null
    }

    override fun onDestroy() {
        Log.i(TAG, "Service onDestroy")
    }
}
