package com.takehomeexcercise

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.graphics.drawable.ColorDrawable
import java.lang.Exception
import java.util.*

class CustomProgressDialog(context: Context) : Dialog(context, R.style.Theme_Dialog) {
    override fun onCreate(savedInstanceState: Bundle) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_progress)
        try {
            Objects.requireNonNull(window)?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    init {
        setCancelable(false)
        setCanceledOnTouchOutside(false)
    }
}