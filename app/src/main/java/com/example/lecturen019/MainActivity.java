package com.example.lecturen019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.lecturen019.folder.FirstFragment;
import com.example.lecturen019.folder.SecondFragment;

public class MainActivity extends AppCompatActivity {
    Button FirstBtn,ScndBtn;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirstBtn.findViewById(R.id.FirstBtn);
        ScndBtn.findViewById(R.id.ScndBtn);
        linearLayout.findViewById(R.id.linearLayout);
        FirstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstFragment firstFragment=new FirstFragment();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout,firstFragment);
                transaction.commit();
            }
        });
        ScndBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondFragment secondFragment=new SecondFragment();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                
            }
        });

    }
}