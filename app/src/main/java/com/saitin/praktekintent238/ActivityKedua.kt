package com.saitin.praktekintent238

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivityKedua : AppCompatActivity() {

    private lateinit var tvHasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)

        //binding
        tvHasil = findViewById(R.id.tv_Hasil)
        //membuat bundle dan mengambil data dari putExtra
        val bundle: Bundle? = intent.extras

        //variabel menampung nilainya
          var nim = bundle?.get("nim").toString()
          var nama = bundle?.get("nama").toString()
         var nilai=  bundle?.get("nilai").toString()
        var nilaiHuruf = hitungHuruf(nilai)

        tvHasil.text = """
            NIM  : ${nim}
            Nama :${nama}
            Nilai Angka:${nilai}
            Nilai Huruf :${nilaiHuruf}
        """.trimIndent()

    }

    fun hitungHuruf(nilai: String): String {
        var nilaiDouble = nilai.toFloat()

        if (nilaiDouble >=80){
            return "A"

        }else if (nilaiDouble >=60){
            return "B"
        }else if (nilaiDouble >=40){
            return "C"
        }else if(nilaiDouble >=20){
            return "D"
        }else{
            return "E"

        }
    }
}
