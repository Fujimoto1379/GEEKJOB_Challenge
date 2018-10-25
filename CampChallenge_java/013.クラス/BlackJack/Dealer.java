/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Ryo
 */

class Dealer extends Human {
        public ArrayList<Integer> cards = new ArrayList<>();
        
                
        public Dealer(){
            for(int i = 1; i <= 4; i++){      //13枚のカードをcardsにaddする処理を４回繰り返す
                        for (int j = 1; j <= 13; j++ ){     //13枚のトランプをプリントしてcardsに入れる処理
                                              
                        cards.add(j);
                        }
                    }
            
        }
               

        public ArrayList<Integer> deal(){

            ArrayList<Integer> num = new ArrayList<>();  //ArrayListにnumのカード情報を入れる。

            Random rand = new Random();  //cardsの全要素をランダムにしている

            for(int i= 0; i< 2; i++){

            Integer index= rand.nextInt(cards.size());

            num.add(cards.get(index));
  
        }
            return num;
        
        }

        public ArrayList<Integer> hit(){

            ArrayList<Integer> num1 = new ArrayList<>();    //ArrayListにnum1のカード情報を入れる

            Random rand = new Random();

            for(int i= 0; i< 1; i++){

            Integer index= rand.nextInt(cards.size());
            
            num1.add(cards.get(index));
            

        }
            return num1;
           
        }


        public void setCard(ArrayList<Integer> n){   //ArrayListで受けたカードをmyCardsに入れる処理

             for(int i= 0; i< n.size(); i++){
               myCards.add(n.get(i));
            }
        }


        public boolean checkSum(){   //16以下だとtrueを返す。
            int result= 0;
            for(int i= 0; i< myCards.size(); i++){ 
               result += myCards.get(i);
            }
        if(result < 17){
               return true;
           }else{
               return false;
           }    //合計してから処理する
        }


        public int open(){   //mycardの合計値
           int result= 0;
           for(int i= 0; i< myCards.size(); i++){          
               result += myCards.get(i);
               }
                return result;
        }
        
}
