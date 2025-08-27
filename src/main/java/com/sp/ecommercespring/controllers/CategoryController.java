package com.sp.ecommercespring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//@Controller + @ResponseBody
@RequestMapping("api/categories")//common uri(url) @RequestMapping  -> it helps to divide the controllers based on uri
public class CategoryController {

    //for mapping get rq and send the res.
    @GetMapping("count")
    public int getCategoryCount() {
        return 5;
    }

    @GetMapping
    public String getCategory(){
        return "Electronics";
    }

    //for post rq mapping
    @PostMapping
    public String getPostCategory(){
        return "Post Electronics";
    }




}
