class Solution {
    public String frequencySort(String s) {
         HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>(map.values());
        list.sort(Collections.reverseOrder());
        StringBuilder str = new StringBuilder();
        HashSet<Integer> seen = new HashSet<>();

        for(int a:list){
            if(!seen.add(a)){
                continue;
            }
            for(char b: map.keySet() ){
                if(map.get(b)==a){
                    str.append(String.valueOf(b).repeat(a));
                    

                }

            }
    
    }
  return str.toString(); 
} 
}