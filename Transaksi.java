public class Transaksi extends Barang {
    private int jumlahBeli;

    // Constructor untuk inisialisasi transaksi
    public Transaksi(String kodeBarang, String namaBarang, int hargaBarang, int jumlahBeli) {
        super(kodeBarang, namaBarang, hargaBarang); // Memanggil constructor parent class
        this.jumlahBeli = jumlahBeli;
    }

    // Metode untuk menghitung total harga
    public int hitungTotal() {
        return hargaBarang * jumlahBeli;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }
}