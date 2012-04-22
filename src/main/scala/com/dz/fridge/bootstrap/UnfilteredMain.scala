package com.dz.fridge.bootstrap

import unfiltered.request._
import unfiltered.response._

object UnfilteredMain {

    def main(args: Array[String]) {

        val hello = unfiltered.netty.cycle.Planify {
            case Path("/") => ResponseString("Testing")
        }
        
        unfiltered.netty.Http(8080)
        	.plan(hello)
        	.resources(getClass().getResource("/public/"), 40, passOnFail = false)
        	.run()

        //        unfiltered.netty.Http(8080)
        //            .handler(MyHandler)
        //            .resources(getClass().getResource("/public/"), 40, passOnFail = false)
        //            .run

    }

}