def main():
	int(input())
	card = {}

	card_input = input().split()

	for c in card_input:
		card[c] = card.get(c, 0) + 1

	int(input())

	card2_input = input().split()

	output = [card.get(c, 0) for c in card2_input]
	print(' '.join(map(str, output)))

if __name__ == "__main__":
	main()
