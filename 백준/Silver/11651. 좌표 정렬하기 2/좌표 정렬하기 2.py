def main():
    n = int(input())
    points = [tuple(map(int, input().split())) for _ in range(n)]
    for x, y in sorted(points, key=lambda p: (p[1], p[0])):
        print(x, y)


if __name__ == "__main__":
    main()