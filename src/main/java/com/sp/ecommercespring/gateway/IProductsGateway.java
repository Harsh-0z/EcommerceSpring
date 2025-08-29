package com.sp.ecommercespring.gateway;

import com.sp.ecommercespring.dto.ProductsTitleDTO;

import java.io.IOException;
import java.util.List;

public interface IProductsGateway {

    List<ProductsTitleDTO> getProducts() throws IOException;
}
