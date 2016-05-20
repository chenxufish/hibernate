package com.stone.hibernate.Util;

import java.util.Random;

/**
 * @auther chenxu03 on 2016/5/20.
 */
public class StrUtil {


    public static String getRandomString(int n, String str) { //length表示生成字符串的长度
//        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            int number = random.nextInt(str.length());
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }


}
