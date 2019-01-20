package com.example.ninefourone.firstclass2;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimalHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    private TextView textView;

    public AnimalHolder(View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.animal_item_image_view);
        textView = itemView.findViewById(R.id.animal_item_text_view);
    }

    public void bindView(Animal animal) {
        imageView.setImageResource(animal.getImage());
        textView.setText(animal.getText());
    }
}
