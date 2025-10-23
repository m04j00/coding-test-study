def main():
    n = int(input())
    factorial = 1
    while n > 0:
        factorial *= n
        n -= 1

    print(factorial)


if __name__ == "__main__":
    main()
