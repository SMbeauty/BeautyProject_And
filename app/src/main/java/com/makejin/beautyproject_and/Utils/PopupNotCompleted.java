package com.makejin.beautyproject_and.Utils;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.makejin.beautyproject_and.R;

public class PopupNotCompleted extends Activity {

    Button BT_yes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_popup_not_completed);
//
//        BT_yes = (Button) findViewById(R.id.BT_yes);

        BT_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
    }


}
