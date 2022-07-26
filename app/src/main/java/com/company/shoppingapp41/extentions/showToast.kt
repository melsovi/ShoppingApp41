package com.company.shoppingapp41.extentions

import android.content.Context
import android.widget.Toast

fun Context.showToastShort(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}