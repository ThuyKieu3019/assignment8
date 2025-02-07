import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot chuoi: ");
        String chuoi = scanner.nextLine();
        int soKyTu = chuoi.length();
        System.out.println("So ky tu trong chuoi la: " + soKyTu);
        scanner.close();
    }
}

    

