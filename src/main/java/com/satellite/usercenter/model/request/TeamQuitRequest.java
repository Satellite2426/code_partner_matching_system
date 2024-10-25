package com.satellite.usercenter.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户退出队伍请求体
 */
@Data
public class TeamQuitRequest implements Serializable {

    private static final long serialVersionUID = -8322736331084510868L;

    /**
     * 队伍id
     */
    private Long teamId;

}

