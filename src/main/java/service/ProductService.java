package service;

import model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ProductService {
    Optional<Product> findById(String id);

    Optional<Product> findById(Long id);

    Page<Product> findAllProductsPageable(Pageable pageable);
}
