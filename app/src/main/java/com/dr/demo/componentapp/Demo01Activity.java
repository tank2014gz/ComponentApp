package com.dr.demo.componentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.dr.demo.componentapp.jni.BaseActivity;
import com.dr.demo.componentapp.jni.JNIManager;
import com.dr.demo.componentapp.jni.TestJNIManager;

public class Demo01Activity extends BaseActivity {
    
    
    @Override
    protected JNIManager getJNIManager() {
        return new TestJNIManager();
    }
    
    @Override
    public void initView() {
        // Example of a call to a native method
        TextView tv = findViewById(R.id.sample_text);
        tv.setText(((TestJNIManager) jniManager).stringFromJNI());
        
    }
    
    @Override
    public int getLayoutId() {
        return R.layout.activity_demo01;
    }
}
