package mx.edu.potros.examenu2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        var btnDetalles: Button = findViewById(R.id.btn_detalles) as Button
        var btnGlobos: Button = findViewById(R.id.btn_globos) as Button
        var btnPeluches: Button = findViewById(R.id.btn_peluches) as Button
        var btnRegalos: Button = findViewById(R.id.btn_regalos) as Button
        var btnTazas: Button = findViewById(R.id.btn_tazas) as Button

        btnDetalles.setOnClickListener {
            var intent: Intent = Intent(this,Regalos::class.java)
            intent.putExtra("menuType","Detalles")
            startActivity(intent)
        }


        btnGlobos.setOnClickListener {
            var intent: Intent = Intent(this,Regalos::class.java)
            intent.putExtra("menuType","Globos")
            startActivity(intent)
        }


        btnPeluches.setOnClickListener {
            var intent: Intent = Intent(this,Regalos::class.java)
            intent.putExtra("menuType","Peluches")
            startActivity(intent)
        }


        btnRegalos.setOnClickListener {
            var intent: Intent = Intent(this,Regalos::class.java)
            intent.putExtra("menuType","Regalos")
            startActivity(intent)
        }

        btnTazas.setOnClickListener {
            var intent: Intent = Intent(this,Regalos::class.java)
            intent.putExtra("menuType","Tazas")
            startActivity(intent)
        }



    }
}