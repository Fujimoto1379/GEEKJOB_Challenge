package BlackJack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Ryo
 */
public class BlackJack {

    public static void main(String[]arg){

        User man= new User();        
        Dealer ai= new Dealer();
        
        //ai.Dealer();  //Dealerの山札を作る。

        man.setCard(ai.deal()); //Userでdealメソッドで得た2枚をmyCardsに入れる。
        
        ai.setCard(ai.deal()); //Dealerでdealメソッドで得た2枚をmyCardsに入れる。
        
        System.out.println("あなたの手札は" + man.open() + "です。"); //myCardsの合計値を出す。
        
        System.out.println("相手の手札は" + ai.open() + "です。");  //DealerのmyCardsの合計値を出す。
        
        while(man.checkSum()){   //合計値が16以下だともう1枚引く。
            man.setCard(ai.hit());
        
        
        System.out.println("あなたの手札は" + man.open() + "です。");  //Dealerより前に追加後の合計値の結果を出す。
        }
        
        if(man.open() > 21){
            System.out.print("あなたの負けです。");
        }else {
            
        while (ai.checkSum()){  //Dealerの合計値が16以下だともう1枚引く。
            ai.setCard(ai.hit());
        
        System.out.println("相手の手札は" + ai.open() + "です。"); //追加後の合計値を出す。
        System.out.println("");
        }
        
        if(man.open() > ai.open() && man.open() < 22 || ai.open()>21 && man.open()<22) {
        System.out.println("あなたの勝利です！");


    }else if(man.open() == ai.open() && man.open() >= 17&&man.open() <=21) {
        System.out.println("引き分けです");

    }else {
        System.out.println("あなたは負けました。");
    }
        
    }
                
    }
}

//1.山札を作る。☑
//2.山札をシャッフルして、ランダムにする。☑
//3.ランダムの中から2枚受け取る。☑
//4.受け取った2枚のカードを足して合計値を出す。☑
//5.その合計値が基準値(16)以下だとfalse。☑
//6.trueだと何もせずfalseの場合はもう一枚追加する。☑
//7.もう一枚追加の処理はhitを使う。☑

//11.12.13は10として扱う。
//21を超えたら負け。☑
//先にUserがプレイしてその後Dealerがプレイする。☑