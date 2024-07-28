package org.dodo.dodo.database.repository;

import jakarta.transaction.Transactional;
import org.dodo.dodo.database.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface CartRepository extends JpaRepository<Cart, Integer> {
}
