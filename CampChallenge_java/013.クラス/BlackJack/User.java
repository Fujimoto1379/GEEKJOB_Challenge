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
class User extends Human {

    public void setCard(ArrayList<Integer> n){  //ArrayListで受けたカードをmyCardsに入れる処理

             for(int i= 0; i< n.size(); i++){
               myCards.add(n.get(i));
           }
       }


       public boolean checkSum(){   //16以下だとtrueを返す。
        int result = 0;    
        for(int i= 0; i< myCards.size(); i++){
            result += myCards.get(i);
        }

        if(result<16){
               return true;
           }else{
               return false;
           }
       }


       public int open(){   //myCardの合計値
           int result = 0;
           for(int i= 0; i< myCards.size(); i++){
               result += myCards.get(i);
               
           }
                return result;
       }

}
