package io.github.caiovilarouca.projectApi;

import io.github.caiovilarouca.projectApi.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository <Product, Long> {

}
