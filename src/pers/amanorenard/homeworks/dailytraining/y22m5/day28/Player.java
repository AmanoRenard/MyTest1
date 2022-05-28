package pers.amanorenard.homeworks.dailytraining.y22m5.day28;

import java.io.Serializable;

class Player implements Serializable {

    private static final long serialVersionUID = 666L;

    private String name;
    private int level;
    private int kill;
    private transient String password;

    public Player(String name, int level,int kill, String password) {
        this.name = name;
        this.level = level;
        this.kill = kill;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", kill=" + kill +
                ", password='" + password + '\'' +
                '}';
    }
}
