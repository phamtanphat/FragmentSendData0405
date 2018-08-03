package com.ptp.phamtanphat.fragmentsenddata0405;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager = getSupportFragmentManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentAndroid fragmentAndroid = new FragmentAndroid();


        //Tao ra bundle
        Bundle bundle = new Bundle();
        bundle.putString("chuoi","Chao Fragment Android");
        bundle.putInt("number",30);

        fragmentAndroid.setArguments(bundle);
        fragmentTransaction.replace(R.id.relativeMain,fragmentAndroid);
        fragmentTransaction.commit();
    }
}
