package com.example.webflux.usecase

import org.springframework.stereotype.Service

@Service
class ReadUseCase {

    fun read(): String {
        return "read !"
    }
}