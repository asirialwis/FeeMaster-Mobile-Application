package eu.tutorials.feemaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val button1 = findViewById<ImageView>(R.id.studentList)
        button1.setOnClickListener{
            val intent1 = Intent(this , MainActivity4::class.java)
            startActivity(intent1)
    }
        val button2 = findViewById<ImageView>(R.id.featureList)
        button2.setOnClickListener{
            val intent2 = Intent(this , MainActivity5::class.java)
            startActivity(intent2)
        }
        val button3 = findViewById<ImageView>(R.id.imageView6)
        button3.setOnClickListener{
            val intent2 = Intent(this , MainActivity6::class.java)
            startActivity(intent2)
        }
        val button4 = findViewById<ImageView>(R.id.imageView12)
        button4.setOnClickListener{
            val intent2 = Intent(this , MainActivity7::class.java)
            startActivity(intent2)
        }

}
}