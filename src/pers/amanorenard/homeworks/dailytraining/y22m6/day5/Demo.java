package pers.amanorenard.homeworks.dailytraining.y22m6.day5;

import javax.swing.*;

class Demo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("测试");
        JPanel panel = new JPanel(null);
        frame.add(panel);
        frame.setBounds(380,100,800,600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel label = new JLabel("你好，世界。");
        label.setBounds(10,50,80,30);
        panel.add(label);
        frame.setVisible(true);
    }
}
