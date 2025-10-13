def main():
	n = int(input())

	five_count = n // 5

	while five_count >= 0:
		if (n - (five_count * 5)) % 3 == 0:
			print(five_count + (n - (five_count * 5)) // 3)
			return
		five_count -= 1

	if n % 3 == 0:
		print(n // 3)
	else:
		print(-1)

if __name__ == "__main__":
	main()
