def main():
    a, b, n, w = map(int, input().split())
    result = []

    for i in range(1, n):
        j = n - i
        if (a * i) + (b * j) == w:
            result.append({"sheep": i, "goats": j})

    if len(result) == 1:
        print(result[0]["sheep"], result[0]["goats"])
    else:
        print(-1)


if __name__ == "__main__":
    main()
