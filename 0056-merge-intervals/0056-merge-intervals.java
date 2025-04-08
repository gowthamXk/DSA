class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals; 

        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
       List<int[]> merged = new ArrayList<>();
       merged.add(intervals[0]);

       for(int i = 1 ; i < intervals.length ; i++){
        if(intervals[i][0] > merged.get(merged.size()-1)[1]){
            merged.add((intervals[i]));
        }
        else{
           int[] current = merged.get(merged.size() - 1);
           current[1] = Math.max(current[1] , intervals[i][1]);
           merged.set(merged.size() - 1 , current);
        }
       }
       return merged.toArray(new int[merged.size()][]);
    }

    }
