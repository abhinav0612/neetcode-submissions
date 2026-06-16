class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(char num : s.toCharArray()){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(char ch : t.toCharArray()){
            if(!map.containsKey(ch)){
                return false;
            }
            map.put(ch,map.getOrDefault(ch,0)-1);
        }
        for(int freq : map.values()){
            if(freq !=0){
                return false;
            }
        }
        return true;
        
    }
}
