def main():
    n, m = map(int, input().split())
    cards = list(map(int, input().split()))
    sum_cases = []

    for i in range(n - 2):
        for j in range(i + 1, n - 1):
            for k in range(j + 1, n):
                sum = cards[i] + cards[j] + cards[k]
                if sum <= m:
                    sum_cases.append(sum)

    sum_cases = sorted(sum_cases)
    print(sum_cases.pop())


if __name__ == "__main__":
    main()
