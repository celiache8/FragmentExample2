package com.example.fragmentexample2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity{


    private ImageView imageView_villager;
    private ImageView imageView_house;
    private Button button_rate;

    private static final String villager_url = "https://dodo.ac/np/images/thumb/2/26/Henry_NH.png/300px-Henry_NH.png";
    private static final String house_url = "https://animalcrossingworld.com/wp-content/uploads/2020/05/animal-crossing-new-horizons-guide-villager-house-exterior-henry-trim.png";

    private TextView textView_rating;
    private TextView textView_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView_villager = findViewById(R.id.imageView_villager);
        imageView_house = findViewById(R.id.imageView_house);

        Picasso.get().load(villager_url).into(imageView_villager);
        Picasso.get().load(house_url).into(imageView_house);

        button_rate = findViewById(R.id.button_rate);

        textView_rating = findViewById(R.id.textView_rating);
        textView_name = findViewById(R.id.textView_name);
        textView_name.setText("Henry (Smug)");
    }

}