package com.longrise.spring.domain;

public class Grade {
    private String gid; // 班级编号
    private String gname; // 班级名称
    private int numOfStudents; // 班级学生人数

    public void setGid(String gid) {
        this.gid = gid;
    }
    public void setGname(String gname) {
        this.gname = gname;
    }
    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }
    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return "Grade [gid=" + gid + ", gname=" + gname + ", numOfStudents=" + numOfStudents + "]";
    }
}