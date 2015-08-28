public class Card{
   private Suit suit;
   private Value value;

   Card(Suit suit, Value value){
      this.suit = suit;
      this.value = value;
   }

   public Suit getSuit(){
      return this.suit;
   }
   
   public Value getValue(){
      return this.value;
   }
   public String toString(){
      return value + " of " + suit;
   }
}
