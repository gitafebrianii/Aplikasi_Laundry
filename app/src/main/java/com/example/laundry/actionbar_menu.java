package com.example.laundry;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class actionbar_menu extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_actionbar_menu, container, false);
    }
//
//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//        Button btnLogin = view.findViewById(R.id.btn_login);
//        btnLogin.setOnClickListener(this);
//    }
//
//
//    @Override
//    public void onClick(View view) {
//        if(view.getId() == R.id.btn_login) {
//
//            Intent i = new Intent(getActivity(), actionbar_menu.class);
//            startActivity(i);
//            ((Activity) getActivity()).overridePendingTransition(0, 0);
//        }
//    }
}