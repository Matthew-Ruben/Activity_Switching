package edu.sjsu.matthew.myapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // 1. get the handle to the intent which created this activity
        Intent intent = getIntent();

        // 2. Extract the string message from the intent
        String msg = intent.getStringExtra(FirstActivity.EXTRA_MESSAGE);

        // 3. Reference to the TextView item using its ID textView (in activity_second.xml)
        TextView tx2 = (TextView) findViewById(R.id.textView2);

        // 4. Put the string message on the TextView item
        tx2.setText(msg);

        Toast.makeText(this, "Second: OnCreate()", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Second: OnStart()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Second: OnStop()", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Second: OnResume()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Second: OnPause()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Second: OnRestart()", Toast.LENGTH_SHORT).show();
    }
}
