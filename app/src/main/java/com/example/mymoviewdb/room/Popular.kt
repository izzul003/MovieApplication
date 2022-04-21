package com.example.mymoviewdb.room

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity
@Parcelize
data class Popular (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int = 0,

    @ColumnInfo(name = "title")
    var title: String? = null,

    @ColumnInfo(name = "adult")
    var adult: Boolean? = false,

    @ColumnInfo(name = "backdrop_path")
    var backdrop_path: String? = null,

    @ColumnInfo(name = "genre_ids")
    var genre_ids: String? = null,

    @ColumnInfo(name = "original_language")
    var original_language: String? = null,

    @ColumnInfo(name = "original_title")
    var original_title: String? = null,

    @ColumnInfo(name = "overview")
    var overview: String? = null,

    @ColumnInfo(name = "popularity")
    var popularity: Double? = null,

    @ColumnInfo(name = "poster_path")
    var poster_path: String? = null,

    @ColumnInfo(name = "release_date")
    var release_date: String? = null,

    @ColumnInfo(name = "video")
    var video: Boolean? = false,

    @ColumnInfo(name = "vote_average")
    var vote_average: Double? = null,

    @ColumnInfo(name = "vote_count")
    var vote_count: Int? = null
): Parcelable