class Solution {
    public int compareVersion(String version1, String version2) {
        ArrayList<Integer> v1 = new ArrayList<>();
        ArrayList<Integer> v2 = new ArrayList<>();
        

        int start = 0;
        

        for(int i = 0 ; i < version1.length() ; i++){
            if(version1.charAt(i)== '.'){
                int num = Integer.parseInt(version1.substring(start , i));
                v1.add(num);
                start = i + 1;
            }
        }
        v1.add(Integer.parseInt(version1.substring(start , version1.length())));
        start = 0;
        for(int i = 0 ; i < version2.length() ; i++){
            if(version2.charAt(i)== '.'){
                int num = Integer.parseInt(version2.substring(start , i));
                v2.add(num);
                start = i + 1;
            }
        }
        v2.add(Integer.parseInt(version2.substring(start , version2.length())));

        int i = 0;
        int j = 0;

        while(i < v1.size() && j < v2.size()){
            if(v1.get(i) < v2.get(j)){
                return -1;
            }
            else if(v1.get(i) > v2.get(j)){
                return 1;
            }
            i++;
            j++;
        }
        while(i < v1.size()){
            if(v1.get(i) > 0){
                return 1;
            }
            i++;
        }
        while(j < v2.size()){
            if(v2.get(j) > 0){
                return -1;
            }
            j++;
        }
        
        return 0;
    }
}