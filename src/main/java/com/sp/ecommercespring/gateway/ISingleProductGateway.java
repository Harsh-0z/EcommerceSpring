package com.sp.ecommercespring.gateway;

import com.sp.ecommercespring.dto.SingleProductDTO;
import java.io.IOException;

public interface ISingleProductGateway {
    SingleProductDTO getProductById(String id) throws IOException;
}