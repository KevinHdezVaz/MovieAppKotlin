package com.example.movie.data.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    val adult: Boolean = false,
    val backdrop_path: String = "",
     val id: Int = -1,
    val original_title: String = "",
    val original_language: String = "",
    val overview: String = "",
    val popularity: Double = -1.0,
    val poster_path: String = "",
    val release_date: String = "",
    val title: String = "",
    val video: Boolean = false,
    val vote_average: Double = -1.0,
    val vote_count: Int = -1,
    val movieType:String=""
): Parcelable

data class MovieList(val results: List<Movie> = listOf())


//ROOM

//Entidad.
/*
*Dentro de ROOm se van a crear columnas y cada una tendra su columna para cuando el servicio a internet falle
*
*
*
* */
@Entity
data class MovieEntity(
    @PrimaryKey
    val id: Int = -1,

    @ColumnInfo(name="backdrop_path")
    val backdrop_path: String = "",
    @ColumnInfo(name="adult")
    val adult: Boolean = false,
    @ColumnInfo(name="original_title")
    val original_title: String = "",
    @ColumnInfo(name="original_language")
    val original_language: String = "",
    @ColumnInfo(name="overview")
    val overview: String = "",
    @ColumnInfo(name="popularity")
    val popularity: Double = -1.0,
    @ColumnInfo(name="poster_path")
    val poster_path: String = "",
    @ColumnInfo(name="release_date")
    val release_date: String = "",
    @ColumnInfo(name="title")
    val title: String = "",
    @ColumnInfo(name="video")
    val video: Boolean = false,
    @ColumnInfo(name="vote_average")
    val vote_average: Double = -1.0,
    @ColumnInfo(name="vote_count")
    val vote_count: Int = -1,
    @ColumnInfo(name="movie_type")
    val movieType:String=""
)

fun List<MovieEntity>.toMovieList() : MovieList{

    val resultList = mutableListOf<Movie>()
    this.forEach{
        resultList.add(it.toMovie())
    }
    return MovieList(resultList)
}




fun MovieEntity.toMovie() :Movie= Movie(

    this.adult,
this.backdrop_path,
this.id,
this.original_title  ,
this.original_language  ,
this.overview  ,
this.popularity ,
this.poster_path  ,
this.release_date  ,
this.title  ,
this.video ,
this.vote_average  ,
this.vote_count,
this.movieType
)

fun Movie.toMovieEntity(movieType: String): MovieEntity = MovieEntity(

    this.id,
    this.backdrop_path,
    this.adult,
    this.original_title  ,
    this.original_language  ,
    this.overview  ,
    this.popularity ,
    this.poster_path  ,
    this.release_date  ,
    this.title  ,
    this.video ,
    this.vote_average  ,
    this.vote_count,
    movieType = movieType

)