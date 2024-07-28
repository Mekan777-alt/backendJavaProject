package org.dodo.dodo.database.repository;

import jakarta.transaction.Transactional;
import org.dodo.dodo.database.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
