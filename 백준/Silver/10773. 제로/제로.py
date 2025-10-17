def main():
    n = int(input())
    total_list = []
    for _ in range(n):
        current = int(input())
        if len(total_list) > 0 and current == 0:
            total_list.pop()
        elif current > 0:
            total_list.append(current)

    print(sum(total_list))


if __name__ == "__main__":
    main()
