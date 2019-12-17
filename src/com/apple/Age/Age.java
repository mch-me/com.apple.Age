package com.apple.Age;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        int adult = 18;

        System.out.println("请输入你的年龄：");
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        System.out.println("你的年龄是:"+ age);

        if ( age < adult) {
            System.out.println("小姐姐");
        } else {
            System.out.println("大姐姐");
        }
    }
}
