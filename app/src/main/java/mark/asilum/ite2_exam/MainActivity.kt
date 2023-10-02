package mark.asilum.ite2_exam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.formlayout)

        val btnBack: Button
        btnBack = findViewById(R.id.button9)
        btnBack.setOnClickListener{
            Log.d("ZZZ123","go back and destroy")
        }

        val btnSave: Button
        btnSave = findViewById(R.id.button8)
        btnSave.setOnClickListener{

            val etFirstname: EditText
            etFirstname = findViewById(R.id.editTextText2)
            val value = etFirstname.text.toString()
            Log.d("ZZZ123","Save $value and pass to next")

            val thirdScreen:Intent
            thirdScreen = Intent(this,MainActivity2::class.java)
            thirdScreen.putExtra("Firstname",value)
            startActivity(thirdScreen)

        }
    }

}