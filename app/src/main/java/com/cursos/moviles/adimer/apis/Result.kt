package com.cursos.moviles.adimer.apis

data class Result (
    val _id:String,
    val author:String,
    val content:String,
    val tags:List<String>,
    val authorSlug: String,
    val length: Int,
    val dateAdded:String,
    val dateModified:String,
        )