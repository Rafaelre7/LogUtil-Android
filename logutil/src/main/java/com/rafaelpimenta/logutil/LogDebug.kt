package com.rafaelpimenta.logutil

import android.util.Log

class LogDebug {

    private val TAG = "SUPER_AWESOME_APP"

    fun print(message: String) {
        Log.d(TAG, message)
    }
}