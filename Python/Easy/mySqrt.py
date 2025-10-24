def my_sqrt(x):
    if x < 0:
        raise Exception("Number cannot be negative!")
    if x < 2:
        return x
    
    left, right = 0, x

    while left <= right:
        middle = (left + right) // 2
        if middle * middle == x:
            return middle
        elif middle * middle < x:
            left = middle + 1
        else:
            right = middle - 1

    return right

# Example Usage
def main():
    print(my_sqrt(4))
    print(my_sqrt(8))

if __name__ == "__main__":
    main()
