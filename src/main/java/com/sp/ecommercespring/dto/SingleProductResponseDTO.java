package com.sp.ecommercespring.dto;

import lombok.*;



import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class SingleProductResponseDTO {
    private Integer id;
    private String title;
    // add more fields later as needed: brand, model, price, images, etc.
}
