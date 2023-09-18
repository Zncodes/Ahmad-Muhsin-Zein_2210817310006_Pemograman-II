import java.util.Scanner;
public class PRAK005_2210817310006_AhmadMuhsinZein {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan Makanan Favorit : ");
		String food = scanner.next();
		System.out.println("Masukkan Hobi : ");
		String hobby = scanner.next();
		
		System.out.println("Aku suka makan "+food+","+" dan Hobiku "+hobby);
		scanner.close();
	}

}
