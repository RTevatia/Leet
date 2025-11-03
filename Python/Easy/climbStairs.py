def climb_stairs(n):
    if n <= 2: return n
    a, b = 1, 2
    for _ in range(3, n+1):
        temp = a + b
        a = b
        b = temp
    return b

print(climb_stairs(5))