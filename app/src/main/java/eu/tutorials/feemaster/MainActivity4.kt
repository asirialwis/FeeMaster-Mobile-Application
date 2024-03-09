package eu.tutorials.feemaster

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity4 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val button1 = findViewById<ImageView>(R.id.imageView23)
        button1.setOnClickListener{
            val intent1 = Intent(this , MainActivity3::class.java)
            startActivity(intent1)
        }
    }
}