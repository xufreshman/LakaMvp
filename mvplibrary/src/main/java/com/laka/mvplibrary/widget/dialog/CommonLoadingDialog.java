package com.laka.mvplibrary.widget.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.laka.mvplibrary.R;

/**
 * Created by summer on 2018/11/22.
 */

public class CommonLoadingDialog extends BaseDialog {

    private TextView mTvMessage;
    private String mMessage = "努力加载中...";

    public CommonLoadingDialog(Context context) {
        super(context);
    }

    public CommonLoadingDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    public CommonLoadingDialog(Context context, int themeResId) {
        super(context, themeResId);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setCanceledOnTouchOutside(false);
        mTvMessage.setText(mMessage);
    }

    @Override
    protected void initView() {
        mTvMessage = findViewById(R.id.tv_message);
    }

    @Override
    protected void initEvent() {

    }

    @Override
    protected void initData() {

    }

    public void setMessage(String message) {
        mMessage = message;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.dialog_common_loading;
    }

}
