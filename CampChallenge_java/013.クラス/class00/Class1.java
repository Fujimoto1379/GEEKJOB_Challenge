package class00;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryo
 */
public class Class1 {
    // Class1クラスの宣言
    // フィールドの宣言
    public String name = "";
    public int age = 0;
    public String stay = "";

    // メソッドの宣言
    public void setProfile(String n, int a, String s) {
        // 引数をフィールドへ設定
        this.name = n;
        this.age = a;
        this.stay = s;        
    }
    
    public void printProfile() {
        System.out.print(this.name);
        System.out.print(this.age);
        System.out.println(this.stay);
    }

}
