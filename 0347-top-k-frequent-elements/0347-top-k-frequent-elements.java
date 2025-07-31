class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();

         int[]ans = new int[k];

        List<Storage> li = new ArrayList<>();

        for(int i = 0 ; i < arr.length ; i++){

            map.put(arr[i] , map.getOrDefault(arr[i] , 0) + 1);

        }
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){

            li.add(new Storage(entry.getKey() , entry.getValue()));

        }

        Collections.sort(li, (Storage o1, Storage o2) ->{
            if(o1.count == o2.count) return 0;
            else if(o1.count > o2.count) return -1;
            else return 1;
        });

        for(int i = 0 ; i < k ; i++){
            Storage temp = li.get(i);
            ans[i] = temp.key;
        }
        return ans;

        
    }
}
class Storage{
    int key;
    int count;
    public Storage(int key , int count){
        this.key = key;
        this.count = count;
    }
}