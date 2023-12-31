package com.flyCommon.model.request.Interface;

import lombok.Data;

import java.io.Serializable;

@Data
public class InterfaceInfoUpdateRequest implements Serializable {

    /**
     * 主键
     */

    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 接口地址
     */
    private String url;

    private Integer port;

    private String IPAddress;

    /**
     * 调用次数
     */
    private Integer invokeCount;

//    /**
//     * 每百条的接口调用价格
//     */
//    private double price;

    /**
     * 请求参数
     */
    private String requestParams;

    /**
     * 请求头
     */
    private String requestHeader;

    /**
     * 响应头
     */
    private String responseHeader;

    /**
     * 接口状态（0-关闭，1-开启）
     */
    private Integer status;

    /**
     * 请求类型
     */
    private String method;


    /**
     * 接口方法名字
     */
    private String methodName;

    /**
     * sdk对应的路径
     */
    private String sdkPath;

    private String avatarUrl;


    private static final long serialVersionUID = 1L;
}