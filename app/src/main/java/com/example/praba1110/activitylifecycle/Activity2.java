package com.example.praba1110.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class Activity2 extends AppCompatActivity {

    String tag2="Activity2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(tag2, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }
    @Override
    protected void onStart() {
        Log.d(tag2, "onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(tag2,"onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(tag2,"onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(tag2,"onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(tag2,"onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d(tag2, "onRestart");
        super.onRestart();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
