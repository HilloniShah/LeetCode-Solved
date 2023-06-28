// 790. Domino and Tromino Tiling


class Solution {
    public int numTilings(int n) {

        int mod = 1000000007;

        if(n<=2){
            return n;
        }

        long f_k1 = 1;
        long f_k2 = 2;
        long f_k3 = 5;
        long curr = 5;

        for(int i=4;i<=n;i++){
            curr = (2*f_k3 + f_k1) % mod;
            f_k1 = f_k2;
            f_k2 = f_k3;
            f_k3 = curr; 
        }

        return (int) (curr % mod);
    }
}


// Beats 100% runtime