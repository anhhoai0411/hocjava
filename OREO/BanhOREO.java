package OREO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
import database2.Banh;

public class BanhOREO implements OREOInterface<Banh>{

    public static BanhOREO getInstance() {
        return new BanhOREO();
    }

    @Override
    public int insert(Banh t) {
        int ketQua = 0;
        try {
            // Bước 1: tạo kết nối đến CSDL
            Connection con = JDBCUtil.getConnection();

            // Bước 2: tạo ra đối tượng statement
            Statement st = con.createStatement();

            // Bước 3: thực thi câu lệnh SQL
            String sql = "INSERT INTO Banh (id, tenBanh, giaBan, hanSuDung) "+
                    " VALUES ('"+t.getId()+"' , '"+t.getTenBanh()+"' , "+ t.getGiaBan()+" , '"+t.gethanSuDung()+"')";

            ketQua = st.executeUpdate(sql);

            // Bước 4:
            System.out.println("Bạn đã thực thi: "+ sql);
            System.out.println("Có "+ ketQua+" dòng bị thay đổi!");

            // Bước 5:
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return ketQua;
    }

    @Override
    public int update(Banh t) {
        int ketQua = 0;
        try {
            // Bước 1: tạo kết nối đến CSDL
            Connection con = JDBCUtil.getConnection();

            // Bước 2: tạo ra đối tượng statement
            Statement st = con.createStatement();

            // Bước 3: thực thi câu lệnh SQL

            String sql = "UPDATE Banh "+
                    " SET " +
                    " tenBanh='"+ t.getTenBanh()+"'"+
                    ", giaBan="+ t.getGiaBan()+
                    ", hanSuDung="+ t.gethanSuDung()+
                    " WHERE id='"+t.getId()+"\'";
            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            // Bước 4:
            System.out.println("Bạn đã thực thi: "+ sql);
            System.out.println("Có "+ ketQua+" dòng bị thay đổi!");

            // Bước 5:
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return ketQua;
    }

    @Override
    public int delete(Banh t) {
        int ketQua = 0;
        try {
            // Bước 1: tạo kết nối đến CSDL
            Connection con = JDBCUtil.getConnection();

            // Bước 2: tạo ra đối tượng statement
            Statement st = con.createStatement();

            // Bước 3: thực thi câu lệnh SQL

            String sql = "DELETE from Banh "+
                    " WHERE id='"+t.getId()+"'";
            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            // Bước 4:
            System.out.println("Bạn đã thực thi: "+ sql);
            System.out.println("Có "+ ketQua+" dòng bị thay đổi!");

            // Bước 5:
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return ketQua;
    }

    @Override
    public ArrayList<Banh> selectAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Sach selectById(Banh t) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ArrayList<Banh> selectByCondition(String condition) {
        // TODO Auto-generated method stub
        return null;
    }

}

