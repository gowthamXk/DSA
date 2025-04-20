class Solution {
    public int numRabbits(int[] answers) {
    HashMap<Integer , Integer > hm = new HashMap<>();
    
    int rabbit = 0;
    int rem = 0;
    for(int i = 0 ; i < answers.length ; i++){
        hm.put(answers[i] , hm.getOrDefault(answers[i] , 0) + 1);

    }

    for(int i = 0 ; i < answers.length ; i++){

        int freq = answers[i] + 1;

        if( hm.get(answers[i]) != null && hm.get(answers[i]) > freq){
            int same = hm.get(answers[i]) / freq ;
            rabbit = rabbit + (same * freq);
            rem = (hm.get(answers[i]) % freq);
           
            if(rem > 0){
            rabbit = rabbit + freq;
            
            }
            hm.remove(answers[i]);
            
        }
        else if (hm.get(answers[i]) != null && hm.get(answers[i]) <= freq ){
            rabbit = rabbit + freq;
            
            hm.remove(answers[i]);
        }
       
    }

    return rabbit;
    }
}