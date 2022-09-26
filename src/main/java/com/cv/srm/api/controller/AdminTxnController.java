package com.cv.srm.api.controller;

import com.cv.srm.model.*;
import com.cv.srm.service.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminTxnController {

    private DesignationService designationServiceImpl;
    private CategoryService categoryServiceImpl;
    private FocusAreaService focusAreaServiceImpl;
    private RnrItemService rnrItemServiceImpl;
    private UserService userServiceImpl;

    public AdminTxnController(
            DesignationService designationServiceImpl,
            CategoryService categoryServiceImpl,
            FocusAreaService focusAreaServiceImpl,
            RnrItemService rnrItemServiceImpl,
            UserService userServiceImpl) {
        this.designationServiceImpl = designationServiceImpl;
        this.categoryServiceImpl = categoryServiceImpl;
        this.focusAreaServiceImpl = focusAreaServiceImpl;
        this.rnrItemServiceImpl = rnrItemServiceImpl;
        this.userServiceImpl = userServiceImpl;
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return userServiceImpl.add(user);
    }

    @PostMapping("/designation")
    public Designation createDesignation(@RequestBody Designation designation) {
        return designationServiceImpl.add(designation);
    }

    @PostMapping("/category")
    public Category createCategory(@RequestBody Category category) {
        return categoryServiceImpl.add(category);
    }

    @PostMapping("/focusArea")
    public FocusArea createFocusArea(@RequestBody FocusArea focusArea) {
        return focusAreaServiceImpl.add(focusArea);
    }

    @PostMapping("/rnrItem")
    public Role createRnrItem(@RequestBody Role rnrItem) {
        return rnrItemServiceImpl.add(rnrItem);
    }

    @GetMapping("/designations")
    public List<Designation> getAllDesignations() {
        return designationServiceImpl.getAllDesignations();
    }

    @GetMapping("/categories")
    public List<Category> getAllCategories() {
        return categoryServiceImpl.getAllCategories();
    }

    @GetMapping("/focusAreas")
    public List<FocusArea> getAllFocusAreas() {
        return focusAreaServiceImpl.getAllFocusAreas();
    }

    @GetMapping("/rnrItems")
    public List<Role> getAllRnrItems() {
        return rnrItemServiceImpl.getAllRnrItems();
    }

}
