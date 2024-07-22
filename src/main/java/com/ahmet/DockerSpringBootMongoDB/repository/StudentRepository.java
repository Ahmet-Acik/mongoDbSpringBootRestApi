package com.ahmet.DockerSpringBootMongoDB.repository;

import com.ahmet.DockerSpringBootMongoDB.collection.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * StudentRepository interface for accessing Student data in MongoDB.
 * Extends MongoRepository to provide CRUD operations and custom query methods for Student entities.
 */
@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

    /**
     * Finds students whose names start with the specified prefix.
     *
     * @param name The prefix to match at the start of student names.
     * @return A list of students with names starting with the specified prefix.
     */
    List<Student> findByNameStartsWith(String name);

    /**
     * Finds students within a specified age range.
     *
     * @param minAge The minimum age of students to find.
     * @param maxAge The maximum age of students to find.
     * @return A list of students whose ages fall within the specified range.
     */
    List<Student> findByAgeBetween(int minAge, int maxAge);

    /**
     * Checks if a student with the specified email exists.
     *
     * @param email The email to check for existence.
     * @return true if a student with the specified email exists, false otherwise.
     */
    boolean existsByEmail(String email);

}