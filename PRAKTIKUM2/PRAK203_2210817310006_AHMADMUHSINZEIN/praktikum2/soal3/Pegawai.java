package praktikum2.soal3;

public class Pegawai {
	public String nama;
    /* Pada baris ini terjadi kesalahan karena tipe data yang digunakan harusnya (String),
     * dan bukan (Char)*/
    //public char asal;
    public String asal;
    public String jabatan;
    /* Pada baris ini terjadi kesalahan karena disini variabel umur belum ada value nya, 
     * ketika di run hasilnya akan menjadi nol, seharusnya di beri nilai terlebih dahulu. */
    //public int umur;
    public int umur = 17;
    
    public String getNama() {
        return nama;
    }    
    public String getAsal() {
        return asal;
    }
    
    /* Disini terjadi kesalahan karena pada parameter setJabatan tidak ada isinya sama sekali, 
     * sedangkan pada class Soal3Main terdapat isi parameter yaitu "Assassin". 
     * Pada baris ini (this.jabatan = j ;) juga terjadi kesalahan karena this harus nya merujuk kepada variabel dibagian atas, 
     * yang dimana disini merujuk ke variabel (jabatan) */
    /*public void setJabatan() {
        this.jabatan = j;
    }*/
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}
