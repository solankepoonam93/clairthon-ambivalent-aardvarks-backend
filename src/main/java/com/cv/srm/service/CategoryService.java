package com.cv.srm.service;

import com.cv.srm.model.Category;
import com.cv.srm.model.Designation;

import java.util.List;

public interface CategoryService {

    List<Category> getAllCategories();
    Category getDesignation(String categoryId);
    Category add(Category category);
    Category update(Category category);

}
