class Solution {
    public boolean anagram(String s1, String s2){
        if (s1.length()!= s2.length()){
            return false;
        }
        int[] freq = new int[26];
        for(int i =0; i<s1.length(); i++)
        {
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        for(int f: freq){
            if (f!=0){
                return false;
            }
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashSet<String> visited = new HashSet<String>();
        List<List<String>> out = new ArrayList<>();
        for(int i = 0; i<strs.length; i++)
        {
            if (visited.contains(strs[i])){
                continue;
            }
            else{
                ArrayList<String> group = new ArrayList<String>();
                group.add(strs[i]);
                for(int j = i+1; j<strs.length; j++)
                {
                    if(anagram(strs[i], strs[j]))
                    {
                        visited.add(strs[j]);
                        group.add(strs[j]);
                    }
                }
                out.add(group);
            }
        }
        return out;
    }
}