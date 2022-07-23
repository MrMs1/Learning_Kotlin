package com.example.webflux.presentation

import com.example.webflux.usecase.ReadUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/todo")
class TodoController(
    private val readUseCase: ReadUseCase
) {

    @GetMapping("/read")
    fun read(): String {
        return readUseCase.read()
    }
}