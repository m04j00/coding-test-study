def main():
    start, end = map(int, input().split())
    is_prime_list = [False, False] + [True] * (end - 1)

    for i in range(2, int(end**0.5) + 1):
        if is_prime_list[i] == True:
            for j in range(i * 2, end + 1, i):
                is_prime_list[j] = False

    for i in range(start, end + 1):
        if is_prime_list[i] == True:
            print(i)


if __name__ == "__main__":
    main()
