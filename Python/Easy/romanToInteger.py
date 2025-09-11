class Solution:
    def romanToInt(self, s: str) -> int:
        """
        :type s: str
        :rtype: int
        """
        roman = {'I':1, 'V':5, 'X':10, 'L':50, 'C':100, 'D':500, 'M':1000}
        total = 0
        
        for i in range(len(s)):
            current = roman[s[i]]
            
            if i + 1 < len(s) and roman[s[i + 1]] > current:
                total -= current
            else:
                total += current
                
        return total
    
    def bestSolution(self, s):
        """
        :type s: str
        :rtype: int
        """
        roman = {'I':1, 'V':5, 'X':10, 'L':50, 'C':100, 'D':500, 'M':1000}
        total = 0
        previous = 0
        
        for char in reversed(s):
            value = roman[char]
            if value < previous:
                total -= value
            else:
                total += value
            previous = value
            
        return total
            
    
    
def main():
    solution = Solution()
    s1 = "III"
    print(solution.bestSolution(s1))
    
    s2 = "LVIII"
    print(solution.bestSolution(s2))
    
    s3 = "MCMXCIV"
    print(solution.bestSolution(s3))
    
if __name__ == "__main__":
    main()
    
    