package com.report.utils.web;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
public class EchartsSingleData {
    @JsonProperty("xAxis")
    private String[] xAxis;
    @JsonProperty("yAxis")
    private double[] yAxis;
}