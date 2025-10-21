def main():
    while True:
        str = input()
        if str == ".":
            break

        is_balanced = True
        stack = []

        for c in str:
            if c == "(" or c == "[":
                stack.append(c)
            elif c == ")":
                if len(stack) == 0 or stack.pop() != "(":
                    is_balanced = False
                    break
            elif c == "]":
                if len(stack) == 0 or stack.pop() != "[":
                    is_balanced = False
                    break
            else:
                continue

        if is_balanced and len(stack) == 0:
            print("yes")
        else:
            print("no")


if __name__ == "__main__":
    main()
