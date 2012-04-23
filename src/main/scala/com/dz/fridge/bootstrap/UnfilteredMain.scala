package com.dz.fridge.bootstrap

import unfiltered.request.Path
import unfiltered.response.ResponseString
import scala.util.Properties

object UnfilteredMain {

    def main(args: Array[String]) {

        val hello = unfiltered.netty.cycle.Planify {
            case Path("/") => ResponseString("Testing")
        }
        
        val port = Properties.envOrElse("PORT", "8080").toInt
        
        unfiltered.netty.Http(port)
        	.plan(hello)
        	.resources(getClass().getResource("/public/"), 40, passOnFail = false)
        	.run()

        //        unfiltered.netty.Http(8080)
        //            .handler(MyHandler)
        //            .resources(getClass().getResource("/public/"), 40, passOnFail = false)
        //            .run

    }

}