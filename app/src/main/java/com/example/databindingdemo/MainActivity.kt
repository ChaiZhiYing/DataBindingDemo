package com.example.databindingdemo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var aPerson = Person("ali", "123321", "ali@gmail.com", "12, Jalan 123")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.personData = aPerson

        binding.btnUpdate.setOnClickListener(){
            aPerson.email = "xxxx@gmail.com"

            binding.apply { invalidateAll() }
        }

        //binding.tvName.text = aPerson.name
        //binding.tvIC.text = aPerson.IC
        //binding.tvEmail.text = aPerson.email
        //binding.tvAddress.text = aPerson.address




       // val tv:TextView = findViewById(R.id.tvName)
    }
}