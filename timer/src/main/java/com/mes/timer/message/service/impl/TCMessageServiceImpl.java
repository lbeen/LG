package com.mes.timer.message.service.impl;

import com.mes.timer.dao.Dao;
import org.springframework.stereotype.Service;

@Service("tcMessageService")
public class TCMessageServiceImpl extends AbstractMessageService {
    public TCMessageServiceImpl(Dao tcMesDao) {
        super(tcMesDao);
    }
}
