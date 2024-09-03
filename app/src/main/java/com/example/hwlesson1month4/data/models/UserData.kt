package com.example.hwlesson1month4.data.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UserData(
    val name: String,
    val email: String,
    val password: Int
): Parcelable
