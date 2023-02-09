package com.thepparat.routes

import com.thepparat.data.model.Ronaldo
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
private const val BASE_URL = "http://172.20.10.2:8080"

private val ronaldo = listOf(
    Ronaldo(name = "Ronaldo portugal", description = "Ronaldo play for portugal team", imageUrl = "$BASE_URL/ronaldo/ronaldo1.jpeg"),
    Ronaldo(name = "Ronaldo Real madrid", description = "champ!", imageUrl = "$BASE_URL/ronaldo/ronaldo2.jpeg"),
    Ronaldo(name = "Ronaldo goal", description = "Goat flex", imageUrl = "$BASE_URL/ronaldo/ronaldo3.jpeg"),
    Ronaldo(name = "young Ronaldo", description = "Great times", imageUrl = "$BASE_URL/ronaldo/ronaldo4.jpeg"),
    Ronaldo(name = "welcome Ronaldo", description = "Best team", imageUrl = "$BASE_URL/ronaldo/ronaldo5.jpeg")
)

fun Route.randomRonaldo() {
    get(path = "/randomRonaldo") {
        call.respond(
            HttpStatusCode.OK,
            ronaldo.random()
        )
    }
}