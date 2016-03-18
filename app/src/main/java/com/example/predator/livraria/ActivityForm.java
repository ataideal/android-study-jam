package com.example.predator.livraria;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.LruCache;
import android.view.View;
import android.widget.EditText;

public class ActivityForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_form);

    }


    public void confirmButton(View v){
        EditText titulo = (EditText)findViewById(R.id.editTitle);
        EditText autor = (EditText)findViewById(R.id.editAuthor);
        EditText data = (EditText)findViewById(R.id.editDate);

        Intent resultIntent = new Intent();
        resultIntent.putExtra("Title",  titulo.getText().toString());
        resultIntent.putExtra("Author",   autor.getText().toString());
        resultIntent.putExtra("Data",  data.getText().toString());
        setResult(RESULT_OK, resultIntent);
        finish();
    }
}
