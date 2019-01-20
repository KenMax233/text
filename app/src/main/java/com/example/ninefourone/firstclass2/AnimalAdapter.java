package com.example.ninefourone.firstclass2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalHolder> {
    private List<Animal> animals;
    private Context context;

    public AnimalAdapter(List<Animal> animals, Context context) {
        this.animals = animals;
        this.context = context;
    }

    @NonNull
    @Override
    public AnimalHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //通过LayoutInflater类里的static方法from获取一个Inflater对象，
        // 这个对象是用来获取布局UI的，返回一个View类的对象
        View view = LayoutInflater.from(context)
                .inflate(R.layout.animal_item, parent, false);
        AnimalHolder animalHolder = new AnimalHolder(view);
        return animalHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalHolder holder, int position) {
        holder.bindView(animals.get(position));
    }

    @Override
    public int getItemCount() {
        return animals.size();
    }
}
