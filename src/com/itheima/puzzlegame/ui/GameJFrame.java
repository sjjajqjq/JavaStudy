package com.itheima.puzzlegame.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.classfile.instruction.SwitchCase;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    int[][] arr = new int[4][4];
    //定义胜利判断数组
    int[][] win = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    //定义路径变量
    String path = "image\\girl\\girl3\\";

    //定义变量存储步数
    int step = 0;

    //创建功能菜单项目
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");
    //创建关于菜单项目
    JMenuItem accountItem = new JMenuItem("公众号");
    //创建更换项目子项目
    JMenuItem beauty = new JMenuItem("美女");
    JMenuItem animal = new JMenuItem("动物");
    JMenuItem sport = new JMenuItem("运动");

    public GameJFrame() {
        //初始化界面
        initUI();
        //初始化菜单
        initMenu();
        //打乱数组
        initData(arr);


        //初始化图片(根据打乱的数组来加载图片)
        initImage();

        //显示界面建议写在最后
        this.setVisible(true);
    }

    //定义x,y
    int x = 0;
    int y = 0;

    //打乱数组
    private int[][] initData(int[][] arr) {
        int[] temparr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0};
        Random r = new Random();

        for (int i = 0; i < temparr.length; i++) {

            int index = r.nextInt(temparr.length);
            int temp = temparr[i];
            temparr[i] = temparr[index];
            temparr[index] = temp;
        }
        for (int i = 0; i < temparr.length; i++) {
            arr[i / 4][i % 4] = temparr[i];
            //判断0的位置`
            if (temparr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
        }
        return arr;
    }

    //初始化图片
    private void initImage() {

        //清除图片
        this.getContentPane().removeAll();

        //满足胜利条件后添加胜利图片
        if (victory()) {
            JLabel winJLabel = new JLabel(new ImageIcon("image\\win.png"));
            winJLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winJLabel);
        }

        //添加步数组件
        JLabel stepCount = new JLabel("步数：" + step);
        stepCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepCount);


        //外层循环 ---x轴添加完毕进入下一个y轴
        for (int i = 0; i < 4; i++) {
            //内层循环 ---x 轴添加
            for (int j = 0; j < 4; j++) {
                //获取打乱的图片编号
                int num = arr[i][j];
                //创建一个JLable对象
                JLabel JLabel = new JLabel(new ImageIcon(path + num + ".jpg"));
                //设置图片储存的位置
                JLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                //把管理容器添加到界面中
                this.getContentPane().add(JLabel);
                //添加边框
                JLabel.setBorder(new BevelBorder(1));
            }
        }
        //添加背景图片
        JLabel background = new JLabel(new ImageIcon("image\\background.png"));
        background.setBounds(40, 40, 508, 560);
        this.getContentPane().add(background);

        //刷新图片
        this.getContentPane().repaint();

    }


    private void initMenu() {
        //创建一个菜单栏
        JMenuBar jmb = new JMenuBar();
        //创建菜单
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");
        //创建更换图片
        JMenu changeImage = new JMenu("更换图片");

        //把菜单项目添加到菜单
        functionJMenu.add(changeImage);
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        //把更换图片的子项目添加进去
        changeImage.add(beauty);
        changeImage.add(animal);
        changeImage.add(sport);

        //给条目绑定事件
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);
        beauty.addActionListener(this);
        animal.addActionListener(this);
        sport.addActionListener(this);

        //把菜单添加到菜单栏
        jmb.add(functionJMenu);
        jmb.add(aboutJMenu);
        //把菜单栏添加到界面
        this.setJMenuBar(jmb);
    }

    private void initUI() {
        this.setSize(603, 680);
        this.setTitle("拼图游戏 v1.0");
        this.setAlwaysOnTop(true);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        //添加键盘监听事件
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //判断游戏是否已经胜利，如果胜利就结束按键控制
        if (victory()) {
            return;
        }

        int code = e.getKeyCode();
        if (code == 32) {
            this.getContentPane().removeAll();
            //加载第一张完整图片
            JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);
            //加载背景图片
            JLabel background = new JLabel(new ImageIcon("src\\com\\itheima\\puzzlegame\\image\\background.png"));
            background.setBounds(40, 40, 508, 560);
            this.getContentPane().add(background);
            //刷新界面
            this.getContentPane().repaint();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        //判断游戏是否已经胜利，如果胜利就结束按键控制
        if (victory()) {
            return;
        }

        //定义变量code存储整形
        int code = e.getKeyCode();
        if (code == 37) {
            if (y + 1 > 3) {
                return;
            }
            arr[x][y] = arr[x][y + 1];
            arr[x][y + 1] = 0;
            y++;
            initImage();
            //添加步数
            step++;
        } else if (code == 38) {
            if (x + 1 > 3) {
                return;
            }
            arr[x][y] = arr[x + 1][y];
            arr[x + 1][y] = 0;
            x++;
            initImage();
            //添加步数
            step++;
        } else if (code == 39) {
            if (y - 1 < 0) {
                return;
            }
            arr[x][y] = arr[x][y - 1];
            arr[x][y - 1] = 0;
            y--;
            initImage();
            //添加步数
            step++;
        } else if (code == 40) {
            if (x - 1 < 0) {
                return;
            }
            arr[x][y] = arr[x - 1][y];
            arr[x - 1][y] = 0;
            x--;
            initImage();
        } else if (code == 32) {
            initImage();
        } else if (code == 87) {
            arr = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };
            initImage();
        }
    }

    //判断胜利条件
    public boolean victory() {
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != win[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == replayItem) {
            //计步器清零
            step = 0;
            //打乱数据
            initData(arr);
            //重新加载图片
            initImage();
        } else if (obj == reLoginItem) {
            //关闭当前游戏界面
            this.setVisible(false);
            //打开登录界面
            new LoginJFrame();
        } else if (obj == closeItem) {
            System.exit(0);
        } else if (obj == accountItem) {
            //创建弹框对象
            JDialog about = new JDialog();
            //创建一个管理图片的容器对象JLabel
            JLabel jLabel = new JLabel(new ImageIcon("image\\about.jpg"));
            //设置位置和宽高
            jLabel.setBounds(0, 0, 1304, 1777);
            //把管理图片的容器添加到弹框中
            about.getContentPane().add(jLabel);
            //设置弹框大小
            about.setSize(458, 541);
            //设置弹框标题
            about.setTitle("公众号");
            //设置弹框总在最前
            about.setAlwaysOnTop(true);
            //设置弹框下方窗口无法点击
            about.setModal(true);
            //设置弹框关闭模式
            about.setDefaultCloseOperation(2);
            //设置弹框位置
            about.setLocationRelativeTo(null);
            //显示弹框
            about.setVisible(true);

        } else if (obj == beauty) {
            Random r = new Random();
            int index = r.nextInt(13) + 1;
            path = "image\\girl\\girl" + index + "\\";
            initData(arr);
            step = 0;
            initImage();
        } else if (obj == animal) {
            Random r = new Random();
            int index = r.nextInt(8) + 1;
            path = "image\\animal\\animal" + index + "\\";
            initData(arr);
            step = 0;
            initImage();
        } else if (obj == sport) {
            Random r = new Random();
            int index = r.nextInt(10) + 1;
            path = "image\\sport\\sport" + index + "\\";
            initData(arr);
            step = 0;
            initImage();
        }
    }
}
