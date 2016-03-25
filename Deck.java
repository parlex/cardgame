import java.util.ArrayList;
import java.util.Random;

public class Deck{
   ArrayList<Card> cards;
   ArrayList<Card> usedCards;
   final int CARDSINDECK = 52;
   Random rand;

   Deck(){
      cards = new ArrayList<Card>(CARDSINDECK);
      usedCards = new ArrayList<Card>();
      initDeck(cards);
      rand = new Random();
   }

   private void initDeck(ArrayList<Card> deck){
      for(Suit suit : Suit.values()){
         for(Value value : Value.values()){
            deck.add(new Card(suit, value));
         }
      }
   }

   public Card deal(){
      if(cards.size() < 1){
         return null;
      }

      int remove = rand.nextInt(cards.size());
      Card dealCard = cards.remove(remove);
      usedCards.add(dealCard);

      System.out.println("Removed : " + dealCard);

      return dealCard;
   }

   public void reNewDeck(){
      initDeck(this.cards);
      this.usedCards = new ArrayList<Card>();
   }

   public String toString(){
      String output = "";
      output += "SIZE IS " + cards.size() + "\n";
      for(Card c : cards){
         output += c + ", ";
      }

      return output.substring(0, output.length() - 2);
   }
}
