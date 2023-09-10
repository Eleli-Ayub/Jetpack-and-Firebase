package com.example.googleauth.utils.functions

import android.content.Context
import android.widget.Toast

fun MakeToast(context: Context, text: String){
    Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
}