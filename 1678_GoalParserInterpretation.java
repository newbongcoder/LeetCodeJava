class Solution {
    public String interpret(String command) {
        int count=0;
        String result="";
        while(count<command.length())
        {
            char ch = command.charAt(count);
            if(ch=='(')
            {
                char ch1=command.charAt(count+1);
                if(Character.isLetterOrDigit(ch1)==true)
                {
                    int i=count+1;
                    while(command.charAt(i)!=')')
                    {
                        i++;
                    }
                    result+=command.substring(count+1,i);
                    count=i;
                }
                else
                {
                    result+="o";
                    count+=2;
                }
            }
            else if(Character.isLetter(ch)==true)
            {
                result+=ch;
                count++;
            }
            else
            {
                count++;
            }
        }
        return result;
    }
}
