package com.dz.fridge.db

import java.net.URI
import com.mongodb.casbah.MongoConnection

object FridgeStore {

    val dbUri: URI = new URI(System.getenv("MONGOHQ_URL"))
    //val MongoURI mongoURI = new MongoURI(System.getenv("MONGOHQ_URL"))

    lazy val db: MongoConnection = new MongoConnection(dbUri)
    
    //DB db = mongoURI.connectDB();
    //db.authenticate(mongoURI.getUsername(), mongoURI.getPassword());  
    //Set<String> colls = db.getCollectionNames();
    
    

}