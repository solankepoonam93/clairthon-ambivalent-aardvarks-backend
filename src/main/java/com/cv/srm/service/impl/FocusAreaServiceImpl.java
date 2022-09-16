package com.cv.srm.service.impl;

import com.cv.srm.model.FocusArea;
import com.cv.srm.repository.FocusAreaRepository;
import com.cv.srm.service.FocusAreaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FocusAreaServiceImpl implements FocusAreaService {

    private FocusAreaRepository focusAreaRepository;

    public FocusAreaServiceImpl(FocusAreaRepository focusAreaRepository) {
        this.focusAreaRepository = focusAreaRepository;
    }

    @Override
    public List<FocusArea> getAllFocusAreas() {
        return focusAreaRepository.findAll();
    }

    @Override
    public FocusArea getDesignation(String focusAreaId) {
        return focusAreaRepository.findById(focusAreaId).get();
    }

    @Override
    public FocusArea add(FocusArea focusArea) {
        return focusAreaRepository.save(focusArea);
    }

    @Override
    public FocusArea update(FocusArea focusArea) {
        return focusAreaRepository.save(focusArea);
    }
}
