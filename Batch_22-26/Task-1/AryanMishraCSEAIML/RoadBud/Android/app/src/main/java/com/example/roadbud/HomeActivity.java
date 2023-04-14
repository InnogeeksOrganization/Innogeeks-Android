package com.example.roadbud;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.roadbud.databinding.HomeactivityBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {
    HomeactivityBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = HomeactivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        //test for permission
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(new String[] {Manifest.permission. SEND_SMS}, 1);
        }
        //test over
        replaceFragment(new Dashboard());
        binding.bottomNav.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.menu_dashboard:
                    replaceFragment(new Dashboard());
                    break;
                case R.id.menu_navigation:
                    replaceFragment(new Navigation());
                    break;
                case R.id.menu_profile:
                    replaceFragment(new Profile());
                    break;
            }


            return true;
        });
    }
    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_home,fragment);
        fragmentTransaction.commit();
    }
}