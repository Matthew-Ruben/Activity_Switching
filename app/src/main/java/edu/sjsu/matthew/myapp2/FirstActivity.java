package edu.sjsu.matthew.myapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "edu.sjsu.myApp2.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Toast.makeText(this, "OnCreate()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "First: OnStart()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "First: OnStop()", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "First: OnResume()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "First: OnPause()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "First: OnRestart()", Toast.LENGTH_SHORT).show();
    }


    // this method will be invoked if we click on the button
    public void sendMessage(View view) {
        // 1. Create an intent connecting the first and second activity
        Intent intent = new Intent(this, SecondActivity.class);
        // 2. retrieve a handle to the Edit Text object with the ID
        EditText editText = (EditText) findViewById(R.id.editText);
        // 3. retrieve the text of editText object and convert to string
        String msg = editText.getText().toString();
        // 4. put the string onto the Intent, it will get carried over to
        // the second screen by Android's Intent mechanism
        intent.putExtra(EXTRA_MESSAGE, msg); // "has lots of variation"
        // 5. invoke the second screen using startActivity(intent);
        startActivity(intent);


    }
}
