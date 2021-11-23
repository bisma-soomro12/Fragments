package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragments.frag.fragment1;
import com.example.fragments.frag.fragment2;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.frag1);
        btn2=findViewById(R.id.frag2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFrag(new fragment1());
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFrag(new fragment2());
            }
        });
    }

   void replaceFrag(Fragment fragment){
       FragmentManager fragmentManager=getSupportFragmentManager();
       FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
       fragmentTransaction.replace(R.id.linear2,fragment);
       fragmentTransaction.commit();
    }
}