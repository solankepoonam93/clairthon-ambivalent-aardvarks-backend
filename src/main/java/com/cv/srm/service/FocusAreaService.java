package com.cv.srm.service;

import com.cv.srm.model.FocusArea;

import java.util.List;

public interface FocusAreaService {
    List<FocusArea> getAllFocusAreas();
    FocusArea getDesignation(String focusAreaId);
    FocusArea add(FocusArea focusArea);
    FocusArea update(FocusArea focusArea);
}
