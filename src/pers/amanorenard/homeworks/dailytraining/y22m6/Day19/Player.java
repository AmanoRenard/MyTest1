package pers.amanorenard.homeworks.dailytraining.y22m6.Day19;

public class Player {
    private String password;
    public String name;
    public final String name2 = null;
    int kills;
    protected String skills;
    private String address;

    public Player() {
    }

    public Player(String password, String name, int kills, String skills) {
        this.password = password;
        this.name = name;
        this.kills = kills;
        this.skills = skills;
    }

    public String getName2() {
        return name2;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public void play() {
        System.out.println("输入密码才能玩游戏哦！");
    }

    public void play(String text) {
        if (text.equals(this.password)) System.out.println("密码正确，开始玩吧！");
        else System.out.println("密码错误！");
    }

    private String getPassword() {
        return this.password;
    }

    @Override
    public String toString() {
        return "Player{" +
                "password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", name2='" + name2 + '\'' +
                ", kills=" + kills +
                ", skills='" + skills + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
