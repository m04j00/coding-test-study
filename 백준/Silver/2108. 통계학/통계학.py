import sys
from collections import Counter


def main():
    n = int(sys.stdin.readline())
    nums = sorted([int(sys.stdin.readline()) for _ in range(n)])
    counts = Counter(nums)

    print(round(sum(nums) / n))
    print(nums[n // 2])
    common = counts.most_common()

    max_freq = common[0][1]
    modes = [num for num, freq in common if freq == max_freq]

    if len(modes) > 1:
        print(sorted(modes)[1])
    else:
        print(modes[0])
    
    print(abs(nums[n - 1] - nums[0]))


if __name__ == "__main__":
    main()
