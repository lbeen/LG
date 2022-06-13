package com.report.kanban.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.report.kanban.entity.KanbanPage;
import com.report.kanban.entity.KanbanResource;
import com.report.kanban.mapper.KanbanPageMapper;
import com.report.kanban.mapper.KanbanResourceMapper;
import com.report.kanban.service.KanbanPageService;
import com.report.kanban.service.KanbanResourceService;
import org.springframework.stereotype.Service;

@Service
public class KanbanPageServiceImpl extends ServiceImpl<KanbanPageMapper, KanbanPage> implements KanbanPageService {}