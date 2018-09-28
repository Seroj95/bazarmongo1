package service.impl;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import repository.ProducRepository;
import service.ProductService;

import java.util.Optional;

public class ProductServiceImpl implements ProductService {
    private final ProducRepository producRepository;
    @Autowired
    public ProductServiceImpl(ProducRepository producRepository){
        this.producRepository=producRepository;
    }
    @Override
    public Optional<Product> findById(String id) {
        return producRepository.findById(id);
    }

    @Override
    public Optional<Product> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Page<Product> findAllProductsPageable(Pageable pageable) {
        return producRepository.findAll(pageable);
    }
}
