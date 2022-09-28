//public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
//        if (aSmile && bSmile){
//        return true;
//        }
//        if (!aSmile && !bSmile){
//        return true;
//        }
//        return false;
//        }
//
//
//ex3
//public int sumDouble(int a, int b) {
//if (a==b) {
//  return 2*(a+b);
//} else {
//  return a+b  ;
//}
//
//
//}Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

//public int diff21(int n) {
//
//        if(n<=21) {
//        return 21-n;
//        }
//        else if(n>21){
//
//        return ((n-21)*2);
//        }
//        return 0;ƒ
//        }
//We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
//
//
//parrotTrouble(true, 6) → true
//parrotTrouble(true, 7) → false
////parrotTrouble(false, 6) → false
//public boolean parrotTrouble(boolean talking, int hour) {
//        return (talking && (hour < 7 || hour > 20));
//        }
//
//public String firstTwo(String str) {
//        int len = str.length();
//        if (len < 2)
//        return str;
//        else
//        return str.substring(0,2);
//        }