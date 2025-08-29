package com.sp.ecommercespring.gateway;

import com.sp.ecommercespring.dto.FakeStoreCategoryResponseDTO;
import com.sp.ecommercespring.dto.ProductsTitleDTO;
import com.sp.ecommercespring.dto.ProductsTitleResponseDTO;
import com.sp.ecommercespring.gateway.api.FakeStoreProductsAPI;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductsGateway implements IProductsGateway {

    private final FakeStoreProductsAPI fakeStoreProductsAPI;

    public ProductsGateway(FakeStoreProductsAPI fakeStoreProductsAPI) {
        this.fakeStoreProductsAPI = fakeStoreProductsAPI;
    }

    @Override
    public List<ProductsTitleDTO> getProducts() throws IOException{
        ProductsTitleResponseDTO response = fakeStoreProductsAPI.getAllProducts().execute().body();

        if(response==null){
            throw new IOException("FAILED TO FETCH THE products from categories");
        }

        return response.getProducts().stream()
                .map(product -> ProductsTitleDTO.builder()
                        .title(product.getTitle())  // only title field
                        .build()
                )
                .toList();


    }





}
