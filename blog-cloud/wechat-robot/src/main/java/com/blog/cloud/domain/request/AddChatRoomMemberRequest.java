package com.blog.cloud.domain.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "AddChatRoomMemberRequest", description = "AddChatRoomMemberRequest")
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddChatRoomMemberRequest {

    @JsonProperty
    @ApiModelProperty(name = "BaseRequest", value = "BaseRequest")
    private BaseRequest BaseRequest;

    @JsonProperty
    @ApiModelProperty(name = "ChatRoomName", value = "ChatRoomName")
    private String ChatRoomName;

    @JsonProperty
    @ApiModelProperty(name = "AddMemberList", value = "AddMemberList")
    private String AddMemberList;

}