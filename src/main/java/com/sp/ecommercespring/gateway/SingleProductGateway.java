package com.sp.ecommercespring.gateway;


import com.sp.ecommercespring.dto.SingleProductDTO;
import com.sp.ecommercespring.dto.SingleProductResponseDTO;
import com.sp.ecommercespring.gateway.api.FakeStoreProductsAPI;
import com.sp.ecommercespring.gateway.api.FakeStoreSingleProductAPI;
import org.springframework.stereotype.Component;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

@Component
public class SingleProductGateway implements ISingleProductGateway {

    private final FakeStoreSingleProductAPI api;

    public SingleProductGateway(FakeStoreSingleProductAPI api) {
        this.api = api;
    }

    @Override
    public SingleProductDTO getProductById(String id) throws IOException {
        Response<SingleProductResponseDTO> resp = api.getSingleProduct(id).execute();
        if (!resp.isSuccessful() || resp.body() == null) {
            throw new IOException("Failed to fetch product id=" + id + ", http=" + resp.code());
        }
        SingleProductResponseDTO body = resp.body();
        return SingleProductDTO.builder()
                .title(body.getTitle())
                .build();
    }
}
