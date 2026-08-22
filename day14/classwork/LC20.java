class Solution {
    public boolean isValid(String s) {
        Deque<Character> stk = new ArrayDeque<>();
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[')
            {
                stk.push(ch);
            }
            else
            {
                if(stk.isEmpty()) return false;
                else if(ch== ')' && stk.peek() == '(') stk.pop();
                else if(ch == '}' && stk.peek() == '{') stk.pop(); 
                else if(ch == ']' && stk.peek() == '[') stk.pop();
                else return false;
            }
            
        }

        return stk.isEmpty();

    }
}

/**
    StringBuilder ans=new StringBuilder();
        Arrays.sort(strs);
        char []start=strs[0].toCharArray();
        char []end=strs[strs.length-1].toCharArray();
        for(int i=0;i<start.length;i++)
        {
            if(start[i]!=end[i]) break;
            ans.append(start[i]);
        }
        return ans.toString();
 */