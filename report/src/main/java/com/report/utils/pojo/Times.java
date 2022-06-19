package com.report.utils.pojo;

import com.google.common.collect.Lists;
import com.report.utils.TimeUtils;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Times {
    private final List<Time> times = Lists.newArrayList();

    public void addTime(LocalDateTime time, String format, String name) {
        this.times.add(new Time(time, format, name));
    }

    public String startTime() {
        return TimeUtils.formatTime(times.get(0).getTime());
    }

    public String[] formatTimes() {
        DateTimeFormatter formatter = TimeUtils.getFormatter("yyyy-MM-dd HH:mm:ss");
        return this.times.stream().map(t -> t.getTime().format(formatter)).toArray(String[]::new);
    }

    public String[] formats() {
        return this.times.stream().map(Time::getFormat).toArray(String[]::new);
    }

    public String[] names() {
        return this.times.stream().map(Time::getName).toArray(String[]::new);
    }

    @AllArgsConstructor
    @Getter
    static class Time {
        private final LocalDateTime time;
        private final String format;
        private final String name;
    }
}
