package com.example.exercicio_dia13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    lateinit var imagem1:ImageView
    lateinit var imagem2:ImageView
    lateinit var imagem3:ImageView

    lateinit var nome1: TextView
    lateinit var nome2: TextView
    lateinit var nome3: TextView

    lateinit var desc1: TextView
    lateinit var desc2: TextView
    lateinit var desc3: TextView

    lateinit var preco1: TextView
    lateinit var preco2: TextView
    lateinit var preco3: TextView

    var item1 = Item("Ração Pedigree", "Ração para cães adultos - 15Kg", "R$130,00", "https://www.petlove.com.br/images/products/228570/product/Ra%C3%A7%C3%A3o_Seca_Pedigree_Nutri%C3%A7%C3%A3o_Essencial_Carne_para_C%C3%A3es_Adultos_2513328.jpg?1627729390")
    var item2 = Item("Ração Magnum", "Ração para gatos adultos - 15Kg", "R$115,50", "https://www.petlove.com.br/images/products/225965/product/Ra%C3%A7%C3%A3o_Magnus_Cat_Premium_Frango_para_Gatos_Adultos_Castrados_2524815.jpg?1627724167")
    var item3 = Item("Cama Pet", "Caminha para pet. Disponível em diversas cores", "R$85,50", "https://images.tcdn.com.br/img/img_prod/644613/cama_pet_cachorro_gato_brisa_c_ziper_rose_panda_1003_1_20201215034109.jpg")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imagem1 = findViewById(R.id.imagem1)
        imagem2 = findViewById(R.id.imagem2)
        imagem3 = findViewById(R.id.imagem3)

        nome1 = findViewById(R.id.nome1)
        nome2 = findViewById(R.id.nome2)
        nome3 = findViewById(R.id.nome3)

        desc1 = findViewById(R.id.descricao1)
        desc2 = findViewById(R.id.descricao2)
        desc3 = findViewById(R.id.descricao3)

        preco1 = findViewById(R.id.preco1)
        preco2 = findViewById(R.id.preco2)
        preco3 = findViewById(R.id.preco3)

        nome1.text=item1.nome
        desc1.text=item1.desc
        preco1.text=item1.preco

        nome2.text=item2.nome
        desc2.text=item2.desc
        preco2.text=item2.preco

        nome3.text=item3.nome
        desc3.text=item3.desc
        preco3.text=item3.preco

        Picasso.get()
            .load(item1.imagem)
            .into(imagem1)
        Picasso.get()
            .load(item2.imagem)
            .into(imagem2)
        Picasso.get()
            .load(item3.imagem)
            .into(imagem3)




    }

}