public class TestTennisPlayer3
{
  public static void main(String[] args)
  {
    
    TasdibekTennisPlayer tp1 = new TasdibekTennisPlayer("Nick Kyrgios", "Australia");
    TasdibekTennisPlayer tp2 = new TasdibekTennisPlayer("Coco Gauff", "USA", 22, 17, 19, 11);
    TasdibekTennisPlayer tp3 = new TasdibekTennisPlayer("Stefanos Tsitsipas", "Greece", 4, 23, 34, 15);
    
    tp1.displayPlayer();
    tp2.displayPlayer(); 
    tp3.displayPlayer();
   
  }
}