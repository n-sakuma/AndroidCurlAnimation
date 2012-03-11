package com.everyleaf.animation;

import com.everyleaf.animation.R;

import android.os.Bundle;
import android.app.Activity;

public class SampleAnimationActivity extends Activity {

      @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            this.setContentView(R.layout.main);
        }

        @Override
        public void onDestroy(){
            super.onDestroy();
            System.gc();
            finish();
        }
}