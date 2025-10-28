def main():
    n = int(input())
    people = sorted(list(map(int, input().split())))
    time_for_person = [people[0]]

    for i in range(1, n):
        time_for_person.append(time_for_person[i - 1] + people[i])

    print(sum(time_for_person))


if __name__ == "__main__":
    main()
