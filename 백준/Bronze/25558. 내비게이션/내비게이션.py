import sys

def calc(x1, y1, x2, y2):
    return abs(x1 - x2) + abs(y1 - y2)


def main():
    input = sys.stdin.readline
    n = int(input())
    sx, sy, ex, ey = map(int, input().split())

    results = []
    for i in range(1, n + 1):
        m = int(input())
        bx, by = sx, sy
        total = 0
        for _ in range(m):
            x, y = map(int, input().split())
            total += calc(bx, by, x, y)
            bx, by = x, y

        total += calc(bx, by, ex, ey)
        results.append((i, total))

    if results:
        print(min(results, key=lambda x: x[1])[0])


if __name__ == "__main__":
    main()
