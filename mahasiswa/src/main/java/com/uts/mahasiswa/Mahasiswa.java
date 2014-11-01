/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.mahasiswa.jdbc;

/**
 *
 * @author Nugroho
 */
public class Mahasiswa {
    private Integer id;
    private String npm, nama, ttl, tgl, jk, alamat;
    
    // Set for id
    public Integer getId(){
        return id;
    }
    
    public void setId(Integer id){
        this.id = id;
    }
    
    //Set for npm
    public String getNpm() {
        return npm;
    }
    
    public void setNpm(String npm) {
        this.npm = npm;
    }
    
    //set for nama
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    //Set for ttl
    public String getTtl() {
        return ttl;
    }
    
    public void setTtl(String ttl) {
        this.ttl = ttl;
    }
    
    //set for tgl
    public String getTgl() {
        return tgl;
    }
    
    public void setTgl(String tgl) {
        this.tgl = tgl;
    }
    
    //set for JK
    public String getJk() {
        return jk;
    }
    
    public void setJk(String jk) {
        this.jk = jk;
    }
    
    //set for alamat
    public String getAlamat() {
        return alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
