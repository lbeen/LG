package com.report.manage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.report.manage.entity.KanbanResource;
import com.report.manage.mapper.KanbanResourceMapper;
import com.report.manage.service.KanbanResourceService;
import org.springframework.stereotype.Service;

@Service
public class KanbanResourceServiceImpl extends ServiceImpl<KanbanResourceMapper, KanbanResource> implements KanbanResourceService {}
