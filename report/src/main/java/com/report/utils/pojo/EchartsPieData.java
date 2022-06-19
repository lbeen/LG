package com.report.utils.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Setter
@AllArgsConstructor
public class EchartsPieData {
    @JsonProperty("legend")
    private String[] legend;
    @JsonProperty("series")
    private List<Map<String, Object>> series;
}
