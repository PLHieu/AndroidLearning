package com.example.logingformusingfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.telecom.Call;

public class MainActivity extends AppCompatActivity implements CallBackFragment {

    Fragment _fragment;
    FragmentManager _fragmentManager;
    FragmentTransaction _fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addFragment();
    }

    private void addFragment() {
        LoginFragment fragmentLogin = new LoginFragment();
        fragmentLogin.setCallBackFragment(this);

        _fragment = new LoginFragment();
        _fragmentManager = getSupportFragmentManager();
        _fragmentTransaction = _fragmentManager.beginTransaction();
        _fragmentTransaction.add(R.id.id_fragment_container, _fragment);
        _fragmentTransaction.commit();
    }

    public void replaceFragment(){
        _fragment = new RegisterFragment();
        _fragmentManager = getSupportFragmentManager();
        _fragmentTransaction = _fragmentManager.beginTransaction();
        _fragmentTransaction.addToBackStack(null);
        _fragmentTransaction.replace(R.id.id_fragment_container, _fragment);
        _fragmentTransaction.commit();
    }

    @Override
    public void changFragment() {

    }
}