package com.example.hercules.Information;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hercules.Home.HomeActivity;
import com.example.hercules.R;

public class AboutUsActivity extends AppCompatActivity {
    TextView aboutUS;
    CardView done;

    public static final String TAG = "About_US_activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_about_us);


        aboutUS = findViewById(R.id.privacy_policy);
        aboutUS.setText(R.string.about_us);


        ImageView back;
        back = findViewById(R.id.back);
        back.setOnClickListener(view -> {
            Log.d(TAG, "onClick: back image pressed");
            onBackPressed();
            finish();
        });
        done = findViewById(R.id.done);
        done.setOnClickListener(view -> {
            Log.d(TAG, "onClick: done clicked, going to Home activity");
            startActivity(new Intent(AboutUsActivity.this, HomeActivity.class));
            finish();
        });
    }

    @Override
    public void onBackPressed() {
        Log.d(TAG, "onBackPressed: back Button pressed");
        super.onBackPressed();
        finish();
    }
}