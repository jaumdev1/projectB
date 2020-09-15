package com.example.projetob_basquete

import android.content.DialogInterface
import android.icu.number.IntegerWidth
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var A = txtA.text.toString()
        var B = txtB.text.toString()
        btn3pa.setOnClickListener{
            A = txtA.text.toString()
            var Atotal:Double  = A.toDouble() + 3
            txtA.text = Atotal.toString()


        }
        btn2pa.setOnClickListener{
            A = txtA.text.toString()
            var Atotal:Double  = A.toDouble() + 2
            txtA.text = Atotal.toString()
        }

        btnlla.setOnClickListener{
            A = txtA.text.toString()
            var Atotal:Double  = A.toDouble() + 1
            txtA.text = Atotal.toString()
        }
        btna1.setOnClickListener{
            A = txtA.text.toString()
            var Atotal:Double  = A.toDouble() - 1
            txtA.text = Atotal.toString()
        }
        btn3pb.setOnClickListener{
            B = txtB.text.toString()
            var Btotal:Double  = B.toDouble() + 3
            txtB.text = Btotal.toString()


        }
        btn2pb.setOnClickListener{
            B = txtB.text.toString()
            var Atotal:Double  = B.toDouble() + 2
            txtB.text = Atotal.toString()
        }

        btnllb.setOnClickListener{
            B = txtB.text.toString()
            var Btotal:Double  = B.toDouble() + 1
            txtB.text = Btotal.toString()
        }
        btnb1.setOnClickListener{
            B = txtB.text.toString()
            var Btotal:Double  = B.toDouble() - 1
            txtB.text = Btotal.toString()
        }
        btnreset.setOnClickListener{
            val msgbox =  AlertDialog.Builder(this)
            msgbox.setTitle("REINICIAR PLACAR!")
            msgbox.setIcon(android.R.drawable.ic_menu_delete)
            msgbox.setMessage("Tem certeza?")


            msgbox.setPositiveButton("sim") { dialog, which ->
                Toast.makeText(applicationContext,
                    android.R.string.yes, Toast.LENGTH_SHORT).show()
                txtA.text = "0"
                txtB.text = "0"
            }
            msgbox.setNegativeButton("não") { dialog, which ->
                Toast.makeText(applicationContext,
                    android.R.string.no, Toast.LENGTH_SHORT).show()

            }
            msgbox.show()




        }



    }


}