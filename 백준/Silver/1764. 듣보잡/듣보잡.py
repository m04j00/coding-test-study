def main():
    n, m = map(int, input().split())
    unknown_users = {}

    for _ in range(n):
        user = input()
        unknown_users[user] = unknown_users[user] + 1 if user in unknown_users else 1

    for _ in range(m):
        user = input()
        unknown_users[user] = unknown_users[user] + 1 if user in unknown_users else 1

    result = []
    for key, value in dict(sorted(unknown_users.items())).items():
        if value > 1:
            result.append(key)

    print(len(result))
    for i in result:
        print(i)


if __name__ == "__main__":
    main()
