def main():
    t = int(input())
    _ = int(input())
    total_titme = sum(list(map(int, input().split())))

    print("Padaeng_i", "Happy" if total_titme >= t else "Cry")


if __name__ == "__main__":
    main()
