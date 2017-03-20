package com.tzy.io;

import java.io.*;

/**
 * Created by zhangpeng12 on 2017/1/11.
 */
public class Files {
    public static void main(String args[]){
       try {
           test3();
       }catch (Exception e){
           e.printStackTrace();
       }
    }

    private static void test1() {
        File dir = new File("D:\\IdeaProjects\\am-chat\\am-server\\src\\main\\webapp\\resources\\userhead");
        File[] files = dir.listFiles();
        for(int i = 0 ; i< files.length; i++){
            files[i].renameTo(new File(i + ".jpg"));
        }
    }

    private static void test2() {
        char ch;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));  //将字节流转为字符流，带缓冲
        try {
            while ((ch = (char) in.read()) != -1){
                System.out.print(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void test3() throws  Exception{
        BufferedReader in = new BufferedReader(new FileReader("Files.java"));
        String s;
        try {
            while ((s = in.readLine()) != null){
                System.out.println(s);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
