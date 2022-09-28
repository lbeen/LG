package com.mes.timer.task;

import com.google.common.collect.Lists;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * 任务配置
 */
@Setter
@Configuration
@ConfigurationProperties("timer")
@PropertySource(value = "classpath:TimerTask.yml", encoding = "UTF-8", factory = YmlPropertySourceFactory.class)
public class TaskConfig {
    private List<Map<String, Object>> tasks;

    public List<Task> getTasks(){
        if (CollectionUtils.isEmpty(this.tasks)) {
            return Collections.emptyList();
        }
        List<Task> tasks = Lists.newArrayList();
        for (Map<String, Object> taskMap : this.tasks) {
            Task task = new Task();
            task.setName(taskMap.get("name").toString());
            task.setBean(taskMap.get("bean").toString());
            task.setDelay((int)taskMap.get("delay"));
            tasks.add(task);
        }
        return tasks;
    }

    @Setter
    @Getter
    public static class Task{
        private String name;
        private String bean;
        private int delay;
    }
}

