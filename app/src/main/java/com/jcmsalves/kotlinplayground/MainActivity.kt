package com.jcmsalves.kotlinplayground

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        updateTextButton.setOnClickListener {
            runServer()
        }
    }

    fun runServer() {
        val jsonResponse = """{
                "id": 1,
                "name": "Joao Alves",
                "username": "joao.alves",
                "email": "joao.alves@example.com"
            }"""

        embeddedServer(Netty, 8080) {
            routing {
                get("/") {
                    call.respondText(jsonResponse, ContentType.Application.Json)
                }

                get("/random") {
                    call.respondText("random message", ContentType.Text.Html)
                }
            }
        }.start(wait = true)
    }
}
