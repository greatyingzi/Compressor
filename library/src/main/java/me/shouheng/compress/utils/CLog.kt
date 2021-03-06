package me.shouheng.compress.utils

import android.util.Log

/**
 * Simple log utils
 *
 * @author WngShhng (shouheng2015@gmail.com)
 */
object CLog {

    private const val TAG = "Compressor"

    /**
     * Set the log debug mode
     */
    var isDebug: Boolean = false

    fun d(message: String?) {
        if (isDebug) {
            Log.d(TAG, message)
        }
    }

    fun i(message: String?) {
        if (isDebug) {
            Log.i(TAG, message)
        }
    }

    fun w(message: String?) {
        if (isDebug) {
            Log.w(TAG, message)
        }
    }

    fun e(message: String?) {
        if (isDebug) {
            Log.e(TAG, message)
        }
    }
}
