public class TasdibekTennisPlayer
{
  
  private String playerName;  // Enes Tasdibek, CISS 110
  private String country;     // Defined accessor and	mutator	method for all six fields respectively.
  
  
  private int rank;
  private int age;
  
  
  
  private int wins;
  private int losses;
  
  

public double calcWinpercentage(){

 
  double games = wins + losses;
  double perc =   wins / games;
 
 
  if(games == 0){
  return -1.0;
 }
return perc; 
}


public TasdibekTennisPlayer(){

  playerName = null;
  country = null;

  rank = 0;
  age = 0;

  wins = 0;
  losses = 0;
}


public TasdibekTennisPlayer(String Name, String Country ){

  playerName = Name;
  country = Country;
  
  
  rank = 0;
  age = 0;

  wins = 0;
  losses = 0;


}

public TasdibekTennisPlayer(String Name, String Country, int Rank, int Age){

  playerName = Name;
  country = Country;
  
  rank = Rank;
  age = Age;
  
  wins = 0;
  losses = 0;


}

public TasdibekTennisPlayer(String Name, String Country, int Rank, int Age, int Wins, int Losses){

  playerName = Name;
  country = Country;
  
  
  rank = Rank;
  age = Age;


  wins = Wins;
  losses= Losses;



}

  
    public String getPlayerName()   {                                    
     return playerName;
    }
    public void setPlayerName(String playerName)    {
          this.playerName = playerName;
    }
    public String getCountry()    {
    return country;
    }
    public void setCountry(String country)    {
       this.country = country;
    }
    
    

    
    
    public int getRank()    {
      return rank;
    }
    public void setRank(int rank)   {
    this.rank = rank;
    }
    public int getAge()   {
    return age;
    }
    public void setAge(int age)   {
     this.age = age;
    }
    
  



    public int getWins()    {
    return wins;
    }
    public void setWins(int wins)   {
    this.wins = wins;
    }
    public int getLosses()    {
    return losses;
    }
    public void setLosses(int losses)   {
    this.losses = losses;
    }
    
    
  
  
    public void displayPlayer(){

      System.out.println("-----------------------------------");
      System.out.println("Tennis Player: "+ playerName);
      System.out.println("Country: "+ country);
      System.out.println("\nCurrent Rank: "+rank);
      System.out.println("\nAge: "+age);
      System.out.println("\nWins: "+wins);
      System.out.println("Losses: "+losses);
      
      if(calcWinpercentage()== -1.0){
        System.out.println("\nWinning Percentage: No Games Played");
      }
      else {
        System.out.printf("\nWinning Percentage: %.1f%%\n",(calcWinpercentage() * 100));
      }
      
      System.out.println("-----------------------------------");
    
    }
    
  
  
  
  
  
  
  
  
  
  
  
  
  
  }
