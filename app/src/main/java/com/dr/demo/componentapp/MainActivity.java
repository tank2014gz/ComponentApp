package com.dr.demo.componentapp;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.dr.demo.componentapp.jni.BaseActivity;
import com.dr.demo.componentapp.jni.JNIManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {
    
    
    @Override
    protected JNIManager getJNIManager() {
        return null;
    }
    
    
    @Override
    public void initView() {
        ListView listView = findViewById(R.id.listView);
        
        List<String> titles = new ArrayList<>();
        titles.add("1 项目初始化案例 NDK模板");
        
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, titles));
        
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0: {
                        startActivity(new Intent(MainActivity.this, Demo01Activity.class));
                        break;
                    }
                }
            }
        });
    }
    
    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }
    
    
}
