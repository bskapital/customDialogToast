package com.app.fast.myapplication;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class CustomDialogClass extends Dialog implements
        android.view.View.OnClickListener {

    public Activity c;
    public Dialog d;
    private Button ok;

    public CustomDialogClass(Activity activity) {
        super(activity);
        // TODO Auto-generated constructor stub
        this.c = activity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_dialog);

        ok = findViewById(R.id.btn_ok);
        ok.setOnClickListener(this);

        this.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

    }



    @Override
    public void onClick(View v) {
        int i = v.getId();

            if (i == R.id.btn_ok) {
                dismiss();
            }

        }
    }