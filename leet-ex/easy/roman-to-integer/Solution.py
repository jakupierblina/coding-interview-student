class Solution:
    def romanToInt(self, s: str) -> int:
        roman = {'I':1, 'V':5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
        res = roman[s[len(s)-1]]
        pos = len(s) - 1 
        
        while pos >= 1:
            
            curr = roman[s[pos]]
            prev = roman[s[pos-1]]
            
            if prev < curr:
                
                res  = res - prev
            
            elif prev >= curr:
                
                res = res + prev
            
            pos -= 1 
        
        return res

        