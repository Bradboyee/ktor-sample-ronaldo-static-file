package com.thepparat.plugins

import com.thepparat.routes.randomRonaldo
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        randomRonaldo()
        get("/") {
            call.respondText("Hello World!")
        }
        // Static plugin. Try to access `/static/index.html`
        static("/") {
            resources("static")
        }
    }
}
