package com.mes.timer.task;

import com.mes.timer.utils.SpringUtils;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * 定时任务执行器
 */
@Component
@DependsOn("springUtils")
@RequiredArgsConstructor
public class TimerTaskExecutor {
    private final static Logger logger = LoggerFactory.getLogger(TimerTaskExecutor.class);
    /**
     * 任务配置
     */
    private final TaskConfig taskConfig;

    /**
     * 执行所有定时任务
     */
    @PostConstruct
    public void executeTasks() {
        List<TaskConfig.Task> tasks = taskConfig.getTasks();
        for (TaskConfig.Task task : tasks) {
            TaskCallable callable = SpringUtils.getBean(task.getBean(), TaskCallable.class);
            executeTask(callable, task.getDelay());
            logger.info(task.getName() + "start success");
        }
    }

    /**
     * 执行单个定时任务
     */
    private void executeTask(TaskCallable callable, int delay) {
        new Thread(() -> {
            while (true) {
                boolean left = executeTaskOnce(callable);
                //如果还有数据剩余，线程不等待继续执行
                if (left) {
                    continue;
                }
                //如果没有数据剩余，线程等待指定时间再执行
                try {
                    Thread.sleep(delay);
                } catch (Throwable e) {
                    logger.error("sleep error", e);
                }
            }
        }).start();
    }

    /**
     * 执行单个定时任务一次
     */
    private static boolean executeTaskOnce(TaskCallable callable) {
        try {
            return callable.call();
        } catch (Throwable e) {
            logger.error("task error", e);
            return false;
        }
    }
}
