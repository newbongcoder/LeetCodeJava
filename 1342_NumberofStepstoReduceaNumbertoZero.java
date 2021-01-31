class Solution {
    public int numberOfSteps (int num) {
        int count=0;
        while(num>0)
        {
            System.out.print("Step "+(count++)+")");
            if(num%2==0)
            {
                num/=2;
                System.out.print(" "+num+" is even; divide by 2 and obtain "+(num));
            }
            else
            {
                num--;
                System.out.print(" "+num+" is odd; subtract 1 and obtain "+());
            }
        }
        return count;
    }
}
