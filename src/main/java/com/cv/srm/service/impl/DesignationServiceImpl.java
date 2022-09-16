package com.cv.srm.service.impl;

import com.cv.srm.model.Designation;
import com.cv.srm.repository.DesignationRepository;
import com.cv.srm.service.DesignationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesignationServiceImpl implements DesignationService {

    private DesignationRepository designationRepository;

    public DesignationServiceImpl(DesignationRepository designationRepository) {
        this.designationRepository = designationRepository;
    }

    @Override
    public List<Designation> getAllDesignations() {
        return designationRepository.findAll();
    }

    @Override
    public Designation getDesignation(String designationId) {
        return designationRepository.findById(designationId).get();
    }

    @Override
    public Designation add(Designation designation) {
        return designationRepository.save(designation);
    }

    @Override
    public Designation update(Designation designation) {
        return designationRepository.save(designation);
    }
}
