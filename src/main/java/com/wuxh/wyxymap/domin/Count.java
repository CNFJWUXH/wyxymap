package com.wuxh.wyxymap.domin;

import javax.persistence.*;

@Entity
public class Count {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="countNum")
    private Long countNum;

    public Long getId() {
        return id;
    }

    public Long getCountNum() {
        return countNum;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCountNum(Long countNum) {
        this.countNum = countNum;
    }
}
