package com.takehomeexcercise

import android.app.Activity
import android.content.Context
import android.content.res.Resources
import android.util.DisplayMetrics
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.ImageView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.google.android.material.snackbar.Snackbar
import com.google.gson.Gson
import java.util.*

/**
 * My Extensions
 */


/**
 * toast
 */
fun Context.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

/**
 * toast with duration
 */
fun Context.toast(message: String, duration : Int) {
    Toast.makeText(this, message, duration).show()
}

/**
 * snack bar
 */
fun View.showSnackBarToast(strMessage: String) {
    try {
        Snackbar.make(this, strMessage, Snackbar.LENGTH_LONG).show()
    } catch (e: Exception) {

    }
}

/**
 * make view visible
 */
fun View.makeVisible() {
    visibility = View.VISIBLE
}

/**
 * make view gone
 */
fun View.makeGone() {
    visibility = View.GONE
}

/**
 * make view invisible
 */
fun View.makeInvisible() {
    visibility = View.INVISIBLE
}

/**
 * make view click disable
 */
fun View.disable() {
    alpha = .3f
    isClickable = false
}

/**
 * make view click enable
 */
fun View.enable() {
    alpha = 1f
    isClickable = true
}

/**
 * make view disable
 */
// with no alpha
fun View.isDisable() {
    isClickable = false
    isEnabled = false
}

/**
 * make view enable
 */
fun View.isEnable() {
    isClickable = true
    isEnabled = true
}

/**
 * convert dp to px
 */
fun Int.dpToPx() {
    val displayMetrics = Resources.getSystem().getDisplayMetrics()
    Math.round(this * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT))
}

/**
 * convert dip to px
 */
fun Float.dip2px(context: Context): Int {
    val scale = context.applicationContext.resources.displayMetrics.density
    return (this * scale + 0.5f).toInt()
}

/**
 * load image with custom rounded value
 */
fun ImageView.loadRoundedImage(url: String?, radius: Int = 8) {
    Glide.with(context!!).load(if (url.isNullOrBlank()) "error" else url)
        .transform(CenterCrop(), RoundedCorners(radius))
        .placeholder(ContextCompat.getDrawable(this.context, R.drawable.ic_placeholder_image))
        .error(R.drawable.ic_placeholder_image)
        .into(this)
}

/**
 * load image without rounded
 */
fun ImageView.loadImage(url: String?) {
    Glide.with(context!!).load(if (url.isNullOrBlank()) "error" else url)
        .transform(CenterCrop())
        .placeholder(ContextCompat.getDrawable(this.context, R.drawable.ic_placeholder_image))
        .error(R.drawable.ic_placeholder_image)
        .into(this)
}

/**
 * hide keyboard
 */
fun Activity.hideKeybord() {
    val inputManager = this.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    // inputManager.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
    val focusedView = this.currentFocus
    if (focusedView != null) {
        inputManager.hideSoftInputFromWindow(focusedView.windowToken, InputMethodManager.HIDE_NOT_ALWAYS)
    }
}

inline fun <reified T : Any> String.gsonConvert(): T = Gson().fromJson(this, T::class.java)
