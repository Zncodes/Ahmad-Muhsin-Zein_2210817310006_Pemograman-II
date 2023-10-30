package PRAK303_2210817310006_AhmadMuhsinZein;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Mahasiswa> data_mahasiswa = new ArrayList<>();       
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            int menu = scan.nextInt();
            scan.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String nim = scan.nextLine();

                    boolean nimUnik = true;
                    for (Mahasiswa mahasiswa : data_mahasiswa) {
                        if (mahasiswa.getNim().equals(nim)) {
                            nimUnik = false;
                            break;
                        }
                    }

                    if (nimUnik) {
                        Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
                        data_mahasiswa.add(mahasiswa);
                        System.out.println("Mahasiswa " + mahasiswa.getNama() + " ditambahkan.");
                    } else {
                        System.out.println("NIM harus unik. Mahasiswa tidak ditambahkan.");
                    }
                    break;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String nimHapus = scan.nextLine();

                    for (int i = 0; i < data_mahasiswa.size(); i++) {
                        Mahasiswa mahasiswa = data_mahasiswa.get(i);
                        if (mahasiswa.getNim().equals(nimHapus)) {
                            data_mahasiswa.remove(i);
                            System.out.println("Mahasiswa dengan NIM " + nimHapus + " dihapus.");
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dicari: ");
                    String nimCari = scan.nextLine();

                    for (Mahasiswa mahasiswa : data_mahasiswa) {
                        if (mahasiswa.getNim().equals(nimCari)) {
                            System.out.println("Mahasiswa ditemukan:");
                            System.out.println(mahasiswa);
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Daftar Mahasiswa:");
                    for (Mahasiswa mahasiswa : data_mahasiswa) {
                        System.out.println(mahasiswa);
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    data_mahasiswa.clear();
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    break;
            }
        }
    }
}
