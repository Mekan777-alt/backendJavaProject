package org.dodo.dodo.service;

import org.dodo.dodo.database.entity.Products;
import org.dodo.dodo.database.repository.ProductRepository;
import org.dodo.dodo.models.dto.ProductsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public List<ProductsDTO> getAllProducts() {
        List<Products> products = productRepository.findAll();
        List<ProductsDTO> productsDTOList = new ArrayList<>();
        for (Products p : products) {
            ProductsDTO productsDTO = ProductsDTO.builder()
                    .id(p.getId())
                    .productName(p.getProductName())
                    .descriptionProduct(p.getDescriptionProduct())
                    .photoUrlProduct(p.getPhotoUrlProduct())
                    .weightProduct(p.getWeightProduct())
                    .productPrice(p.getProductPrice()).build();
            productsDTOList.add(productsDTO);
        }
        return productsDTOList;
    }

    public ProductsDTO getProductById(long id) {
        Products products = productRepository.findById(id).orElse(null);
        if (products == null) {
            return null;
        } else {
            return ProductsDTO.builder()
                    .id(products.getId())
                    .productName(products.getProductName())
                    .descriptionProduct(products.getDescriptionProduct())
                    .photoUrlProduct(products.getPhotoUrlProduct())
                    .weightProduct(products.getWeightProduct())
                    .productPrice(products.getProductPrice()).build();
        }
    }

//    public Products addProduct(ProductsDTO productsDTO) {
//
//    }

}
