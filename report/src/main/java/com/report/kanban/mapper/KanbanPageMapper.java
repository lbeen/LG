package com.report.kanban.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.report.kanban.entity.KanbanPage;
import com.report.kanban.entity.KanbanResource;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface KanbanPageMapper extends BaseMapper<KanbanPage> {}
