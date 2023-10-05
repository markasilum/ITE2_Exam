package mark.asilum.ite2_exam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class QPIcalc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qpicalc)

        val btnA: Button
        btnA = findViewById(R.id.btnA)
        val btnBP: Button
        btnBP = findViewById(R.id.btnBP)
        val btnB: Button
        btnB = findViewById(R.id.btnB)
        val btnCP: Button
        btnCP = findViewById(R.id.btnCP)
        val btnC: Button
        btnC = findViewById(R.id.btnC)
        val btnF: Button
        btnF = findViewById(R.id.btnF)
        val btnD: Button
        btnD = findViewById(R.id.btnD)
        val btnU3: Button
        btnU3 = findViewById(R.id.btnU3)
        btnU3.isEnabled = false
        val btnU5: Button
        btnU5 = findViewById(R.id.btnU5)
        btnU5.isEnabled = false
        val btnU9: Button
        btnU9 = findViewById(R.id.btnU9)
        btnU9.isEnabled = false



        btnA.setOnClickListener{

            val etEquation: EditText
            etEquation = findViewById(R.id.etEquation)
            val value = btnA.text.toString()
            Log.d("ZZZ123","Save $value and pass to next")
            if(etEquation.text.toString()=="Equation"){
                etEquation.setText("($value * ")
            }else{
                if(etEquation.length()<6){
                    etEquation.append("($value * ")
                }else{
                    etEquation.append(" + ($value * ")
                }

            }
            btnA.isEnabled=false
            btnBP.isEnabled=false
            btnB.isEnabled=false
            btnCP.isEnabled=false
            btnC.isEnabled=false
            btnD.isEnabled=false
            btnF.isEnabled=false
            btnU3.isEnabled = true
            btnU5.isEnabled = true
            btnU9.isEnabled = true


        }


        btnBP.setOnClickListener{

            val etEquation: EditText
            etEquation = findViewById(R.id.etEquation)
            val value = btnBP.text.toString()
            Log.d("ZZZ123","Save $value and pass to next")
            if(etEquation.text.toString()=="Equation"){
                etEquation.setText("($value * ")
            }else{
                if(etEquation.length()<6){
                    etEquation.append("($value * ")
                }else{
                    etEquation.append(" + ($value * ")
                }
            }
            btnA.isEnabled=false
            btnBP.isEnabled=false
            btnB.isEnabled=false
            btnCP.isEnabled=false
            btnC.isEnabled=false
            btnD.isEnabled=false
            btnF.isEnabled=false
            btnU3.isEnabled = true
            btnU5.isEnabled = true
            btnU9.isEnabled = true

        }

        btnB.setOnClickListener{

            val etEquation: EditText
            etEquation = findViewById(R.id.etEquation)
            val value = btnB.text.toString()
            Log.d("ZZZ123","Save $value and pass to next")
            if(etEquation.text.toString()=="Equation"){
                etEquation.setText("($value * ")
            }else{
                if(etEquation.length()<6){
                    etEquation.append("($value * ")
                }else{
                    etEquation.append(" + ($value * ")
                }
            }
            btnA.isEnabled=false
            btnBP.isEnabled=false
            btnB.isEnabled=false
            btnCP.isEnabled=false
            btnC.isEnabled=false
            btnD.isEnabled=false
            btnF.isEnabled=false
            btnU3.isEnabled = true
            btnU5.isEnabled = true
            btnU9.isEnabled = true

        }

        btnCP.setOnClickListener{

            val etEquation: EditText
            etEquation = findViewById(R.id.etEquation)
            val value = btnCP.text.toString()
            Log.d("ZZZ123","Save $value and pass to next")
            if(etEquation.text.toString()=="Equation"){
                etEquation.setText("($value * ")
            }else{
                if(etEquation.length()<6){
                    etEquation.append("($value * ")
                }else{
                    etEquation.append(" + ($value * ")
                }
            }
            btnA.isEnabled=false
            btnBP.isEnabled=false
            btnB.isEnabled=false
            btnCP.isEnabled=false
            btnC.isEnabled=false
            btnD.isEnabled=false
            btnF.isEnabled=false
            btnU3.isEnabled = true
            btnU5.isEnabled = true
            btnU9.isEnabled = true

        }

        btnC.setOnClickListener{

            val etEquation: EditText
            etEquation = findViewById(R.id.etEquation)
            val value = btnC.text.toString()
            Log.d("ZZZ123","Save $value and pass to next")
            if(etEquation.text.toString()=="Equation"){
                etEquation.setText("($value * ")
            }else{
                if(etEquation.length()<6){
                    etEquation.append("($value * ")
                }else{
                    etEquation.append(" + ($value * ")
                }
            }
            btnA.isEnabled=false
            btnBP.isEnabled=false
            btnB.isEnabled=false
            btnCP.isEnabled=false
            btnC.isEnabled=false
            btnD.isEnabled=false
            btnF.isEnabled=false
            btnU3.isEnabled = true
            btnU5.isEnabled = true
            btnU9.isEnabled = true

        }

        btnF.setOnClickListener{

            val etEquation: EditText
            etEquation = findViewById(R.id.etEquation)
            val value = btnF.text.toString()
            Log.d("ZZZ123","Save $value and pass to next")
            if(etEquation.text.toString()=="Equation"){
                etEquation.setText("($value * ")
            }else{
                if(etEquation.length()<6){
                    etEquation.append("($value * ")
                }else{
                    etEquation.append(" + ($value * ")
                }
            }
            btnA.isEnabled=false
            btnBP.isEnabled=false
            btnB.isEnabled=false
            btnCP.isEnabled=false
            btnC.isEnabled=false
            btnD.isEnabled=false
            btnF.isEnabled=false
            btnU3.isEnabled = true
            btnU5.isEnabled = true
            btnU9.isEnabled = true

        }

        btnD.setOnClickListener{

            val etEquation: EditText
            etEquation = findViewById(R.id.etEquation)
            val value = btnD.text.toString()
            Log.d("ZZZ123","Save $value and pass to next")
            if(etEquation.text.toString()=="Equation"){
                etEquation.setText("($value * ")
            }else{
                if(etEquation.length()<6){
                    etEquation.append("($value * ")
                }else{
                    etEquation.append(" + ($value * ")
                }
            }
            btnA.isEnabled=false
            btnBP.isEnabled=false
            btnB.isEnabled=false
            btnCP.isEnabled=false
            btnC.isEnabled=false
            btnD.isEnabled=false
            btnF.isEnabled=false
            btnU3.isEnabled = true
            btnU5.isEnabled = true
            btnU9.isEnabled = true

        }




        btnU3.setOnClickListener{

            val etEquation: EditText
            etEquation = findViewById(R.id.etEquation)
            val value = btnU3.text.toString()
            Log.d("ZZZ123","Equation text length: ${etEquation.length()} ")
            if(etEquation.length()<=6){
                etEquation.append("$value)")
            }else{
                etEquation.append("$value)")
            }
            btnA.isEnabled=true
            btnBP.isEnabled=true
            btnB.isEnabled=true
            btnCP.isEnabled=true
            btnC.isEnabled=true
            btnD.isEnabled=true
            btnF.isEnabled=true
            btnU3.isEnabled = false
            btnU5.isEnabled = false
            btnU9.isEnabled = false


        }

        btnU5.setOnClickListener{

            val etEquation: EditText
            etEquation = findViewById(R.id.etEquation)
            val value = btnU5.text.toString()
            Log.d("ZZZ123","Equation text length: ${etEquation.length()} ")
            if(etEquation.length()<=6){
                etEquation.append("$value)")
            }else{
                etEquation.append("$value)")
            }
            btnA.isEnabled=true
            btnBP.isEnabled=true
            btnB.isEnabled=true
            btnCP.isEnabled=true
            btnC.isEnabled=true
            btnD.isEnabled=true
            btnF.isEnabled=true
            btnU3.isEnabled = false
            btnU5.isEnabled = false
            btnU9.isEnabled = false


        }

        btnU9.setOnClickListener{

            val etEquation: EditText
            etEquation = findViewById(R.id.etEquation)
            val value = btnU9.text.toString()
            Log.d("ZZZ123","Equation text length: ${etEquation.length()} ")
            if(etEquation.length()<=6){
                etEquation.append("$value)")
            }else{
                etEquation.append("$value)")
            }
            btnA.isEnabled=true
            btnBP.isEnabled=true
            btnB.isEnabled=true
            btnCP.isEnabled=true
            btnC.isEnabled=true
            btnD.isEnabled=true
            btnF.isEnabled=true
            btnU3.isEnabled = false
            btnU5.isEnabled = false
            btnU9.isEnabled = false


        }

        val btnClear: Button
        btnClear = findViewById(R.id.btnClear)
        btnClear.setOnClickListener{

            val etEquation: EditText
            etEquation = findViewById(R.id.etEquation)
            etEquation.setText("Equation")
            val qpiText: EditText
            qpiText = findViewById(R.id.etQPI)
            qpiText.setText("QPI")
            btnA.isEnabled=true
            btnBP.isEnabled=true
            btnB.isEnabled=true
            btnCP.isEnabled=true
            btnC.isEnabled=true
            btnD.isEnabled=true
            btnF.isEnabled=true
            btnU3.isEnabled = false
            btnU5.isEnabled = false
            btnU9.isEnabled = false
        }


        val btnEq: Button
        btnEq = findViewById(R.id.btnEq)
        btnEq.setOnClickListener{
            val qpiText: EditText
            qpiText = findViewById(R.id.etQPI)
            qpiText.setText("Help")

        }


    }
}