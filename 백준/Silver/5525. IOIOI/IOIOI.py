def main():
    n = int(input())
    s_len = int(input())
    s = input()
    p = "I" + ("OI" * n)
    p_len = len(p)
    p_count = 0

    for i in range(0, s_len - p_len + 1):
        sliced_s = s[i : i + p_len]
        if sliced_s == p:
            p_count += 1

    print(p_count)


if __name__ == "__main__":
    main()
