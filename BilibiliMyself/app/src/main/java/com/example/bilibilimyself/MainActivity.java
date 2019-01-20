package com.example.bilibilimyself;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.bilibilimyself.base.Basefragment1;
import com.example.bilibilimyself.bean.fragments.AnimalFragment;
import com.example.bilibilimyself.bean.fragments.CartoonFragment;
import com.example.bilibilimyself.bean.fragments.DishFrament;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager= getSupportFragmentManager();
    private Basefragment1[] basefragment1s= {new AnimalFragment(),new CartoonFragment(),new DishFrament()};
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    changeFragment(0);
                    return true;
                case R.id.navigation_dashboard:
                    changeFragment(1);
                    return true;
                case R.id.navigation_notifications:
                    changeFragment(2);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        initFragment();
    }

    /**
     * 初始化fragment
     */
    private void initFragment(){
        for(int i = 0 ; i<3 ;i++)
        fragmentManager.beginTransaction().add(R.id.container,basefragment1s[i]);
    }

    private void changeFragment(int position){
        fragmentManager.beginTransaction().replace(R.id.container,basefragment1s[position]);
    }
}
