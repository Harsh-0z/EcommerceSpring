package com.sp.ecommercespring.services;

import com.sp.ecommercespring.dto.SingleProductDTO;
import com.sp.ecommercespring.gateway.ISingleProductGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;


@Service
public class SingleProductService implements ISingleProduct {

    private final ISingleProductGateway gateway;

    public SingleProductService(ISingleProductGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public SingleProductDTO getSingle(String id) throws IOException {
        return gateway.getProductById(id);
    }
}