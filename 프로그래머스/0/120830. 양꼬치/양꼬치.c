#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n, int k) {
    
    int a = n * 12000;
    int b = (k - n / 10) * 2000 ;

    int sum = a + b;
    
    int answer = sum;
    return answer;
}