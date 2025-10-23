def main():
    n = int(input())
    total_point = 0
    while n > 0:
        for i in range(n, n + n + 1):
            total_point += i
        n -= 1

    print(total_point)


if __name__ == "__main__":
    main()
