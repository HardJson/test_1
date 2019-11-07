package com.alone.pojo;

import lombok.Data;

import java.util.Date;


@Data
public class Role {
    private Integer id;
    private String userName;
    private String descPro;
    private Integer enabled;
    private Date addTime;
    private Date updateTime;
    private Integer deleted;
}
