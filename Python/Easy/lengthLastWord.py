# Solution 1
def length_last_word1(s):
    s = s.rstrip()
    return len(s.split(' ')[-1])

# Solution 2

def length_last_word2(s):
    i = len(s) - 1
    length = 0

    # skip trailing space
    while i >= 0 and s[i] == ' ':
        i -= 1

    # count the length of last word
    while i >= 0  and s[i] != ' ':
        length += 1
        i -= 1

    return length


# Example 1
s1 = "Hello World"
s2 = "   fly me   to   the moon  "
s3 = "luffy is still joyboy"

print("Solution 1")
print(length_last_word1(s1))
print(length_last_word1(s2))
print(length_last_word1(s3))

print("Solution 2")
print(length_last_word2(s1))
print(length_last_word2(s2))
print(length_last_word2(s3))