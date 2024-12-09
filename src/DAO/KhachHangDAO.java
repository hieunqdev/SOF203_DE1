package DAO;
import Model.KhachHang;
import java.sql.*;
import java.util.*;

public class KhachHangDAO {
    Connection connection;

    public KhachHangDAO(Connection connection) {
        this.connection = connection;
    }

    public List<KhachHang> readKhachHang() {
        String sql = "SELECT * FROM KhachHang";
        List<KhachHang> khachHangLst = new ArrayList<>();
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                String MaKH = rs.getString("MaKH");
                String TenKH = rs.getString("TenKH");
                String DiaChi = rs.getString("DiaChi");
                String Email = rs.getString("Email");
                boolean GioiTinh = rs.getBoolean("GioiTinh");
                KhachHang khachHang = new KhachHang(MaKH, TenKH, DiaChi, Email, GioiTinh);
                khachHangLst.add(khachHang);
            } 
            return khachHangLst;
        } catch (Exception e) {
            return khachHangLst;
        }
    }
    
    public int createKhachHang(KhachHang khachHang) {
        String sql = "INSERT INTO KhachHang VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setString(1, khachHang.getMaKH());         
            ps.setString(2, khachHang.getTenKH());        
            ps.setString(3, khachHang.getDiaChi());        
            ps.setString(4, khachHang.getEmail());         
            ps.setBoolean(5, khachHang.isGioiTinh());     
            int ketQua = ps.executeUpdate();
            return ketQua;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public int updateKhachHang(KhachHang khachHang) {
        String sql = "UPDATE KhachHang SET TenKH = ?, DiaChi = ?, Email = ?, GioiTinh = ? WHERE MaKH = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)){        
            ps.setString(1, khachHang.getTenKH());
            ps.setString(2, khachHang.getDiaChi()); 
            ps.setString(3, khachHang.getEmail());  
            ps.setBoolean(4, khachHang.isGioiTinh()); 
            ps.setString(5, khachHang.getMaKH()); 
            int ketQua = ps.executeUpdate();
            return ketQua;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public int deleteKhachHang(String MaKH) {
        String sql = "DELETE FROM KhachHang WHERE MaKH = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)){        
            ps.setString(1, MaKH); 
            int ketQua = ps.executeUpdate();
            return ketQua;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
