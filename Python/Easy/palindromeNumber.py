class Solution(object):
    def isPalindromeStr(self, x):
        """
        :type x: int
        :rtype: bool
        """
        return str(x) == str(x)[::-1]
    
    def isPalindromeInt(self, x):
        original_x = x
        reversed_x = 0
        if x < 0:
            return False
        while x > 0:
            digit = x % 10
            reversed_x = reversed_x * 10 + digit
            x //= 10
            
        return original_x == reversed_x
    
def main():
    solution = Solution()
    num1 = 121
    num2 = 125
    print(solution.isPalindromeStr(num1))
    print(solution.isPalindromeStr(num2))
    print(solution.isPalindromeInt(num1))
    print(solution.isPalindromeInt(num2))

if __name__ == "__main__":
    main()