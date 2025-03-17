package es.viran.colorchanger

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rootLayout = findViewById<ConstraintLayout>(R.id.rootLayout)
        changeBackgroundColor(rootLayout) // Cambiamos el fondo al iniciar

        rootLayout.setOnClickListener {
            changeBackgroundColor(rootLayout) // Cambia de color al hacer clic
        }
    }

    private fun changeBackgroundColor(view: View) {
        val randomColor = Color.rgb(
            Random.nextInt(256),
            Random.nextInt(256),
            Random.nextInt(256)
        )
        view.setBackgroundColor(randomColor)
    }
}