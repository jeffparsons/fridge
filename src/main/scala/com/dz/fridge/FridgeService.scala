package com.dz.fridge

import java.net.InetSocketAddress

import scala.util.Properties

import org.jboss.netty.handler.codec.http.HttpRequest
import org.jboss.netty.handler.codec.http.HttpResponse

import com.dz.fridge.html.MainTemplate
import com.twitter.finagle.builder.ServerBuilder
import com.twitter.finagle.http.Http
import com.twitter.finagle.http.Response
import com.twitter.finagle.Service
import com.twitter.util.Future

class FridgeService extends Service[HttpRequest, HttpResponse] {

    def apply(req: HttpRequest): Future[HttpResponse] = {
        val response = Response()
        
        val html = MainTemplate.decorate(<h1>Fridge!</h1>)
        
        response.setStatusCode(200)
        response.setContentType("text/html", "UTF-8")
        response.setContentString("<!DOCTYPE html>\n" + html.toString())
        
        Future(response)
    }

}

