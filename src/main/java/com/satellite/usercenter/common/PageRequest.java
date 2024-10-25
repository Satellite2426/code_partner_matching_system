package com.satellite.usercenter.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用分页请求参数
 *
 * @author satellite
 */
@Data
public class PageRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    /**
     * 页面大小 - 每页有多少数据
     */
    protected int pageSize = 10;

    /**
     * 当前是第几页
     */
    protected int pageNum = 1;

}
