package com.cv.srm.service;

import com.cv.srm.model.Role;

import java.util.List;

public interface RnrItemService {
    List<Role> getAllRnrItems();
    Role getDesignation(String rnrItemId);
    Role add(Role rnrItem);
    Role update(Role rnrItem);
}
