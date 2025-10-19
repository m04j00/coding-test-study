def is_prime(num):
    if num < 2:
        return False

    for j in range(2, int(num**0.5) + 1):
        if num % j == 0:
            return False
    return True


def main():
    _ = int(input())
    numbers = list(map(int, input().split()))
    prime_count = sum(1 for num in numbers if is_prime(num))

    print(prime_count)


if __name__ == "__main__":
    main()
