package app;

public class App {
    /*
    You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

    Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

    You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

    Example:

    Given n = 5, and version = 4 is the first bad version.

    call isBadVersion(3) -> false
    call isBadVersion(5) -> true
    call isBadVersion(4) -> true

    Then 4 is the first bad version.
    */
    public static void main(String[] args) {
       
        
        int x = firstBadVersion(3);
        System.out.printf("First Bad Version for 3 Length : %d ", x);

        x = firstBadVersion(5);
        System.out.printf("First Bad Version for 5 Length : %d ", x);

        x = firstBadVersion(4);
        System.out.printf("First Bad Version for 4 Length : %d ", x);
    }

    public static int firstBadVersion(int n) {
        int start = 1, finish = n;
        while (start < finish) {
            int m = start + (finish-start) / 2;
            if (isBadVersion(m)) {
                finish = m;
            } else {
                start = m+1;
            }
        }
    
        if (isBadVersion(start)) {
            return start;
        }
    
        return finish;
    }

    public static boolean isBadVersion(int n){
        return true;
       
    }
}