class Solution {
    public int reverse(int x) {

    	/* Reverse apo anasjelltas e njohur si pasqyra
    	* Numrin e dhene ndrro ne anasjelltas sh 123 kthe resultatin ne 321
    	* esht shum e ngjashme me palindrome 
    	* Ne nje variabel te re e ruaj numrin e dhene te perpunuar
    	* Permes while loop reshkruaj numrin permes logjikes:
    	* numri module 10
    	*/
      long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }

        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
            return 0;

        return (int)res;
    }
}