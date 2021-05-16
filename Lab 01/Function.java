package com.poly;

import java.util.Scanner;

public class Function {
    public static Scanner sc = new Scanner(System.in);
    
    public static int iInput(){       
        while(!sc.hasNextInt()){
            String except = sc.next();
            
            System.out.println(except + " không hợp lệ!");
            System.out.print("> Nhập lại: ");
        }
        
        return sc.nextInt();
    }
    
    public static double dInput(){       
        while(!sc.hasNextDouble()){
            String except = sc.next();
            
            System.out.println(except + " không hợp lệ!");
            System.out.print("> Nhập lại: ");
        }
        
        return sc.nextDouble();
    }
    
    public static String sInput(){       
        return sc.nextLine();
    }
    
    public static void clear(){
        sc.nextLine();
    }
    
    public static void Space(int n){
        for(int i = 0; i < n; i++){
            System.out.print(" ");
        }
    }
    
    public static void Separate(int n){
        for(int i = 0; i < n; i++){
            System.out.print(".");
        }
    }
    
    public static void menuText(String text1, String text2, String text3, String text4){       
        String menu = "< FPT POLYTECHNIC - MOB1023 >";
        Space((50 - menu.length()) / 2);
        System.out.println("\u001B[31m" + menu);
        String app = "CHUNG NGUYỄN ANH TUẤN";
        Space((50 - app.length()) / 2);
        System.out.println(app + "\u001B[0m\n");
        String menu1 = "PS15194";
        Space((50 - menu1.length()) / 2);
        System.out.println("\u001B[34m" + menu1 + "\u001B[0m");
        
        Separate(50);
        System.out.print("\n");
       
        String text5 = ".     5 - Thoát";
        
        System.out.print(text1);
        Space(49 - text1.length());
        Separate(1);
        System.out.print("\n");
        
        System.out.print(text2);
        Space(49 - text2.length());
        Separate(1);
        System.out.print("\n");
        
        System.out.print(text3);
        Space(49 - text3.length());
        Separate(1);
        System.out.print("\n");
        
        System.out.print(text4);
        Space(49 - text4.length());
        Separate(1);
        System.out.print("\n");
        
        System.out.print(text5);
        Space(49 - text5.length());
        Separate(1);
        System.out.print("\n");
        
        Separate(50);
        System.out.print("\n");
    }
}
