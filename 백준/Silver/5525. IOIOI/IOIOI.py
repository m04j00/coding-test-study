def main():
    n = int(input())
    s_len = int(input())
    s = input().strip()

    count = 0 
    result = 0
    i = 0

    while i < s_len - 1:
        if s[i:i+3] == "IOI":
            count += 1
            if count == n:
                result += 1
                count -= 1
            i += 2
        else:
            count = 0
            i += 1

    print(result)


if __name__ == "__main__":
    main()