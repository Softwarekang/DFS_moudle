package com.epi.java.blog_dao.moudle;

import javax.persistence.*;
import java.util.Date;

/**
 * @email jingyechenfu@aliyun.com
 * @author:SoftwareKang
 */
@Entity
@Table(name = "user")
public class User {

    /*
    the range of Integer is 0 - 2^31-1 2147483647
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private  Integer  id;

    /*
    the range of short is 0 -  32767
     */
    @Column(name = "age")
    private short age;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    /*
    the range of Integer can show be ten numbers
     */
    @Column(name = "visit_times")
    private Integer visitTimes;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getVisitTimes() {
        return visitTimes;
    }

    public void setVisitTimes(Integer visitTimes) {
        this.visitTimes = visitTimes;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age='" + age + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", visitTimes=" + visitTimes +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
