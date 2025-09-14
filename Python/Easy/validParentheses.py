class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        mapping = {')': '(', '}': '{', ']': '['}
        
        for char in s:
            if char in '({[':
                stack.append(char)
            elif char in ')}]':
                if not stack or stack[-1] != mapping[char]:
                    return False
                stack.pop()
                
        return not stack
    
        
def main():
    case1 = "()" 
    case2 = "()[]{}"
    case3 = "(]"
    case4 = "([])"
    case5 = "([)]"

    solution = Solution()
    print(solution.isValid(case1))
    print(solution.isValid(case2))
    print(solution.isValid(case3))
    print(solution.isValid(case4))
    print(solution.isValid(case5))
    
if __name__ == "__main__":
    main()
        