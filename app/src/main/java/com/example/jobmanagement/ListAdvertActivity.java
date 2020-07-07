package com.example.jobmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.jobmanagement.app_utilities.CardViewButtonClickListener;

public class ListAdvertActivity extends AppCompatActivity implements CardViewButtonClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_advert);
    }

    @Override
    public void onEditAdvertClick() {

    }

    @Override
    public void onViewAdvertClick() {

    }

    @Override
    public void onDeleteAdvertClick() {

    }

    @Override
    public void onJobApplicationClick() {

    }
}