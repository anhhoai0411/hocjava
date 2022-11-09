package database2;

public class Banh {
    private String id;
    private String tenBanh;
    private float giaBan;
    private int hanSuDung;

    public Banh() {
        super();
    }

    public Banh(String id, String tenBanh, float giaBan, int hanSuDung) {
        super();
        this.id = id;
        this.tenBanh = tenBanh;
        this.giaBan = giaBan;
        this.hanSuDung = hanSuDung;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenBanh() {
        return tenBanh;
    }

    public void setTenBanh(String tenBanh) {
        this.tenBanh = tenBanh;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public int gethanSuDung() {
        return hanSuDung;
    }

    public void sethanSuDung(int hanSuDung) {
        this.hanSuDung = hanSuDung;
    }

}

