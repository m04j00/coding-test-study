#include <iostream>
using namespace std;
int nArray[10001];
void selfNumber(int i) {
	int num = i, sum = i;
	while (num != 0) {
		sum += num % 10;
		num /= 10;
	}
	nArray[sum]++;
}

int main() {
	for (int i = 0; i <= 10000; i++) {
		selfNumber(i);
	}

	for (int i = 0; i < 10000; i++) {
		if (nArray[i] == 0) cout << i << "\n";
	}

	return 0;
}