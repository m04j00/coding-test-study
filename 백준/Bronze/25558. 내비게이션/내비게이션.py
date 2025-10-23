def calc(point1, point2) -> int:
    return abs(point1[0] - point2[0]) + abs(point1[1] - point2[1])


def main():
    results = []
    n = int(input())
    point = list(map(int, input().split()))
    start = (point[0], point[1])
    end = (point[2], point[3])

    for i in range(n):
        m = int(input())
        before_point = start
        result = 0
        for _ in range(m):
            point = tuple(map(int, input().split()))
            result += calc(before_point, point)
            before_point = point

        results.append((i + 1, result + calc(before_point, end)))

    if results:
        min_tuple = min(results, key=lambda x: x[1])
        print(min_tuple[0])


if __name__ == "__main__":
    main()