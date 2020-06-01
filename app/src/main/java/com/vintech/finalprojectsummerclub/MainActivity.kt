package com.vintech.finalprojectsummerclub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * Jalankan fungsi onSubmitButtonCLicked ketika
     * Button submit di click.
     */
    private fun onSubmitButtonClicked() {
        when {
            !isTitleAndContentNotEmpty() -> {
                showErrorMessage("Title dan note tidak boleh kosong")
            }
            !isTncChecked() -> {
                showErrorMessage("Checklist tnc untuk menyimpan catatan")
            }
            else -> {
                // ubah value note title dengan mengambil value dari edittext title.
                val noteTitle = ""
                // ubah value note title dengan mengambil value dari edittext content.
                val noteContent = ""
                saveNewNote(
                    title = noteTitle,
                    content = noteContent
                )
                // go to my notes screen after success save the note.
                goToMyNotesScreen()
            }
        }
    }

    /**
     * Digunakan untuk melakukan pengecekan apakah
     * checkbox tnc sudah di checklist.
     */
    private fun isTncChecked() : Boolean {
        // ubah value true dengan mengambil value dari checkbox yang dibuat.
        return true
    }

    /**
     * Digunakan untuk melakukan pengecekan apakah
     * field title dan field content sudah terisi.
     */
    private fun isTitleAndContentNotEmpty() : Boolean {
        // ubah value true dengan mengambil text value dari edittext title.
        val isTitleNotEmpty = true
        // ubah value true dengan mengambil text value dari edittext content.
        val isContentNotEmpty = true
        return isTitleNotEmpty && isContentNotEmpty
    }

    /**
     * Untuk menampilkan warning ketika ada pesan error.
     */
    private fun showErrorMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    /**
     * Untuk menyimpan notes ketika semua kondisi sudah terepenuhi.
     */
    private fun saveNewNote(title: String, content: String) {
        // ToDo: Lakukan penambahan data ke DataSources disini.
    }

    /**
     * Pergi ke halaman berikutnya menggunakan explicit intent.
     */
    private fun goToMyNotesScreen() {
        // tambahkan value context dan screen tujuan pada constructor intent.
        val intent = Intent()
        startActivity(intent)
    }
}
