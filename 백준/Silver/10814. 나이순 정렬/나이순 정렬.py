class Person:
	def __init__(self, age, name):
		self.age = age
		self.name = name

def main():
	n = int(input())
	input_data = {}

	for i in range(n):
		age, name = input().split()
		input_data[i] = Person(int(age), name)

	sorted_items = sorted(input_data.items(), key=lambda x: x[1].age)
	for _, person in sorted_items:
		print(f"{person.age} {person.name}")


if __name__ == "__main__":
	main()
