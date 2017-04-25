package com.wangjing.androidleakcase.case1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.wangjing.androidleakcase.R;

/**
 * Created by Administrator on 2017/4/25.
 */

public class CaseUtilsDialogActivity extends AppCompatActivity {

    private Button btn_start,btn_start2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caseutilsdialog);
        initViews();
        initListeners();
    }


    private void initViews() {
        btn_start = (Button) findViewById(R.id.btn_start);
        btn_start2= (Button) findViewById(R.id.btn_start2);
    }

    private void initListeners() {
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Case1Utils.getInstance().showDialog(CaseUtilsDialogActivity.this);
                btn_start.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Case1Utils.getInstance().disMissDialog();
                    }
                },3000);
            }
        });
        btn_start2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Case1UtilsSolve.getInstance().showDialog(CaseUtilsDialogActivity.this);
                btn_start2.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Case1UtilsSolve.getInstance().disMissDialog();
                    }
                },3000);
            }
        });
    }
}
