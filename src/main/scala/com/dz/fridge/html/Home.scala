package com.dz.fridge.html

import unfiltered.response.ResponseString

object Home {

    def index(message: String): ResponseString = 
        ResponseString(MainTemplate.decorate(<h1>{ message }</h1>).toString())

}