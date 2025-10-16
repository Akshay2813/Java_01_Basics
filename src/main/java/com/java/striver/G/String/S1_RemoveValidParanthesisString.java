package com.java.striver.G.String;

public class S1_RemoveValidParanthesisString {

    public static void main(String[] args)
    {
        String str = "(()())(())";
        System.out.println(removeOuterParentheses(str));
    }

    public static String removeOuterParentheses(String str) {

        int count =0;
        StringBuilder ans= new StringBuilder();
        for(int i=0; i<str.length();i++)
        {
            if(str.charAt(i)=='(')
            {
                if(count>0)
                {
                    ans.append(str.charAt(i));
                }
                count++;
            }
            else if (str.charAt(i)==')')
            {
                count--;
                if(count>0)
                {
                    ans.append(str.charAt(i));
                }


            }
        }
        System.out.println(count);
        return ans.toString();

    }
}
