package com.user.usermanagement.entity;

import com.baomidou.mybatisplus.annotation.IdType;
//import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
//import java.time.LocalDateTime;
import java.util.Date;
//import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <p>
 *
 * </p>
 *
 * @author 青哥哥
 * @since 2022-01-26
 */
@Getter
@Setter
@TableName("sys_user")
@ToString
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String username;

    private String password;

    private String nickname;

    private String email;

    private String phone;

    private String address;

    private Date createtime;

    private String avatarurl;

//    private String role;
//
//    @TableField(exist = false)
//    private List<Course> courses;
//
//    @TableField(exist = false)
//    private List<Course> stuCourses;

}
