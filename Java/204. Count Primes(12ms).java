class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        if (n == 2){
            return 0;
        }
        for (int i = 2; i < n; i++){
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= n; i++){
            if (isPrime[i] == true){
                int j = i;
                while (i * j < n){ //x = p^2 +jp; same as boundary i * i <= n;
                    isPrime[i*j] = false;
                    j++;
                }
            }
        }
        //count 
        int count = 0;
        for (int i = 2; i < n; i++){
            if (isPrime[i] == true){
                count++;
            }
        }
        return count;
    }
}
