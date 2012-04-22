package com.dz.fridge.bootstrap

import com.dz.fridge.FridgeService

import java.net.InetSocketAddress

import scala.util.Properties
import com.twitter.finagle.builder.ServerBuilder
import com.twitter.finagle.http.Http

object Main {
    
    val PORT = "8080"
    val SERVICE_NAME = "fridge-service"

    def main(args: Array[String]) {
        val port = Properties.envOrElse("PORT", PORT).toInt
        ServerBuilder()
            .codec(Http())
            .name(SERVICE_NAME)
            .bindTo(new InetSocketAddress(port))
            .build(new FridgeService)
        printUrl(port)
    }
    
    def printUrl(port: Int) {
        println("http://localhost:" + port)
    }

}
