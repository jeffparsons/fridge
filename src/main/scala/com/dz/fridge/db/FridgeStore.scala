package com.dz.fridge.db

import java.net.URI
import com.mongodb.casbah.MongoConnection
import com.mongodb.Mongo
import com.mongodb.casbah.MongoURI

object FridgeStore {

    lazy val db: MongoConnection = MongoConnection(MongoURI(System.getenv("MONGOHQ_URL")))
        
    //DB db = mongoURI.connectDB();
    //db.authenticate(mongoURI.getUsername(), mongoURI.getPassword());  
    //Set<String> colls = db.getCollectionNames();
    
    

}