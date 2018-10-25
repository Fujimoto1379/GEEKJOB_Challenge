/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

import java.util.ArrayList;

/**
 *
 * @author Ryo
 */
abstract class Human {
    abstract public int open();
    abstract public void setCard(ArrayList<Integer> n);
    abstract public boolean checkSum();
    
    protected ArrayList<Integer> myCards = new ArrayList<>();

}
