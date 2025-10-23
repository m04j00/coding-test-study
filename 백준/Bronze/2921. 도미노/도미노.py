# Pythonic ...

def main():
    n = int(input())
    total_point = sum(sum(range(i, i + i + 1)) for i in range(n, 0, -1))
    print(total_point)


if __name__ == "__main__":
    main()