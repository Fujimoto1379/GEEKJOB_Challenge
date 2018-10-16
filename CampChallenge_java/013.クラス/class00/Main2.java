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
public class Main2 {
    public static void main (String[] args) {
    // Main2クラスのClass1インスタンス生成
        Class2 test = new Class2();
               
        // Class1インスタンスのsetHumanメソッドを利用
        test.setProfile("山田",10, "東京");
        
        test.printProfile();
        
        test.clearProfile();
        
        test.printProfile();
      
    }
}
