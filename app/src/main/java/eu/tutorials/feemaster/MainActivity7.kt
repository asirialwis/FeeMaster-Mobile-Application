package eu.tutorials.feemaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        val button1 = findViewById<ImageView>(R.id.imageView22)
        button1.setOnClickListener{
            val intent1 = Intent(this , MainActivity3::class.java)
            startActivity(intent1)
        }
    }
}