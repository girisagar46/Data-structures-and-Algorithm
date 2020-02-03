public class BurglarsNightOut 
{
    
	public static void main(String args[]) {

	    BurglarsNightOut bno = new BurglarsNightOut();
        int[] houses = {3, 8, 10, 4, 1, 7, 2};
	    System.out.println(bno.robHouses(houses));
	}
    
    

	private int robHouses(int[] houses){
	    int length = houses.length;
	    
        if(length == 0){
            return 0;
        }
        
        // Initializing maxMoney[n+1] array
        int[] maxMoney = new int[length + 1];
        
        // Defining the base cases
        maxMoney[length] = 0;
        maxMoney[length - 1] = houses[length - 1];
        
        // Making the general recurrence relation
        for(int i = length - 2; i >= 0; i--){
            maxMoney[i] = Math.max(houses[i] + maxMoney[i + 2], maxMoney[i + 1]);
        }
        
        // Returning the maximum money that we can make from house no. 0 onwards
        return maxMoney[0];
	}

}
