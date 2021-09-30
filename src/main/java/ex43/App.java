package ex43;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Rithvik Dinesh
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String userName = scanIn("Site name: ");
        String userAuthor = scanIn("Author: ");
        String javascript = scanIn("Do you want a folder for Javascript? ");
        String CSS = scanIn("Do you want a folder for CSS? ");
        createFile object = new createFile();
        object.newFile(userName,userAuthor);
        Boolean boojavascript = folderMethod(javascript,"/js");
        Boolean booCSS = folderMethod(CSS,"/css");
        printingTime(userName,userAuthor,boojavascript,booCSS);
    }
    public static String scanIn (String s) {
        Scanner myInput = new Scanner(System.in);
        System.out.print(s);
        return myInput.nextLine();
    }

    public static Boolean folderMethod(String s,String type) {
        if(s.equals("y") || s.equals("Y"))
        {
            createFolder folder = new createFolder();
            folder.newFolder(type);
            return true;
        }
        return false;
    }

    public static void printingTime(String name, String author, Boolean js, Boolean CSS)
    {
        System.out.println("Created ./website/" + name);
        System.out.println("Created ./website/" + name +"/index.html");
        if(js == true)
            System.out.println("Created ./website/" + name +"/js/");
        if(CSS == true)
            System.out.println("Created ./website/" + name +"/css/");
    }
}
