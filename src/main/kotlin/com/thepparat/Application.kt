package com.thepparat

import com.thepparat.plugins.configureMonitoring
import com.thepparat.plugins.configureRouting
import com.thepparat.plugins.configureSerialization
import io.ktor.server.application.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    configureMonitoring()
    configureSerialization()
    configureRouting()
}
