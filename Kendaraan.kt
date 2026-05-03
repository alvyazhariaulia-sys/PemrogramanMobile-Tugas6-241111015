package com.utama.aplikasikendarin

data class Kendaraan(
    val id: Int = 0,
    val nama: String,
    val harga: String,
    val deskripsi: String,
    val gambar: Int,
    val lokasi: String = "Jakarta",
    val tersedia: Boolean = true
) {
    fun getFormattedHarga(): String {
        return "Rp %,d / hari".format(harga).replace(',', '.')
    }
}
