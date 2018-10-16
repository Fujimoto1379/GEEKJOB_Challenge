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

    // Javaクラスファイル内
// Class1クラスを継承して、Class2クラスを宣言

// Class1クラスを継承したので、
// clearProfileメソッドを独自のメソッドとして実装
public class Class2 extends Class1 {
    public void clearProfile() {
       this.name = "";
        this.age = 0;
        this.stay = "";       
        
    }
}
