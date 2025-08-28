package com.sp.ecommercespring.services;

import com.sp.ecommercespring.dto.CategoryDTO;
import com.sp.ecommercespring.gateway.ICategoryGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
@Service
public class FakeStoreCategoryService implements ICategoryService {
    private final ICategoryGateway categoryGateway;
    public FakeStoreCategoryService(ICategoryGateway categoryGateway) {
        this.categoryGateway = categoryGateway;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException{
        return categoryGateway.getAllCategories();
    }



}
