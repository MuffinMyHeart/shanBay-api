package sarria

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import sarria.plugins.*

const val BASE_URL = "http://101.132.97.199:80"
const val BASE_PORT = 80
const val BASE_ADDRESS = "139.224.224.133"

fun main() {
    embeddedServer(Netty, port = BASE_PORT, host = "0.0.0.0") {
        configureRouting()
        configureHTTP()
        configureMonitoring()
        configureSerialization()
    }.start(wait = true)
}

