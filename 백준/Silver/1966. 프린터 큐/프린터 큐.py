def main():
	case_count = int(input())
	results = []

	for _ in range(case_count):
		n, m = map(int, input().split())
		importances = list(map(int, input().split()))
		queue = [{'index': i, 'importance': imp} for i, imp in enumerate(importances)]
		count = 1

		while queue:
			current = queue.pop(0)

			if any(item['importance'] > current['importance'] for item in queue):
				queue.append(current)
			else:
				if current['index'] == m:
					results.append(count)
					break
				count += 1

	for r in results:
		print(r)

if __name__ == "__main__":
	main()
