package com.example.praba1110.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    String tag1="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(tag1,"onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        Log.d(tag1,"onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(tag1,"onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(tag1,"onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(tag1,"onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(tag1,"onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d(tag1,"onRestart");
        super.onRestart();
    }

    public void newactivity(View V){
        Intent intent=new Intent(this,Activity2.class);
        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
