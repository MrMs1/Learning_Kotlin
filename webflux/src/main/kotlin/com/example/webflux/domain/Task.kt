package com.example.webflux.domain

data class Task(
    val taskId: String,
    val taskName: String,
    val deadLine: String,
    val done: Boolean
) {

}