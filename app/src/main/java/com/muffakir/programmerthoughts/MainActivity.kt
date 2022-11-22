package com.muffakir.programmerthoughts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import com.muffakir.programmerthoughts.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val name =  arrayListOf("Any fool can write code that a computer can understand. Good programmers write code that humans can understand"
            ,"First, solve the problem. Then, write the code", "Experience is the name everyone gives to their mistakes.",
            " In order to be irreplaceable, one must always be different",
            "Java is to JavaScript what car is to Carpet.",
            "Knowledge is power.",
            "Sometimes it pays to stay in bed on Monday, rather than spending the rest of the week debugging Monday’s code.",
            "Perfection is achieved not when there is nothing more to add, but rather when there is nothing more to take away.",
            "Ruby is rubbish! PHP is phpantastic!",
            " Code is like humor. When you have to explain it, it’s bad.",
            "Fix the cause, not the symptom.",
            "Optimism is an occupational hazard of programming: feedback is the treatment.  ",
            "When to use iterative development? You should use iterative development only on projects that you want to succeed.",
            "Simplicity is the soul of efficiency.")



        binding.srlQuotes.setOnRefreshListener{
           binding.idQuote.text =  name[Random.nextInt(name.count())]
            binding.srlQuotes.isRefreshing = false
        }



        binding.buttonshare.setOnClickListener{
            var quotes = binding.idQuote.text
            val name = "$quotes \n Shared Using Muffakir's App!"
            val intent =Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT,name)
            val chooses = Intent.createChooser(intent,"Share Using !!!")
            startActivity(chooses)
        }
        binding.information.setOnClickListener{
            val intent = Intent(this@MainActivity , InformationActivity::class.java)
            startActivity(intent)
        }
        binding.shareview.setOnClickListener{
            var text = "App developed By Muffakir Ibn Hamid \n ig/muffakiribnhamid"
            val intent  = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT,text)
            val chooses  = Intent.createChooser(intent,"Share Using!!!!")
            startActivity(chooses)
        }





    }
    }


