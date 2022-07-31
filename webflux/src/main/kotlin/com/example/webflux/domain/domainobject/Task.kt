package com.example.webflux.domain.domainobject

data class Task(
    val taskId: String,
    val taskName: String,
    val deadLine: String,
    val done: Boolean
) {

}