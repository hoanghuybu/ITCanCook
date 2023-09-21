package com.example.itcancook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;

import com.example.itcancook.adapter.SliderAdapter;
import com.example.itcancook.helper.OnboardingButtonClickListener;

import me.relex.circleindicator.CircleIndicator3;

public class OnboardingActivity extends AppCompatActivity implements OnboardingButtonClickListener {

    ViewPager2 viewPager2;
    CircleIndicator3 indicator;

    SliderAdapter sliderAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

        viewPager2 = findViewById(R.id.slider);
        indicator = findViewById(R.id.indicator_dots);

        sliderAdapter =  new SliderAdapter(this, this);

        viewPager2.setAdapter(sliderAdapter);
        indicator.setViewPager(viewPager2);
    }

    @Override
    public void onButtonClicked() {
        int nextPage = viewPager2.getCurrentItem() + 1;
        if (nextPage < sliderAdapter.getItemCount()) {
            viewPager2.setCurrentItem(nextPage);
        } else {
            Intent intent = new Intent(OnboardingActivity.this, CreateAccountOptionsActivity.class);
            startActivity(intent);
        }
    }

    @Override
    public void onTextViewClicked() {
        Intent intent = new Intent(OnboardingActivity.this, CreateAccountOptionsActivity.class);
        startActivity(intent);
    }


}