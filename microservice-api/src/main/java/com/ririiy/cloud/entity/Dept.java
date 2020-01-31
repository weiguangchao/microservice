package com.ririiy.cloud.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import lombok.Data;

@Data
public class Dept implements Serializable {

    private static final long serialVersionUID = -2135990212313266212L;

    @TableId(type = IdType.AUTO)
    private Long deptNo;

    private String deptName;

    private String dbSource;
    
}
