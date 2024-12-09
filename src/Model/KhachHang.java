package Model;

public class KhachHang {
    String MaKH;    
    String TenKH;        
    String DiaChi;     
    String Email;        
    boolean GioiTinh; 

    public KhachHang() {
    }

    public KhachHang(String MaKH, String TenKH, String DiaChi, String Email, boolean GioiTinh) {
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.DiaChi = DiaChi;
        this.Email = Email;
        this.GioiTinh = GioiTinh;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getMaKH() {
        return MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public String getEmail() {
        return Email;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    } 
}
