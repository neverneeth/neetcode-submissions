class Solution {

    public String encode(List<String> strs) {
        String str = "";
        for(String x: strs)
        {
            str+= x+"🔥";
        }
        System.out.println(str);
        return str;
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        String temp = "";
        int l = str.length();
        for(int i = 0; i<l; i++)
        {            
            char ch = str.charAt(i);
            if(ch!='🔥')
            {
                temp += ch;
            }
            else
            {
                strs.add(temp);
                i++;
                temp = "";
            }
        }
        return strs;
    }
}
