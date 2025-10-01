class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
       int canDrink = numBottles;
       int rem = (numBottles / numExchange);
       int remBottles = rem + (numBottles - (rem * numExchange));
       System.out.println(rem + " " + canDrink);

       while(remBottles >= numExchange){
        canDrink += rem;
        rem = remBottles / numExchange;
        remBottles = rem + (remBottles -(rem * numExchange));

       }


        return canDrink + rem;
    }
}