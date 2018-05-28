package com.resthello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value = { "classpath:application.properties" })
@SpringBootApplication
public class ResthelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResthelloApplication.class, args);
		
		System.out.println("Environment value :" + System.getenv("spring.data.mongodb.uri"));
		
		
		/*MongoClientURI uri  = new MongoClientURI("mongodb://admin:adminat123@ds135760.mlab.com:35760/CloudFoundry_dbmedfae_ulahi7s6"); 
        MongoClient client = new MongoClient(uri);
        MongoDatabase db = client.getDatabase(uri.getDatabase());
        
        System.out.println(db);
        
        MongoCollection<Document> employees = db.getCollection("Employee");
        
        MongoCursor<Document> cursor = employees.find().iterator();
        
        try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                System.out.println(
                    "In the " + doc.get("firstname") + ", " + doc.get("lastname") + 
                    " by " + doc.get("email") + " topped the charts for " + 
                    doc.get("weeksAtOne") + " straight weeks."
                );
            }
        } finally {
            cursor.close();
        }
        */
        
	}
}
