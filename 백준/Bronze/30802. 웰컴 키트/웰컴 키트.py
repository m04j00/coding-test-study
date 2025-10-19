import math

def main():
    n = int(input())
    shirt_size_list = list(map(int, input().split()))
    t, p = map(int, input().split())

    shirt_bundle = 0

    for i in shirt_size_list:
        shirt_bundle += math.ceil(i / t)

    print(shirt_bundle)
    print(math.floor(n / p), n % p)

if __name__ == "__main__":
    main()
