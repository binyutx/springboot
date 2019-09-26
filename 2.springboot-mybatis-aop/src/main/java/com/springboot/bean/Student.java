package com.springboot.bean;

import lombok.Data;

import java.io.Serializable;
@Data
public class Student implements Serializable {

    private static final long serialVersionUID = -8528057460673539526L;

    private Integer id;
    private String userName;
    private String sex;

}
