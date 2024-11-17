import java.util.Scanner;

public class ProgramTransaksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("=== Program Transaksi Sederhana ===");

            // Input data transaksi
            System.out.print("Masukkan No Faktur: ");
            String noFaktur = scanner.nextLine();
            if (!noFaktur.matches("\\d+")) {
                throw new InputException("No Faktur harus berupa angka.");
            }

            System.out.print("Masukkan Kode Barang: ");
            String kodeBarang = scanner.nextLine();

            System.out.print("Masukkan Nama Barang: ");
            String namaBarang = scanner.nextLine();

            System.out.print("Masukkan Harga Barang: ");
            int hargaBarang = Integer.parseInt(scanner.nextLine());
            if (hargaBarang < 0) {
                throw new InputException("Harga Barang tidak boleh negatif.");
            }

            System.out.print("Masukkan Jumlah Beli: ");
            int jumlahBeli = Integer.parseInt(scanner.nextLine());
            if (jumlahBeli <= 0) {
                throw new InputException("Jumlah Beli harus lebih dari nol.");
            }

            // Membuat instance Transaksi
            Transaksi transaksi = new Transaksi(kodeBarang, namaBarang, hargaBarang, jumlahBeli);

            // Menampilkan hasil transaksi
            System.out.println("\n--- Detail Transaksi ---");
            System.out.println("No Faktur     : " + noFaktur);
            System.out.println("Barang        : " + transaksi);
            System.out.println("Jumlah Beli   : " + jumlahBeli);
            System.out.println("Total Harga   : Rp " + transaksi.hitungTotal());

        } catch (InputException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Input harus berupa angka.");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            scanner.close(); // Menutup scanner
        }
    }
}