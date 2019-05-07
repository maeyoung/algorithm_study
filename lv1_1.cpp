#include <vector>
#include <cmath>
#include <cstdio>
using namespace std;

long long solution(int N) {
    long long answer = 0;
    vector<bool> isPrime;
    isPrime.assign(N+1, true);
    for(int i=2;i<=sqrt(N);i++){
        if(isPrime[i] == false) continue;
        else{
            for(int j=i+i;j<=N;j+=i){
                isPrime[j] = false;
            }
        }
    }
    // for(int i=0;i<isPrime.size();i++)
    //     printf("%d\t", isPrime[i]);
    for(int i=2;i<isPrime.size();i++){
        if(isPrime[i] == true){
            answer+=i;
        }
    }
    return answer;
}

int main(){
    int N;
    scanf("%d", &N);

    printf("%lld\n", solution(N));
}