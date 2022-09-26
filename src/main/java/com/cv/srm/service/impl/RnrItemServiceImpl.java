package com.cv.srm.service.impl;

import com.cv.srm.model.Role;
import com.cv.srm.repository.RnrItemRepository;
import com.cv.srm.service.RnrItemService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RnrItemServiceImpl implements RnrItemService {

    private RnrItemRepository rnrItemRepository;

    public RnrItemServiceImpl(RnrItemRepository rnrItemRepository) {
        this.rnrItemRepository = rnrItemRepository;
    }

    @Override
    public List<Role> getAllRnrItems() {
        return rnrItemRepository.findAll();
    }

    @Override
    public Role getDesignation(String rnrItemId) {
        return rnrItemRepository.findById(rnrItemId).get();
    }

    @Override
    public Role add(Role rnrItem) {
        return rnrItemRepository.save(rnrItem);
    }

    @Override
    public Role update(Role rnrItem) {
        return rnrItemRepository.save(rnrItem);
    }
}
