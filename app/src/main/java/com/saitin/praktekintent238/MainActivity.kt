package com.saitin.praktekintent238

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    //lateinit var = membuat variabel yg diinisialisasikan di metod lain
    private  lateinit var txtNim: EditText
    private lateinit var txtNama: EditText
    private lateinit var txtNilai: EditText
    private lateinit var btnProses: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //inisialisasi variabel/binding
        txtNim =findViewById(R.id.txt_nim)
        txtNama = findViewById(R.id.txt_nama)
        txtNilai = findViewById(R.id.txt_nilai)
        btnProses = findViewById(R.id.btn_proses)

        // membuat tombol dapat di klik

        btnProses.setOnClickListener{
            // ini tempat untuk membuat code
            //membuat intent
            intent = Intent(this,ActivityKedua::class.java)

            //selanjutnya membuat agar kita mengirim data ke activity selanjutnya
            intent.putExtra("nim",txtNim.text)
            intent.putExtra("nama",txtNama.text)
            intent.putExtra("nilai",txtNilai.text)
            // memulai activity selanjutnya
            startActivity(intent)
        }
    }
}
