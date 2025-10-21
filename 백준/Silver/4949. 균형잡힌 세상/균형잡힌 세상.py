import sys

PAIRS = {")": "(", "]": "["}


def is_balanced(line: str) -> bool:
    stack = []
    for ch in line:
        if ch in "([":
            stack.append(ch)
        elif ch in "])":
            if not stack or stack.pop() != PAIRS[ch]:
                return False

    return not stack


def main():
    for raw in sys.stdin:
        line = raw.rstrip("\n")
        if line == ".":
            break
        print("yes" if is_balanced(line) else "no")


if __name__ == "__main__":
    main()
