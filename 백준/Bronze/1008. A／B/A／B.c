#include <stdio.h>

int main() {
	double a, b;

	scanf("%lf", &a);
	scanf("%lf", &b);

	printf("%.9lf", a / b);

	return 0;
}