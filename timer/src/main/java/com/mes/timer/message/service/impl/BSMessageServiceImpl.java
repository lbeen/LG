package com.mes.timer.message.service.impl;

import com.mes.timer.dao.Dao;
import org.springframework.stereotype.Service;

@Service("bsMessageService")
public class BSMessageServiceImpl extends AbstractMessageService {
    public BSMessageServiceImpl(Dao bsMesDao) {
        super(bsMesDao);
    }
}
