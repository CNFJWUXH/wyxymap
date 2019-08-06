package com.wuxh.wyxymap.domin;

import javax.persistence.*;

@Entity
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;//地点名称

    @Column(name = "introdution")
    private String introdution;//简介

    @Column(name = "x")
    private Integer x;//横坐标

    @Column(name = "y")
    private Integer y;//纵坐标

    @Column(name = "link")
    private String link;//链接

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getIntrodution() {
        return introdution;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIntrodution(String introdution) {
        this.introdution = introdution;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
