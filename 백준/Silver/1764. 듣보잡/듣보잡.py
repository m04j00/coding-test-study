def main():
    n, m = map(int, input().split())
    never_heard_users = {input() for _ in range(n)}
    never_seen_users = {input() for _ in range(m)}
    unknown_uesrs = sorted(never_heard_users & never_seen_users)

    print(len(unknown_uesrs))
    for i in unknown_uesrs:
        print(i)


if __name__ == "__main__":
    main()
