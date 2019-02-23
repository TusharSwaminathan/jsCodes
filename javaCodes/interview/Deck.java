package interview;
import java.util.*;
import java.lang.Math;

public class Deck {
    public ArrayList<Card> myDeck;
    String[] arrSuit = {"Heart","Spade","Clover","Diamond"};
    String[] Card = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    public Deck(){
        myDeck = new ArrayList<Card>();
        int i=0;
        for(String suit : arrSuit){
            for(String card: Card){
                Card curr = new Card(card,suit,i++);
                myDeck.add(curr);
            }
        }
    }

    public void Shuffle() {
        int noOfShuffles = (int)Math.floor(Math.random()*1000);
        System.out.println("Shuffling Cards.... for "+noOfShuffles+" times");
        for(int i=0; i<noOfShuffles;i++){
          int cardOne = (int) Math.round(Math.floor(((Math.random()*100)%52)));
          Card temp = myDeck.remove(cardOne);
          myDeck.add(temp);
        }
    }

    public ArrayList<Card> Deal(int noOfCards) {
        if(noOfCards > myDeck.size()){
            throw new Error("Limit Exception!!");
        }
        ArrayList<Card> temp = new ArrayList<Card>();
        for(int i=0;i<noOfCards;i++){
            temp.add(myDeck.remove(0));
        }
        return temp;
    }

    public void Sort(){
        Collections.sort(myDeck, new Comparator<Card>(){
            public int compare(Card a,Card b){
                return a.Order - b.Order;
            }
        });
    }
}