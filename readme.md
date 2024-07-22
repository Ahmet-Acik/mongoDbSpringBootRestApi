```markdown
# Docker Spring Boot MongoDB Project

This project demonstrates the integration of a Spring Boot application with MongoDB, utilizing Docker for containerization. It's designed for developers looking to implement CRUD operations on a MongoDB database through a Spring Boot application.

## Description

The Docker Spring Boot MongoDB project provides a RESTful API for managing student entities. It includes operations for creating, reading, updating, and deleting student records in a MongoDB database. The project showcases the use of Spring Data MongoDB for repository management, Spring Web for RESTful services, and Docker for easy deployment and environment consistency.

## Getting Started

### Dependencies

- Java JDK 11 or higher
- Maven
- Docker
- MongoDB

### Installing

1. Clone the repository to your local machine:

```bash
git clone https://github.com/Ahmet-Acik/DockerSpringBootMongoDB.git
cd DockerSpringBootMongoDB
```

2. Build the project using Maven:

```bash
mvn clean install
```

3. Run the Docker container:

```bash
docker-compose up --build
```

### Executing program

After successfully building and running the Docker container, the Spring Boot application will be accessible at `http://localhost:8080`.

## API Reference

### CRUD Operations

#### Create a New Student

- **Endpoint:** `POST /students`
- **Content-Type:** `application/json`
- **Request Body:**

```json
{
  "name": "Jane Doe",
  "email": "jane.doe@example.com",
  "age": 21
}
```

- **Response:**

```json
{
  "message": "A new student is successfully created with ID: <student_id>"
}
```

#### Retrieve All Students

- **Endpoint:** `GET /students/all`
- **Response:**

```json
[
  {
    "id": "<student_id>",
    "name": "Jane Doe",
    "email": "jane.doe@example.com",
    "age": 21
  }
]
```

#### Retrieve a Student by ID

- **Endpoint:** `GET /students/{id}`
- **Response:**

```json
{
  "id": "<student_id>",
  "name": "Jane Doe",
  "email": "jane.doe@example.com",
  "age": 21
}
```

#### Update a Student

- **Endpoint:** `PUT /students/{id}`
- **Content-Type:** `application/json`
- **Request Body:**

```json
{
  "name": "Jane Doe Updated",
  "email": "jane.updated@example.com",
  "age": 22
}
```

- **Response:**

```json
{
  "message": "Student updated successfully with ID: <student_id>",
  "student": {
    "id": "<student_id>",
    "name": "Jane Doe Updated",
    "email": "jane.updated@example.com",
    "age": 22
  }
}
```

#### Partially Update a Student

- **Endpoint:** `PATCH /students/{id}`
- **Content-Type:** `application/json`
- **Request Body:**

```json
{
  "email": "jane.partially.updated@example.com"
}
```

- **Response:**

```json
{
  "message": "Student partially updated successfully with ID: <student_id>",
  "student": {
    "id": "<student_id>",
    "email": "jane.partially.updated@example.com"
  }
}
```

#### Delete a Student

- **Endpoint:** `DELETE /students/{id}`
- **Response:**

```json
{
  "message": "Student with ID <student_id> deleted successfully."
}
```

## Tests

To run the tests, execute the following command:

```bash
mvn test
```

## Deployment

The project includes a `Dockerfile` and `docker-compose.yml` for easy deployment. Use Docker Compose to build and run the application container alongside a MongoDB container.

## Contributing

Contributions are welcome! For major changes, please open an issue first to discuss what you would like to change.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/Ahmet-Acik/DockerSpringBootMongoDB/tags).

## Authors

- Ahmet Acik - *Initial work* - [Ahmet-Acik](https://github.com/Ahmet-Acik)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.

## Acknowledgments

- Thanks to the Spring Boot and MongoDB communities for their excellent documentation and support.
```
