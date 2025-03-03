package org.dodo.dodo.database.repository;

import org.dodo.dodo.database.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Products, Long> {
}
