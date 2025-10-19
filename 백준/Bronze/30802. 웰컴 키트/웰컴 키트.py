import math

def main():
    n = int(input())
    shirt_sizes = list(map(int, input().split()))
    t, p = map(int, input().split())

    total_bundles = sum(math.ceil(size / t) for size in shirt_sizes)

    print(total_bundles)
    print(n // p, n % p)

if __name__ == "__main__":
    main()
