public class Barang {
    protected String kodeBarang;
    protected String namaBarang;
    protected int hargaBarang;

    // Constructor untuk inisialisasi barang
    public Barang(String kodeBarang, String namaBarang, int hargaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    @Override
    public String toString() {
        return kodeBarang + " - " + namaBarang + " (Rp " + hargaBarang + ")";
    }
}