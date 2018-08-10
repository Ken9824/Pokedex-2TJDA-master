package br.com.fiap.pokedex

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import br.com.fiap.pokedex.model.Pokemon
import kotlinx.android.synthetic.main.activity_lista.*

class ListaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)
        rvPokemons.adapter = ListaPokemonAdapter(
                listaPokemons(),
                this, {
            Toast.makeText(this,
                    it.nome, Toast.LENGTH_LONG).show()
        })
        val layoutManager = LinearLayoutManager(this)
        rvPokemons.layoutManager = layoutManager
    }

    private fun listaPokemons(): List<Pokemon> {
        return listOf(
                getGoku(),
                getVegeta(),
                getZamasuG(),
                getYamcha(),
                getBroly()
        )
    }

    private fun getGoku(): Pokemon {
        return Pokemon(1, "Goku", "Fighter",
                "Goku (孫 悟空, Son Gokū, ou Son Goku), nascido Kakarotto (カカロット, Kakarotto) é o protagonista das franquias Dragon Ball. ",
                ContextCompat.getDrawable(this, R.drawable.gokubase)!!)
    }

    private fun getVegeta(): Pokemon {
        return Pokemon(2, "Vegeta", "Fighter",
                "Vegeta ou Príncipe Vegeta é o príncipe da raça Saiyajin e arqui-rival de Goku.",
                ContextCompat.getDrawable(this, R.drawable.vegetabase)!!)
    }

    private fun getZamasuG(): Pokemon {
        return Pokemon(3, "Zamasu Fundido", "Fighter",
                "Fusão Zamasu é a fusão nascida da união entre Goku Black e Zamasu do Futuro usando os brincos Potara.",
                ContextCompat.getDrawable(this, R.drawable.fusedzamasu)!!)
    }

    private fun getYamcha(): Pokemon {
        return Pokemon(4, "Yamcha", "Fighter",
                "Um antigo bandido do deserto, Yamcha já foi um inimigo de Goku, mas logo muda de lado e se torna um bom amigo e aliado",
                ContextCompat.getDrawable(this, R.drawable.yamcha)!!)
    }

    private fun getBroly(): Pokemon {
        return Pokemon(5, "Broly", "Fighter",
                "Broly é um Saiyajin que aparece pela primeira vez no filme Dragon Ball Z: O Poder Invencível. Ele é o último dos Lendários Super Saiyajins que aparecem a cada mil anos.",
                ContextCompat.getDrawable(this, R.drawable.broly)!!)
    }
}
