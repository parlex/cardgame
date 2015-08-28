import java.util.ArrayList;

public class Player {
   private int id;
   private ArrayList<Card> hand;

   public Player(int id){
      this.id = id;
      hand = new ArrayList<Card>();
   }

   public void drawCard(Card card){
      hand.add(card);
   }

   public ArrayList<Card> getHand(){
      return this.hand;
   }

   public Card playCard(Card card){
      hand.remove(card);
      return card;
   }

   public int getId(){
      return this.id;
   }

}
