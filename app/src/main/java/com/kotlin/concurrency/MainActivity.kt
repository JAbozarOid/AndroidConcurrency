package com.kotlin.concurrency

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.core.content.PackageManagerCompat.LOG_TAG
import com.kotlin.concurrency.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // init view binding
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        // init button click handlers
        with(mBinding) {
            btnRun.setOnClickListener {
                runCode()
            }
            btnClear.setOnClickListener {
                clearOutput()
            }
        }
    }

    private fun runCode() {
        log("Running code")
    }

    private fun clearOutput() {

    }


    @SuppressLint("RestrictedApi")
    private fun log(message : String) {
        Log.i(LOG_TAG, "log: ")
        mBinding.logDisplay.append(message + "\n")
    }

    private fun scrollTextToEnd() {
        Handler().post {

        }
    }
}