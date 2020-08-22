package com.longrise.spring.domain;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
    private String sid; // 编号
    private String sname; // 姓名
    private String[] hobbies; // 兴趣
    private List<String> games; // 所玩游戏
    private Map<String, String> cards; // 拥有的银行卡
    private Set<String> stories; // 阅读的故事书
    private Grade grade; // 所在班级
    private Properties info;

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public void setGames(List<String> games) {
        this.games = games;
    }

    public void setCards(Map<String, String> cards) {
        this.cards = cards;
    }

    public void setStories(Set<String> stories) {
        this.stories = stories;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return "Student [cards=" + cards + ", games=" + games + ", grade=" + grade + ", hobbies="
                + Arrays.toString(hobbies) + ", info=" + info + ", sid=" + sid + ", sname=" + sname + ", stories="
                + stories + "]";
    }

}