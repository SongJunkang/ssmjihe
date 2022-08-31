package com.atguigu.spring;

public class pojo {
    private Integer i;
    private Integer j;

    public  int add(int i,int j){

        return i+j;
    }

    public pojo(Integer i, Integer j) {
        this.i = i;
        this.j = j;
    }

    public pojo() {
    }

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    public Integer getJ() {
        return j;
    }

    public void setJ(Integer j) {
        this.j = j;
    }
}
