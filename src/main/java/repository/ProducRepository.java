package repository;

import model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ProducRepository extends MongoRepository<Product,String> {
    Optional<Product> findById(String id);

    void flush();
}
