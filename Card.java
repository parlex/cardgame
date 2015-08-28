public class Card{
   Suit suit;
   Value value;

   Card(Suit suit, Value value){
      this.suit = suit;
      this.value = value;
   }

   public String toString(){
      return value + " of " + suit;
   }
}
