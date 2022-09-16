package com.cv.srm.service;

import com.cv.srm.model.RnrItem;

import java.util.List;

public interface RnrItemService {
    List<RnrItem> getAllRnrItems();
    RnrItem getDesignation(String rnrItemId);
    RnrItem add(RnrItem rnrItem);
    RnrItem update(RnrItem rnrItem);
}
