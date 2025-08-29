package com.sp.ecommercespring.services;

import com.sp.ecommercespring.dto.SingleProductDTO;

import java.io.IOException;
import java.util.List;

public interface ISingleProduct {
    SingleProductDTO getSingle(String id) throws IOException;
}
