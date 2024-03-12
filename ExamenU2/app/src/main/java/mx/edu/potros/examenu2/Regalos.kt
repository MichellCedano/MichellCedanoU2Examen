package mx.edu.potros.examenu2

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView

class Regalos : AppCompatActivity() {

    var adapter: AdaptadorProductos? = null
    var detalles= ArrayList<Detalles>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regalos)

        var menuOption: String? = intent.getStringExtra("menuType")
        agregarProductos(menuOption)

        adapter =AdaptadorProductos(this, detalles)

        var gridDetalles: GridView = findViewById(R.id.detalles_Catalogo)

        var adaptador: AdaptadorProductos = AdaptadorProductos(this,detalles)
        gridDetalles.adapter = adapter

    }

    fun agregarProductos(option:String?){
        when(option){
            "Detalles"->{
                detalles.add(Detalles(R.drawable.cumplebotanas,"$280"))
                detalles.add(Detalles(R.drawable.cumplecheve,"$320"))
                detalles.add(Detalles(R.drawable.cumpleescolar,"$330"))
                detalles.add(Detalles(R.drawable.cumplepaletas,"$190"))
                detalles.add(Detalles(R.drawable.cumplevinos,"$370"))
                detalles.add(Detalles(R.drawable.cumplesnack,"$150"))
            }
            "Globos"->{


            }
            "Peluches"->{


            }
            "Regalos"->{

            }
            "Tazas"->{

            }
            "Drinks"->{

            }
        }
    }

}

class AdaptadorProductos: BaseAdapter {
    var detalle=ArrayList<Detalles>()
    var contexto: Context?=null

    constructor(contexto:Context, detalle: ArrayList<Detalles>){
        this.detalle=detalle
        this.contexto=contexto
    }

    override fun getCount(): Int {
        return detalle.size
    }

    override fun getItem(position: Int): Any {
        return detalle[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var prod= detalle [position]
        var inflador= LayoutInflater.from(contexto)
        var vista=inflador.inflate(R.layout.activity_detalle_regalos,null)

        var imagen = vista.findViewById(R.id.iv_regalo_imagen) as ImageView
        var precio=vista.findViewById(R.id.tv_regalo_precio) as TextView


        imagen.setImageResource(prod.image)

        precio.setText(prod.precio)

        return vista
    }
}