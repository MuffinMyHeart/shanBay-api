package sarria.plugins

import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.content.*
import io.ktor.http.content.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import sarria.routes.randomArticle

fun Application.configureRouting() {
    install(Routing) {
        randomArticle()
        static {
            resources("static")
//            defaultResource("./index.html")
            defaultResource("static/index.html")
        }

    }
}
