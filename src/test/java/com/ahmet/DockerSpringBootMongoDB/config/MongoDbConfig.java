package com.ahmet.DockerSpringBootMongoDB.config;

import com.mongodb.client.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * Configuration class for MongoDB.
 * <p>
 * This class is responsible for setting up MongoDB configurations within the Spring Boot application.
 * It defines beans that are used for connecting to and interacting with MongoDB, such as the MongoTemplate.
 * </p>
 */
@Configuration
public class MongoDbConfig {
    @Autowired
    private MongoClient mongoClient;

    /**
     * Defines a MongoTemplate bean for MongoDB operations.
     * <p>
     * The MongoTemplate provides a high-level API for performing various operations on a MongoDB collection.
     * It is configured with a MongoClient and a database name, allowing for operations like find, insert, delete, and update on the database.
     * </p>
     *
     * @return A MongoTemplate instance configured with the MongoClient and the database name "school".
     */
    @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongoClient, "school");
    }
}
