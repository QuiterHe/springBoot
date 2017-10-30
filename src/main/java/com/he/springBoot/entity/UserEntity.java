package com.he.springBoot.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="web")
public class UserEntity implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;
//
//    @Column(nullable = false, unique = true)
//    private String userName;
//
//    @Column(nullable = false)
//    private String passWord;
//
//    @Column(nullable = false, unique = true)
//    private String email;
//
//    @Column(nullable = true, unique = true)
//    private String nickName;
//
//    @Column(nullable = false)
//    private String regTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
//
//    public String getUserName() {
//        return this.userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getPassWord() {
//        return this.passWord;
//    }
//
//    public void setPassWord(String passWord) {
//        this.passWord = passWord;
//    }
//
//    public String getEmail() {
//        return this.email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getNickName() {
//        return this.nickName;
//    }
//
//    public void setNickName(String nickName) {
//        this.nickName = nickName;
//    }
//
//    public String getRegTime() {
//        return this.regTime;
//    }
//
//    public void setRegTime(String regTime) {
//        this.regTime = regTime;
//    }








}
