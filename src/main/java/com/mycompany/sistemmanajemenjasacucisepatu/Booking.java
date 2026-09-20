package com.mycompany.sistemmanajemenjasacucisepatu;

public class Booking {

    private String idBooking;
    private Pelanggan pelanggan;
    private Sepatu sepatu;
    private Layanan layanan;
    private String tanggalBooking;
    private String status;

    public Booking(String idBooking, Pelanggan pelanggan, Sepatu sepatu,
                   Layanan layanan, String tanggalBooking) {

        this.idBooking = idBooking;
        this.pelanggan = pelanggan;
        this.sepatu = sepatu;
        this.layanan = layanan;
        this.tanggalBooking = tanggalBooking;

        // Status awal setiap booking
        this.status = "Diproses";
    }

    public String getIdBooking() {
        return idBooking;
    }

    public String getStatus() {
        return status;
    }

    public void ubahStatus(String statusBaru) {
        this.status = statusBaru;
    }

    public void tampilkanBooking() {

        System.out.println("========================================");
        System.out.println("              DETAIL BOOKING");
        System.out.println("========================================");

        System.out.println("ID Booking      : " + idBooking);
        System.out.println("Pelanggan       : " + pelanggan.getNamaPelanggan());
        System.out.println("No. Telepon     : " + pelanggan.getNoTelepon());
        System.out.println("Sepatu          : " + sepatu.getNamaSepatu());
        System.out.println("Jenis Sepatu    : " + sepatu.getJenisSepatu());
        System.out.println("Layanan         : " + layanan.getNamaLayanan());
        System.out.println("Harga           : Rp" + String.format("%.0f", layanan.getHarga()));
        System.out.println("Estimasi        : " + layanan.getEstimasiHari() + " hari");
        System.out.println("Tanggal Booking : " + tanggalBooking);
        System.out.println("Status          : " + status);

        System.out.println("========================================");
    }
}