package com.dz.fridge.model

import java.util.Date

class Product(useByVal: Date, nameVal: String) {
    
    var name: String = nameVal
    var useBy: Date = useByVal
    
    
}