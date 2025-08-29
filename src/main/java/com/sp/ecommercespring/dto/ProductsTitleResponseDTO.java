package com.sp.ecommercespring.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductsTitleResponseDTO {
    private String status;
    private String message;
    private List<ProductsTitleDTO> products;

}
