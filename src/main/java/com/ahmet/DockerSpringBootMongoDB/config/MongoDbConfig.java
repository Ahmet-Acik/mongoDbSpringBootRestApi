package com.ahmet.DockerSpringBootMongoDB.config;

import com.mongodb.client.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * Configuration class for MongoDB.
 *
 * This class is annotated with @Configuration to indicate that it is a source of bean definitions.
 * It provides the MongoTemplate bean configured with the MongoClient and the database name.
 */
@Configuration
public class MongoDbConfig {
        @Autowired
        private MongoClient mongoClient;

    /**
     * Creates a MongoTemplate bean.
     *
     * MongoTemplate is the central class of the Spring Data MongoDB module.
     * It simplifies the use of MongoDB operations like find, update, and delete operations.
     *
     * @return A new instance of MongoTemplate configured with the MongoClient and the database name "school".
     */
        @Bean
        public MongoTemplate mongoTemplate() {
            return new MongoTemplate(mongoClient, "school");
        }
    }
