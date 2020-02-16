package com.dr.demo.componentapp.jni;

/**
 * 项目名称：ComponentApp
 * 类描述：
 * 创建人：yuliyan
 * 创建时间：2020/2/16 2:33 PM
 * 修改人：yuliyan
 * 修改时间：2020/2/16 2:33 PM
 * 修改备注：
 */
public class TestJNIManager implements JNIManager {
    
    JNILogMessageCall messageCall;
    
    static {
        System.loadLibrary("demo01-lib");
    }
    
    @Override
    public void setJNILogMessageCall(JNILogMessageCall messageCall) {
        this.messageCall = messageCall;
    }
    
    public native String stringFromJNI();
    
    
    void setLogMessage(String message) {
        if (messageCall != null) {
            messageCall.logMessage(message);
        }
    }
}
