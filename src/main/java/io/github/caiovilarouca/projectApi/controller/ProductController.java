package io.github.caiovilarouca.projectApi.controller;

import io.github.caiovilarouca.projectApi.Entity.Product;
import io.github.caiovilarouca.projectApi.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping
    public Product save(@RequestBody Product product) {
        System.out.println("Produto recebido: "+product);

        product.setId(UUID.randomUUID().toString());
        productRepository.save(product);

        return product;
    }
}
