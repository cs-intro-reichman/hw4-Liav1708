public class Primes {
    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);
        for(int i = 2; i <= input; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int check){
        boolean result = true;
        int counter = 2;
        while(counter < check){
            if(check % counter == 0){
                result = false;
            }
            counter++;
        }
        return result;
    }
}