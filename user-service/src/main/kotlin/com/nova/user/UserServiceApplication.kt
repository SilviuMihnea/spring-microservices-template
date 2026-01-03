package com.nova.user

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class UserServiceApplication

fun main(args: Array<String>) {
    runApplication<UserServiceApplication>(*args)
}

@RestController
class HelloController {
    @GetMapping
    fun hello(@RequestParam(name = "name", required = false, defaultValue = "world") name: String) = "Hello, $name!"
}