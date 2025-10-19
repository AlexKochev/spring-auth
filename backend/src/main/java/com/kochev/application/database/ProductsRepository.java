package com.kochev.application.database;

import com.kochev.application.models.Product;
import com.mongodb.lang.NonNull;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductsRepository extends MongoRepository<Product, String> {

    @Override
    void delete(@NonNull Product deleted);
}
