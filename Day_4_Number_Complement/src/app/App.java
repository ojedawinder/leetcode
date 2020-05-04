package app;


public class App {
    public static void main(String []argh){
        int n = 5;
        int result = findComplement(n);
        System.out.printf("%d %d%n", n, result);

        n = 7;
        result = findComplement(n);
        System.out.printf("%d %d%n", n, result);

        n = 10;
        result = findComplement(n);
        System.out.printf("%d %d%n", n, result);
    }

    public static int findComplement(int num) {
        int complement = 0;
        String original = Integer.toBinaryString(num); // n= 6, b=1100 
        int exp = 0;
        for(int i = (original.length()-1); i >=0;i--){
            char ch = original.charAt(i);
            if(ch=='0')
                complement+= Math.pow(2, exp);
            exp++;
        }

        return complement;
    }
}