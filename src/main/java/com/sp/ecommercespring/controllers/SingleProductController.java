package com.sp.ecommercespring.controllers;

import com.sp.ecommercespring.dto.SingleProductDTO;
import com.sp.ecommercespring.services.ISingleProduct;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SingleProductController {

    private final ISingleProduct service;

    public SingleProductController(ISingleProduct service) {
        this.service = service;
    }

    // Path variable style: /api/products/2
    @GetMapping("/products/{id}")
    public ResponseEntity<SingleProductDTO> getProduct(@PathVariable String id) throws Exception {
        return ResponseEntity.ok(service.getSingle(id));
    }


}