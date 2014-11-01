/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.mahasiswa;

import com.uts.mahasiswa.Database;
import com.uts.mahasiswa.jdbc.Mahasiswa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Nugroho
 */
public class MahasiswaDao {
    private Connection conn;
    private String Kode_obat;
    
    public MahasiswaDao(){
        conn = Database.getConnectionDB();
    }
    
    public void simpan(Mahasiswa m){
        try {
            String sql = "insert into mahasiswa (npm,nama,ttl,tgl,jk,alamat) values (?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, m.getNpm());
            ps.setString(2, m.getNama());
            ps.setString(3, m.getTtl());
            ps.setString(4, m.getTgl());
            ps.setString(5, m.getJk());
            ps.setString(6, m.getAlamat());
            ps.executeUpdate();
        } catch (SQLException err){
            err.printStackTrace();
        }
    }
}
