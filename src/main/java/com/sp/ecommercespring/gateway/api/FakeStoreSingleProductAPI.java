package com.sp.ecommercespring.gateway.api;

import com.sp.ecommercespring.dto.SingleProductResponseDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.io.IOException;

public interface FakeStoreSingleProductAPI {
    @GET("products/{id}")
    Call<SingleProductResponseDTO> getSingleProduct(@Path("id") String id) throws IOException;
}
