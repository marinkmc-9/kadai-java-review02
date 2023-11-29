
public class Review02 {

    public static void main(String[] args) {

        //1から100までの連続した整数を画面に表示する
        for(int number = 1; number <= 100; number++) {
            
            if (number % 3 == 0 && number % 5 ==0) {
                //もし、その整数が3で割り切れ、なおかつ5で割り切れる数なら "FizzBuzz" と表示する
                System.out.println("FizzBuzz");               
            } else if (number % 3 == 0) {
                //もし、その整数が3で割り切れる数なら "Fizz" と表示する
                System.out.println("Fizz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
                //もし、その整数が5で割り切れる数なら "Buzz" と表示する
            } else {
                //それ以外の数は、その数をそのまま表示する
                System.out.println(number);
            }
         }
     }

}