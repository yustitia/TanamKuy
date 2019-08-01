
package com.adis.tanamkuy.Model;

import java.util.HashMap;
import java.util.Map;

public class Item {

    private String id_kebun;
    private String nama_tanaman;
    private String cara_menanam;
    private String gambar_tanaman;
    private String jenis_tanaman;
    private String harga_bibit;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();



    public String getId_kebun() {
        return id_kebun;
    }

    public void setId_kebun(String id_kebun) {
        this.id_kebun = id_kebun;
    }

    public String getNama_tanaman() {
        return nama_tanaman;
    }

    public void setNama_tanaman(String nama_tanaman) {
        this.nama_tanaman = nama_tanaman;
    }

    public String getCara_menanam() {
        return cara_menanam;
    }

    public void setCara_menanam(String cara_menanam) {
        this.cara_menanam = cara_menanam;
    }

    public String getGambar_tanaman() {
        return gambar_tanaman;
    }

    public void setGambar_tanaman(String gambar_tanaman) {
        this.gambar_tanaman = gambar_tanaman;
    }

    public String getJenis_tanaman() {
        return jenis_tanaman;
    }

    public void setJenis_tanaman(String jenis_tanaman) {
        this.jenis_tanaman = jenis_tanaman;
    }

    public String getHarga_bibit() {
        return harga_bibit;
    }

    public void setHarga_bibit(String harga_bibit) {
        this.harga_bibit = harga_bibit;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }




}
