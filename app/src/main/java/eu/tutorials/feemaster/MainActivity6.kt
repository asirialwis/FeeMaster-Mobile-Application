package eu.tutorials.feemaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        val button1 = findViewById<ImageView>(R.id.imageView27)
        button1.setOnClickListener{
            val intent2 = Intent(this , MainActivity3::class.java)
            startActivity(intent2)
        }
    }
}