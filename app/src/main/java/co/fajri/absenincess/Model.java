package co.fajri.absenincess;

public class Model {

    private String no;
    private String nama;
    private String npt;
    private String kelas;


    public Model(String no, String nama, String npt, String kelas){
        this.no = no;
        this.nama = nama;
        this.npt = npt;
        this.kelas = kelas;
    }

    public String getNo(){
        return no;
    }

    public void setNo(){
        this.no = no;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(){
        this.nama = nama;
    }

    public String getNpt(){
        return npt;
    }

    public void setNpt(){
        this.npt = npt;
    }

    public String getKelas(){
        return kelas;
    }

    public void setKelas(){
        this.kelas = kelas;
    }
}

