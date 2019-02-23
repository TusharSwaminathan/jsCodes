/********** DECK OF CARDS JAVA ***********/
/********** Program contains the following ***********/
/********** 1) Create a DECK of Cards OOPS ***********/
/********** 2) Shuffle a DECK ***********/
/********** 3) Deal a DECK ***********/
/********** 4) Sort a DECK ***********/

package interview;
import java.util.*;

class Play {

    public static void main(String[]a) {
        Deck play1 = new Deck();
        ArrayList<Card> myCards = play1.myDeck;
        System.out.println("YOUR DECK................................................");
        for(Card cards : myCards) {
            System.out.println(cards.Suit+" of "+cards.CardNo + " ("+cards.Order+")");
        }
        System.out.println(".........................................................");
        play1.Shuffle();
        myCards = play1.myDeck;
        System.out.println("SHUFFLED DECK..............................");
        for(Card cards : myCards) {
            System.out.println(cards.Suit+" of "+cards.CardNo + " ("+cards.Order+")");
        }
        System.out.println(".........................................................");
        ArrayList<Card> deal = play1.Deal(5);
        System.out.println("DEALING DECK..............................");
        for(Card cards : deal) {
            System.out.println(cards.Suit+" of "+cards.CardNo + " ("+cards.Order+")");
        }
        System.out.println(".........................................................");
        play1.Sort();
        System.out.println("REMAINING DECK SORTED..............................");
        for(Card cards : myCards) {
            System.out.println(cards.Suit+" of "+cards.CardNo + " ("+cards.Order+")");
        }
    }
}