package com.sp.ecommercespring.controllers;


import com.sp.ecommercespring.dto.ProductsTitleDTO;
import com.sp.ecommercespring.services.IProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/products/category")
public class ProductsController {
    private final IProductService productService;

    public ProductsController(IProductService productService) {
        this.productService = productService;
    }


    @GetMapping
    public List<ProductsTitleDTO> getProducts() throws IOException {
        return this.productService.getProducts();
    }



}
