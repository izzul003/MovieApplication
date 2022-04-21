package com.example.mymoviewdb.models

import android.os.Parcel
import android.os.Parcelable

data class Film (
    var desc : String ? = "",
    var director : String ? = "",
    var genre : String ? = "",
    var judul : String ? = "",
    var poster : Int ? = 0,
    var rating : String ? = ""
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(desc)
        parcel.writeString(director)
        parcel.writeString(genre)
        parcel.writeString(judul)
        parcel.writeInt(poster!!)
        parcel.writeString(rating)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Film> {
        override fun createFromParcel(parcel: Parcel): Film {
            return Film(parcel)
        }

        override fun newArray(size: Int): Array<Film?> {
            return arrayOfNulls(size)
        }
    }
}