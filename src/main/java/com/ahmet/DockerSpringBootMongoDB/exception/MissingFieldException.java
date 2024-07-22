package com.ahmet.DockerSpringBootMongoDB.exception;

import java.io.Serial;
import java.io.Serializable;

public class MissingFieldException extends RuntimeException  implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    public MissingFieldException(String fieldName) {
        super(String.format("Missing required field: %s", fieldName));
    }
}
