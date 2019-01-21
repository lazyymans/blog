package com.blog.cloud.domain.request;

import com.blog.cloud.domain.shared.StatReport;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author lxw
 * @date 2019/1/20
 * @description
 */
@Data
@ApiModel(value = "StatReportRequest", description = "StatReportRequest")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StatReportRequest {

    @JsonProperty
    @ApiModelProperty(name = "BaseRequest", value = "BaseRequest")
    private BaseRequest BaseRequest;

    @JsonProperty
    @ApiModelProperty(name = "Count", value = "Count")
    private Integer Count;

    @JsonProperty
    @ApiModelProperty(name = "List", value = "List")
    private List<StatReport> List;
}
