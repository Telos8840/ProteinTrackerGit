package com.example.ProteinTracker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created with IntelliJ IDEA.
 * User: matthewroesener
 * Date: 6/22/13
 * Time: 4:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class Splash extends Activity {


    @Override
    protected void onCreate(Bundle TravisLoveBacon){

        super.onCreate(TravisLoveBacon);
        setContentView(R.layout.splash);
        Thread timer = new Thread(){

            public void run(){
                try{
                    sleep(5000);
                }  catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    //Intent openStartingPoint = new Intent("com.example.ProteinTracker.MyActivity");
                    //startActivity(openStartingPoint);
                    startActivity(new Intent(Splash.this, MyActivity.class));
                    finish();
                }
            }

        };
        timer.start();
    }



}
