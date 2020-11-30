class Solution {
    public boolean isPalindrome(int x) {
        
        //s'pari check nese numri i dhene esht me i vogel se 0 ose i barabarte me 0 kthe FALSE
        if(x <0 || (x !=0 && x%10 ==0)) return false;

        int tmp =x;
        long sum =0;

        /* perderisa x nuk esht i barabarte me zero ateher ekzekuto
        ne sum = sum*10 + x%10 
        dmth.  modul esht mbetja e dy numrave qe plotpjestohen. 
		Logjika: numrin e dhene llogarit me mod%10 dhe e ruan ne nje variabl
		krahason nese numri esht i barabart me dhen.
		Arsyeja pse long sum, sepse do te jete number me presje


		shembull: x=121
			121%10 = 12.1  -- ruaje ne memorie

        */
        while (x !=0){
        	sum = sum*10 +x%10; // 0*10 + 1
        	x=x/10;             // x =  12.1
        }

        // so ne ket rast x= 121 the tmp 121 jan te barabat, qe nenkupton se esht number polindrom
    	return (int)sum ==tmp; 
    }
}