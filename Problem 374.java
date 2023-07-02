// 374. Guess Number Higher or Lower

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

 public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 1, end = n;

        while(start<=end){
            int p = start+ (end-start)/2;
            int ans = guess(p);
            ans = guess(p);
            if(ans==0){
                return p;
            }else if(ans==1){
                start = p+1;
            }else{
                end = p-1;
            }
        }

        return -1;
    }
}

// beats 100% runtime