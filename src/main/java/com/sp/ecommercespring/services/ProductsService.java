package com.sp.ecommercespring.services;

import com.sp.ecommercespring.dto.ProductsTitleDTO;
import com.sp.ecommercespring.gateway.IProductsGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class ProductsService implements IProductService {
    private final IProductsGateway productsGateway;


    public ProductsService(IProductsGateway productsGateway) {
        this.productsGateway=productsGateway;
    }


    @Override
    public List<ProductsTitleDTO> getProducts() throws IOException{
        return this.productsGateway.getProducts();
    }



}
