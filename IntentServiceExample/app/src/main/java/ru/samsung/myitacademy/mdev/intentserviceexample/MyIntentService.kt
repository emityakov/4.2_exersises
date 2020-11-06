package ru.samsung.myitacademy.mdev.intentserviceexample

import android.app.IntentService
import android.content.Intent
import android.util.Log


class MyIntentService : IntentService("MyIntentService") {

    private val TAG = "ServiceExample"

    override fun onHandleIntent(intent: Intent?) {
        Log.i(TAG, "Intent Service started")
    }

}
