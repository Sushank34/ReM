package com.ps3.rem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ProductList : AppCompatActivity() {
    var id:String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_list)

        id = intent.getStringExtra("ID")

    }

    fun redirect(view: View)
    {
        view.setOnClickListener {
            intent  = Intent(applicationContext,ProductDetails::class.java)
            if(view.id == R.id.btndet1s){
                intent.putExtra("Type","Solar")
            }
            if(view.id == R.id.btndet2g){
                intent.putExtra("Type", "GeoT")
            }
            if(view.id == R.id.btndet3w){
                intent.putExtra("Type", "Wind")
            }
            intent.putExtra("ID",id)
            startActivity(intent)
        }
    }
}