package com.gittest;

public class FirstFile {
    public static void main(String[] args) {
        System.out.println("Hello World");
        SecondFile sf = new SecondFile();
        sf.ShowMe("这是ShowMe函数的方法");
        ThirdFile tf = new ThirdFile(01,"yx",true);
        System.out.println(tf.getId());
        System.out.println(tf.getName());
        tf.setName("Yang Xiao");
        System.out.println(tf.getName());
    }
}
