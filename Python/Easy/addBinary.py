def add_binary(a, b):
    return bin(int(a, 2) + int(b, 2))[2:]

def main():
    # Example 1
    print(add_binary("11", "1"))

    # Example 2
    print(add_binary("1010", "1011"))


if __name__ == "__main__":
    main()