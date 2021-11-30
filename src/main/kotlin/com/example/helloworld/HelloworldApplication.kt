package com.example.helloworld

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class HelloworldApplication

fun main(args: Array<String>) {
	runApplication<HelloworldApplication>(*args)
}
@RestController
class HomePage {
	@RequestMapping("/Helloworld")
	fun helloWorld(): String {
		return "This is the first Kotlin Project by me."
	}
}