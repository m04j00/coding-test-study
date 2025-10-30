import sys

def main():
    input = sys.stdin.readline
    n = int(input())
    if n == 0:
        print(0)
        return

    level_opinions = sorted(int(input()) for _ in range(n))
    ignore_num = int(n * 0.15 + 0.5)
    export_opinions = level_opinions[ignore_num : n - ignore_num]

    print(int(sum(export_opinions) / len(export_opinions) + 0.5))

if __name__ == "__main__":
    main()
