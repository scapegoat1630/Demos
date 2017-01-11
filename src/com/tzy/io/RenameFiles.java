package com.tzy.io;

import java.io.File;

/**
 * Created by zhangpeng12 on 2017/1/11.
 */
public class RenameFiles {
    public static void main(String args[]){
        File dir = new File("D:\\IdeaProjects\\am-chat\\am-server\\src\\main\\webapp\\resources\\userhead");
        File[] files = dir.listFiles();
        for(int i = 0 ; i< files.length; i++){
            files[i].renameTo(new File(i + ".jpg"));
        }
    }

}
