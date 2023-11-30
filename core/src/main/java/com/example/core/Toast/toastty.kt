package com.example.core.Toast

import android.content.Context
import android.widget.Toast

class toastty {
     fun toastDisp(context: Context, msg: String)
    {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}