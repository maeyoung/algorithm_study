#include <vector>
#include <iostream>
using namespace std;

long long solution(int N) {
    long long answer = 0;
    vector<bool> prime(N+1); // default value = false

    for (int i = 2; i <= N; i++) { 
        if (prime[i] == false) { // if present number is prime, add to answer 
            answer += i; 
        }    
        
        for (int j = i; j <= N; j+=i) { // remove not prime number
            prime[j] = true; 
        } 
    }   
    return answer;
}

int main() {
    int N, answer;
    cin >> N;
    answer = solution(N);
    cout << "prime_sum : " << answer << '\n';

    return 0;
}

/* vector<int> 하면 시간초과가 뜨는데 vector<bool>하면 통과한다. 
벡터가 bool형에 대해서 특수화 되어있어, 하나의 값을 저장하는데 bit하나만 사용한다.
vector<bool>은 진위형의 요소들을 1비트에 하나씩 압축하여 저장하는 별도의 독립 클래스이다. 
8개의 진위형을 저장할 때 bool형의 단순 배열에 비해 vector<bool>의 크기가 훨씬 더 작다.
bool 배열은 8바이트를 차지하고 vector<bool>은 불과 1바이트밖에 차지하지 않아 7바이트를 아낄 수 있다. 
vector<bool>은 true or false 저장하는데 온전히 1 byte만 사용함. 정수형보다 훨씬 작다. */