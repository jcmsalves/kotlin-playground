package com.jcmsalves.kotlinplayground.parcelable

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PersonParcelize(val name: String,
                           val age: Int,
                           val email: String,
                           val phone: Long) : Parcelable