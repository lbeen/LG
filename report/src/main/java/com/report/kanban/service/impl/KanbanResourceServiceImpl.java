package com.report.kanban.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.report.kanban.entity.KanbanResource;
import com.report.kanban.mapper.KanbanResourceMapper;
import com.report.kanban.service.KanbanResourceService;
import org.springframework.stereotype.Service;

@Service
public class KanbanResourceServiceImpl extends ServiceImpl<KanbanResourceMapper, KanbanResource> implements KanbanResourceService {}
