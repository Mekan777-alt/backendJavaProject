package org.dodo.dodo.database.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "productName")
    private String productName;

    @Column(name="descriptionProduct")
    private String descriptionProduct;

    @Column(name = "photoUrlProduct")
    private String photoUrlProduct;

    @Column(name = "weightProduct")
    private double weightProduct;

    @Column(name = "productPrice")
    private double productPrice;

    @ManyToOne
    @JoinColumn(name = "category_id", foreignKey = @ForeignKey(name = "FK_PRODUCTS_CATEGORY"))
    private Category category;

    @OneToMany(mappedBy = "products", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CartItem> cartItems;
}