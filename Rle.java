import java.util.Scanner;

public class Rle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 to encode or Press 2 to decode");
        int input = scanner.nextInt();
        scanner.nextLine();
        if(input==1){
            System.out.println("Encode");
            String string = scanner.nextLine();
            System.out.println(RleEncode.encode(string));
        } else if(input==2){
            System.out.println("To be decoded");
            String string = scanner.nextLine();
            System.out.println(RleDecode.decode(string));
        } else {
            System.out.println("Wrong input");
        }   
        scanner.close();
    }  
}
