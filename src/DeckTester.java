
/**
 * This is a class that tests the Deck class.
 */
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *
     * @param args is not used.
     */
    public static void main(String[] args) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        //Reusable Assets
        System.out.println("----Testing Deck 1----");
        String[] suits = {"clubs", "hearts", "diamonds", "spades"};
        String[] ranks = {"ace", "two", "three", "four", "five", "six", "seven",
            "eight", "nine", "ten", "jack", "queen", "king"};
        int[] pointValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        
        //NEW ASSETS
        String[] suits2 = {"gucci", "armani", "supreme", "costco"};
        String[] ranks2 = {"garbage", "shiny garbage", "somewhat edible", "spicy meatball"};
        int[] pointValues2 = {32, 47, 59, 63, 74, 88, 91};
        
        //EXAMPLE DECK 1
        System.out.println("----Testing Deck 1----");
        Deck captainD = new Deck(ranks, suits, pointValues);
        
        System.out.println("Deck size: " + captainD.size());
        
        Card x = captainD.deal();
        System.out.println("Yo Ho take this and run " + x);
        System.out.println("Now me size be " + captainD.size());
        
        System.out.println(captainD);
        
        
        //EXAMPLE DECK 2
        System.out.println("----Testing Deck 2----");
        //create a deck
        Deck yeBoi = new Deck(suits2, ranks2, pointValues2);
        //test its size
        System.out.println("My size is " + yeBoi.size());
        //deal until empty
        Card b = yeBoi.deal();
        System.out.println("Here you go homeslice breadsliec dawg" + x);
        System.out.println(yeBoi.size());
        System.out.println(yeBoi);
    }
}
