def plus_one1(digits):
    if not digits: return 1

    digits_value = 1
    for i in range((len(digits) - 1), -1, -1):
        digits_value += (digits[i] * 10 ** (len(digits) - 1 - i))

    output = []
    while digits_value > 0:
        output.append(digits_value % 10)
        digits_value = digits_value // 10

    return output[::-1]

def plus_one2(digits):
    for i in range(len(digits) - 1, -1, -1):
        if digits[i] < 9:
            digits[i] += 1
            return digits
        digits[i] = 0

    return [1] + digits

def main():
    digits1 = [1, 2, 3]
    digits2 = [4, 3, 2, 1]
    digits3 = [9]

    print("Solution 1")
    print(plus_one1(digits1))
    print(plus_one1(digits2))
    print(plus_one1(digits3))

    print("Solution 2")
    print(plus_one2(digits1))
    print(plus_one2(digits2))
    print(plus_one2(digits3))

if __name__ == "__main__":
    main()
