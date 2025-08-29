package com.sp.ecommercespring.gateway.api;

import com.sp.ecommercespring.dto.ProductsTitleResponseDTO;
import retrofit2.Call;
import retrofit2.http.GET;

import java.io.IOException;

public interface FakeStoreProductsAPI {
    @GET("products/category?type=mobile")
    Call<ProductsTitleResponseDTO> getAllProducts() throws IOException;


}
