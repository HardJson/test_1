package com.alone.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;


@Data
//表名
@Table(name = "cskaoyan_mall_role")
public class Role {

    @Id
    //自增主键
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    private String name;
    private String descPro;
    private Integer enabled;
    private Date addTime;
    private Date updateTime;
    private Integer deleted;
    /**
     * 若是数据库中没有用到的字段
     * 使用
     */
    @Transient
    private String note;
}
