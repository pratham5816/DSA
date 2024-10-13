package javaDSAfreeCodeCamp;

public class reverseint {
    public long rev(int number){
        boolean isNegetive = number < 0;
        if(isNegetive){
            number = number * -1;
        }

        long reverse = 0;
        int lastDigit;
        while(number > 0){
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }

        return isNegetive? reverse * -1 : reverse;                           
    }
}
