package com.ahmet.DockerSpringBootMongoDB.collection;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Represents a Student entity in the MongoDB database.
 *
 * This class is annotated with @Document to indicate it's a MongoDB document and
 * includes various fields like id, name, email, etc., with appropriate annotations
 * for indexing and JSON serialization behavior.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "students")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Student {

    @Id
    private String id;
    @Indexed()
    private String name;
    @Indexed(unique = true)
    private String email; // Assuming email is unique in the system
    private Address address;
    private Integer age;
    private List<String> courses;
    private Boolean fullTime;
    private Double gpa;
    private LocalDateTime graduationDate;
    private LocalDateTime registerDate;

    /**
     * Custom constructor to create a Student instance without an id.
     *
     * @param name Name of the student.
     * @param email Email of the student, must be unique.
     * @param address Address of the student.
     * @param age Age of the student.
     * @param courses List of courses the student is enrolled in.
     * @param fullTime Boolean indicating if the student is a full-time student.
     * @param gpa Grade Point Average of the student.
     * @param graduationDate Expected graduation date of the student.
     * @param registerDate Registration date of the student.
     */
    public Student(String name, String email, Address address, Integer age, List<String> courses, Boolean fullTime, Double gpa, LocalDateTime graduationDate, LocalDateTime registerDate) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.age = age;
        this.courses = courses;
        this.fullTime = fullTime;
        this.gpa = gpa;
        this.graduationDate = graduationDate;
        this.registerDate = registerDate;
    }
}
