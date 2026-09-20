public class Anggota {
    private String nomorKtp;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    // Constructor 
    public Anggota(String nomorKtp, String nama, int limitPinjaman) {
        this.nomorKtp = nomorKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0; // Default pinjmana awal adalah 0
    }

    // Getter 
    public String getNomorKtp() {
        return nomorKtp;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    // Method untuk meminjam uang
    public void pinjam(int nominal) {
        if (this.jumlahPinjaman + nominal > this.limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            this.jumlahPinjaman += nominal;
        }
    }

    // Method untuk mengangsur dengan syarat minimal 10% dari jumlah pinjaman
    public void angsur(int nominal) {
        int minimalAngsuran = (int) (0.10 * this.jumlahPinjaman);

        if (nominal < minimalAngsuran) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman!");
        } else {
            this.jumlahPinjaman -= nominal;
            if (this.jumlahPinjaman < 0) {
                this.jumlahPinjaman = 0;
            }
        }
    }
}