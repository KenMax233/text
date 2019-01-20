package com.example.bilibilimyself.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bilibilimyself.bean.Animal;

import java.util.ArrayList;
import java.util.List;

public abstract class Basefragment1 extends Fragment {
    public abstract int setIdResource();
   protected List<Animal> animals= new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(setIdResource(),container,false);w= view;
        initView();
        return view;

    }
    public abstract void loadData();

    public View getview(){
        return view;
    }

}
