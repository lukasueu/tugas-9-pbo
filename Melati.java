public class Melati extends Plant
{
    private String jenis;
    public Melati() {
        super();
        jenis = "Melati";
    }
    public void cekKondisiTumbuh() {
        if (getJumlahAir() >=3 && getJumlahPupuk() >=2) {
            tumbuh();
        }
    }
    public void tumbuh() {
        if (getStatusTumbuh() <4 ) {
            setJumlahAir(getJumlahAir() - 3);
            setJumlahPupuk(getJumlahPupuk() - 2);
            setStatusTumbuh(getStatusTumbuh() + 1);
        }
    }
    public String getJenis() {
        return jenis;
    }
}