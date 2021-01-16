class Solution 
{
    public String defangIPaddr(String address) 
    {
        String result="";
        for(int i = 0;i<address.length();i++)
        {
            char ch=address.charAt(i);
            if(Character.isDigit(ch)==false)
            {
                result+="[.]";
            }
            else
            {
                result+=ch;
            }
        }
        return result;
    }
}
