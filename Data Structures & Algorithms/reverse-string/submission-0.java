class Solution {
    public void reverseString(char[] s) {

        int size = s.length;
        if(size <=1)
        return;

        int i =0;
        int j =size-1;

        while(i<j)
        {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }

        
    }
}