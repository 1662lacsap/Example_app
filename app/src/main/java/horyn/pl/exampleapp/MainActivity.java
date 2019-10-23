package horyn.pl.exampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction (View view) {

        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);


        Log.i("Info", "Zamierzam nacisnąć przycisk!");
        Log.i("Values", nameEditText.getText().toString());

        Toast.makeText(this, "Czesc!  "+nameEditText.getText().toString(), Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
