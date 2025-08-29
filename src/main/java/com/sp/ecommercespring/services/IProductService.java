package com.sp.ecommercespring.services;

import com.sp.ecommercespring.dto.ProductsTitleDTO;

import java.io.IOException;
import java.util.List;

public interface IProductService {

    List<ProductsTitleDTO> getProducts() throws IOException;

}
