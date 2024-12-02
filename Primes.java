public class Primes {
    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);
        double counter = 0;
        System.out.println("Prime numbers up to " + input + ":");
        for(int i = 2; i <= input; i++){
            if(isPrime(i)){
                System.out.println(i);
                counter++;
            }
        }
        int percentage = (int) ((counter / input) * 100);
        System.out.println("There are " + (int) counter + " primes between 2 and " + input + " (" + percentage + "% are primes)");
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