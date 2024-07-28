package org.dodo.dodo.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.dodo.dodo.models.dto.ProductsDTO;
import org.dodo.dodo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@Tag(name="Добавить позицию")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    @Operation(summary = "Вывод всех продуктов")
    public ResponseEntity<List<ProductsDTO>> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @GetMapping("/products/{product_id}")
    @Operation(summary = "Получить продукт по ID")
    public ResponseEntity<ProductsDTO> getProductById(@PathVariable("product_id") long product_id) {
        ProductsDTO productsDTO = productService.getProductById(product_id);

        if (productsDTO == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(productsDTO);
        }
    }

//    @PostMapping("/products")
//    @Operation(summary = "Создание продукта")
//    public ResponseEntity<Products> createProduct(@RequestBody ProductsDTO productDTO) {
//        Products products = productService.addProduct(productDTO);
//        return ResponseEntity.status(HttpStatus.CREATED).body(products);
//    }

}
