package org.dodo.dodo.models.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductsDTO {
    long id;
    String productName;
    String descriptionProduct;
    String photoUrlProduct;
    double weightProduct;
    double productPrice;
}
