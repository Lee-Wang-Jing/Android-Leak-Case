package com.wangjing.androidleakcase.case1;

import android.app.Activity;
import android.app.ProgressDialog;

/**
 * Created by wangjing on 2017/4/25.
 */

public class Case1UtilsSolve {

    private static Case1UtilsSolve instance;
    private ProgressDialog progressDialog;
    private Activity activity;


    public static Case1UtilsSolve getInstance() {
        if (instance == null) {
            instance = new Case1UtilsSolve();
        }
        return instance;
    }


    public void showDialog(Activity activity) {
        this.activity = activity;
        if (progressDialog == null) {
            progressDialog = new ProgressDialog(activity);
            progressDialog.setMessage("正在处理,请稍候");
        }
        progressDialog.show();
    }

    public void disMissDialog() {
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        progressDialog = null;
        activity.finish();
        activity = null;
    }
}
