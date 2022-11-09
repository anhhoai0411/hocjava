package OREO;

import java.util.ArrayList;

import database2.KhachHang;

public class KhachHangOREO implements OREOInterface<KhachHang>{

    public static KhachHangOREO getInstance() {
        return new KhachHangOREO();
    }

    @Override
    public int insert(KhachHang t) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int update(KhachHang t) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int delete(KhachHang t) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public ArrayList<KhachHang> selectAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public KhachHang selectById(KhachHang t) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ArrayList<KhachHang> selectByCondition(String condition) {
        // TODO Auto-generated method stub
        return null;
    }

}

