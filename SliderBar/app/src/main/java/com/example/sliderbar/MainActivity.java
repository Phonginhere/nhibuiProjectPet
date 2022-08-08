    package com.example.sliderbar;

    import android.os.Bundle;

    import androidx.appcompat.app.AppCompatActivity;

    import com.google.android.material.slider.Slider;


    public class MainActivity extends AppCompatActivity {
    Slider slider ;
        int[] images = {R.drawable.one,
                R.drawable.two,
                R.drawable.three,
                R.drawable.four};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        slider = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        slider.setSliderAdapter(sliderAdapter);
        slider.setIndicatorAnimation(IndicatorAnimationType.WORM);
        slider.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        slider.startAutoCycle();
    }
}