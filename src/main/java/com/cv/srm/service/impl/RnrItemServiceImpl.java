package com.cv.srm.service.impl;

import com.cv.srm.model.RnrItem;
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
    public List<RnrItem> getAllRnrItems() {
        return rnrItemRepository.findAll();
    }

    @Override
    public RnrItem getDesignation(String rnrItemId) {
        return rnrItemRepository.findById(rnrItemId).get();
    }

    @Override
    public RnrItem add(RnrItem rnrItem) {
        return rnrItemRepository.save(rnrItem);
    }

    @Override
    public RnrItem update(RnrItem rnrItem) {
        return rnrItemRepository.save(rnrItem);
    }
}
