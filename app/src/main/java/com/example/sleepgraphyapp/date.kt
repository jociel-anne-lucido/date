package com.example.sleepgraphyapp



import  java.time.LocalDate
import java.time.LocalTime

fun main(args: Array<String>) {
    val current = LocalDate.now()
    val time = LocalTime.now()

    println(current)
    println(time)

}

