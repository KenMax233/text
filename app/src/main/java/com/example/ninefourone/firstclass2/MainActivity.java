package com.example.ninefourone.firstclass2;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button resetButton;
    private ImageView imageView;
    private final String TAG = "MainActivity";
    private TextView textView;
    private int clickCount = 0;

    private Button jumpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        resetButton = findViewById(R.id.reset_button);
        imageView = findViewById(R.id.imageview);
        textView = findViewById(R.id.text_view);
        jumpButton = findViewById(R.id.jump_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickCount++;
                if (clickCount <= 2) {
                    changeUi();
                }
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickCount = 0;
                changeUi();
            }
        });

        jumpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,
                        BilibiliActivity.class);
                startActivity(intent);
            }
        });
    }

    private void changeUi() {
        int image = ConstantUtils.images[clickCount];
        String title = ConstantUtils.titles[clickCount];
        imageView.setImageResource(image);
        textView.setText(title);
    }
}
