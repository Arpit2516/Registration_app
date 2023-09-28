package com.example.firstapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.firstapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = binding.enterName.getText().toString();
                Log.d("MainActivity",name);
                String mobile = binding.enterMobile.getText().toString();
                Log.d("MainActivity",mobile);
                String email = binding.enterEmail.getText().toString();
                Log.d("MainActivity",email);


                if (binding.javaCheck.isChecked()){

                    String java = binding.javaCheck.getText().toString();
                    Log.d("MainActivity",java);

                }

                if (binding.androidCheck.isChecked()){

                    String android = binding.androidCheck.getText().toString();
                    Log.d("MainActivity",android);

                }


                Log.d("MainActivity","Hey you have clicked me !");


                Toast.makeText(MainActivity.this, "not right", Toast.LENGTH_LONG).show();
            }
        });


    }
}