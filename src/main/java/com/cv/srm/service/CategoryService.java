package com.cv.srm.service;

import java.util.List;

import com.cv.srm.model.Category;

public interface CategoryService {

    List<Category> getAllCategories();
    Category getDesignation(String categoryId);
    Category add(Category category);
    Category update(Category category);

}
