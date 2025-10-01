class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
       int canDrink = numBottles;
       int rem = (numBottles / numExchange);
       int remBottles = rem + (numBottles - (rem * numExchange));
       

       while(remBottles >= numExchange){
        canDrink += rem;
        rem = remBottles / numExchange;
        remBottles = rem + (remBottles -(rem * numExchange));

       }


        return canDrink + rem;
    }
}