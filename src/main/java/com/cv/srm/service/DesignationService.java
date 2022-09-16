package com.cv.srm.service;

import com.cv.srm.model.Designation;

import java.util.List;

public interface DesignationService {

    List<Designation> getAllDesignations();
    Designation getDesignation(String designationId);
    Designation add(Designation designation);
    Designation update(Designation designation);

}
