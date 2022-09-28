package com.report.utils.pojo;

import com.google.common.collect.Lists;
import com.report.utils.TimeUtils;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Shifts {
    private final List<Shift> times = Lists.newArrayList();

    public void add(LocalDateTime time, String format, String name) {
        this.times.add(new Shift(time, format, name));
    }

    public String startTime() {
        return TimeUtils.formatTime(times.get(0).getTime());
    }

    public String[] formatTimes() {
        DateTimeFormatter formatter = TimeUtils.getFormatter(TimeUtils.PATTERN_TIME);
        return this.times.stream().map(t -> t.getTime().format(formatter)).toArray(String[]::new);
    }

    public String[] formats() {
        return this.times.stream().map(Shift::getFormat).toArray(String[]::new);
    }

    public String[] names() {
        return this.times.stream().map(Shift::getName).toArray(String[]::new);
    }

    @Getter
    @AllArgsConstructor
    static class Shift {
        private final LocalDateTime time;
        private final String format;
        private final String name;
    }
}
