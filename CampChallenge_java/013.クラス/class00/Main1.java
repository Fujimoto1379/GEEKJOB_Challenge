/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class00;

/**
 *
 * @author Ryo
 */
public class Main1 {
    public static void main (String[] args) {
        // Main1クラスのClass1インスタンス生成
        Class1 test = new Class1();
        Class1 test2 = new Class1();
        
        // Class1インスタンスのsetHumanメソッドを利用
        test.setProfile("山田",10, "東京");
        test2.setProfile("田中",20, "大阪");

        test.printProfile();
        test2.printProfile();

    }


    
}
