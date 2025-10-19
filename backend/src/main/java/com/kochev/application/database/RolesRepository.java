package com.kochev.application.database;

import com.kochev.application.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RolesRepository extends MongoRepository<Role, String> {

    Role findByRole(String role);
}
