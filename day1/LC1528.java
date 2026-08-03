class Solution {
    public String restoreString(String s, int[] indices) {
        int n=s.length();
        StringBuilder sb=new StringBuilder("");
        char ch[]=new char[n];

        for(int i=0;i<n;i++)
        {
            ch[indices[i]]=s.charAt(i);
        }
        sb.append(ch);
        return sb.toString();
    }
}