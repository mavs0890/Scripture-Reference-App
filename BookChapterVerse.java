package com.example.marlonvilorio.androidscripturereference;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class BookChapterVerse extends ActionBarActivity {


    EditText favBook;
    EditText favChapter;
    EditText favVerse;



    public void buttonOnClick(View v) {
        Button button = (Button)v;
        favBook = (EditText) findViewById(R.id.favBook);
        favChapter = (EditText) findViewById(R.id.favChapter);
        favVerse = (EditText) findViewById(R.id.favVerse);
        String favBook1 = favBook.getText().toString();
        String favChapter1 = favChapter.getText().toString();
        String favVerse1 = favVerse.getText().toString();
        String message = ("Your Favorite Scripture is " + favBook1 + " "
        + favChapter1 + " : " + favVerse1);


        Intent intent = new Intent(BookChapterVerse.this,DisplayFavoriteScripture.class);

        intent.putExtra("FAVBOOK",message);

        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_chapter_verse);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_book_chapter_verse, menu);
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
