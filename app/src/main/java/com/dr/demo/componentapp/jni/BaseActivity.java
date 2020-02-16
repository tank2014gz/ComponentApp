package com.dr.demo.componentapp.jni;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.dr.demo.componentapp.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * 项目名称：ComponentApp
 * 类描述：
 * 创建人：yuliyan
 * 创建时间：2020/2/16 2:38 PM
 * 修改人：yuliyan
 * 修改时间：2020/2/16 2:38 PM
 * 修改备注：
 */
public abstract class BaseActivity extends AppCompatActivity implements JNILogMessageCall {
    
    protected JNIManager jniManager;
    private TextView logTextView;
    
    
    protected abstract JNIManager getJNIManager();
    
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        jniManager = getJNIManager();
        if (jniManager != null) {
            jniManager.setJNILogMessageCall(this);
        }
        logTextView = findViewById(R.id.logView);
        initView();
    }
    
    public abstract void initView();
    
    public abstract int getLayoutId();
    
    @Override
    public void logMessage(String message) {
        Log.i("ydr", message);
        if (logTextView != null) {
            logTextView.append(message);
            logTextView.append("\n");
        }
        
    }
}
