public class Solution{
    public static  boolean isAnagram(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }
        boolean ans = false;
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0; i<a.length();i++){
            map1.put(a.charAt(i),map1.getOrDefault(a.charAt(i), 0)+1);
            map2.put(b.charAt(i),map2.getOrDefault(b.charAt(i), 0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map1.entrySet()){
            Character key = entry.getKey();
            int value =entry.getValue();
            if(!map2.containsKey(key) || !map2.get(key).equals(value)){
                return false;
            }
        }
        return true;
    }}
