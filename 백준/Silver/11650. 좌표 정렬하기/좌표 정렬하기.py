def main():
    n = int(input())
    point_list = []
    for _ in range(n):
        x, y = map(int, input().split())
        point_list.append({"x": x, "y": y})

    sorted_point_list = sorted(point_list, key=lambda x: (x["x"], x["y"]))

    for i in sorted_point_list:
        print(i["x"], i["y"])


if __name__ == "__main__":
    main()
