package com.wangjing.androidleakcase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.wangjing.androidleakcase.case1.CaseUtilsDialogActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_case1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        initListeners();
    }


    private void initViews() {
        btn_case1 = (Button) findViewById(R.id.btn_case1);

    }

    private void initListeners() {
        btn_case1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_case1:
                startActivity(new Intent(this, CaseUtilsDialogActivity.class));
                break;
            default:
                break;
        }
    }
}
