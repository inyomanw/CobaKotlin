package com.example.publikakun.cobakotlin.udemysource.oop

//var com.example.publikakun.cobakotlin.udemysource.variable.getMyName = "Elliot" // global variable
var myName: String? = null

fun main(args: Array<String>) {
    //var com.example.publikakun.cobakotlin.udemysource.variable.getMyName --> local variable which is only visible inside of this function
    myName

    showName("James")
}

fun showName(name: String) {
    myName

    println("Name: $myName")
}