package com.example.mymoviewdb.networks.responses

import com.google.gson.annotations.SerializedName

data class DetailMovieResponse (

    @field:SerializedName("adult")
    val adult: Boolean,

    @field:SerializedName("backdrop_path")
    val backdrop_path: String,

    @field:SerializedName("belongs_to_collection")
    val belongs_to_collection: BelongToCollection?,

    @field:SerializedName("budget")
    val budget: Int,

    @field:SerializedName("genres")
    val genres: List<Genres>,

    @field:SerializedName("homepage")
    val homepage: String,

    @field:SerializedName("id")
    val id: Int,

    @field:SerializedName("imdb_id")
    val imdb_id: String,

    @field:SerializedName("original_language")
    val original_language: String,

    @field:SerializedName("original_title")
    val original_title: String,

    @field:SerializedName("overview")
    val overview: String,

    @field:SerializedName("popularity")
    val popularity: Double,

    @field:SerializedName("poster_path")
    val poster_path: String,

    @field:SerializedName("production_companies")
    val production_companies: List<ProductionCompanie>,

    @field:SerializedName("production_countries")
    val production_countries: List<ProductionCountrie>,

    @field:SerializedName("release_date")
    val release_date: String,

    @field:SerializedName("revenue")
    val revenue: Int,

    @field:SerializedName("runtime")
    val runtime: Int,

    @field:SerializedName("spoken_languages")
    val spoken_languages: List<SpokenLanguage>,

    @field:SerializedName("status")
    val status: String,

    @field:SerializedName("tagline")
    val tagline: String,

    @field:SerializedName("title")
    val title: String,

    @field:SerializedName("video")
    val video: Boolean,

    @field:SerializedName("vote_average")
    val vote_average: Double,

    @field:SerializedName("vote_count")
    val vote_count: Int,
)

data class BelongToCollection (

    @field:SerializedName("id")
    val id: Int,

    @field:SerializedName("name")
    val name: String,

    @field:SerializedName("poster_path")
    val poster_path: String,

    @field:SerializedName("backdrop_path")
    val backdrop_path: String,
)

data class Genres(
    @field:SerializedName("id")
    val id: Int,

    @field:SerializedName("name")
    val name: String,
)

data class ProductionCompanie(
    @field:SerializedName("id")
    val id: Int,

    @field:SerializedName("logo_path")
    val logo_path: String,

    @field:SerializedName("name")
    val name: String,

    @field:SerializedName("origin_country")
    val origin_country: String,
)

data class ProductionCountrie(
    @field:SerializedName("iso_3166_1")
    val iso_3166_1: String,

    @field:SerializedName("name")
    val name: String,
)

data class SpokenLanguage(
    @field:SerializedName("english_name")
    val english_name: String,

    @field:SerializedName("iso_639_1")
    val iso_639_1: String,

    @field:SerializedName("name")
    val name: String,
)