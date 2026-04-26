package com.itheima.puzzlegame.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    public LoginJFrame(){
        this.setSize(488, 500);
        this.setTitle("登录界面");
        this.setAlwaysOnTop(true);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        //显示界面建议写在最后
        this.setVisible( true);
    }
}
