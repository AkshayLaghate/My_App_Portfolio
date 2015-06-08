package com.nano.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button bSpotify,bScores,bLibrary,bBuild,bXYZ,bCapstone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bSpotify = (Button) findViewById(R.id.bSpotify);
        bScores = (Button) findViewById(R.id.bScores);
        bLibrary = (Button) findViewById(R.id.bLibrary);
        bBuild = (Button) findViewById(R.id.bBuilditBigger);
        bXYZ = (Button) findViewById(R.id.bXYZ);
        bCapstone = (Button) findViewById(R.id.bCapstone);

        bSpotify.setOnClickListener(this);
        bScores.setOnClickListener(this);
        bLibrary.setOnClickListener(this);
        bBuild.setOnClickListener(this);
        bXYZ.setOnClickListener(this);
        bCapstone.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.bSpotify:
                Toast.makeText(this,"This button will launch my Spotify Streamer app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bScores:
                Toast.makeText(this,"This button will launch my Scores app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bLibrary:
                Toast.makeText(this,"This button will launch my Library app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bBuilditBigger:
                Toast.makeText(this,"This button will launch my Build it Bigger app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bXYZ:
                Toast.makeText(this,"This button will launch my XYZ Reader app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bCapstone:
                Toast.makeText(this,"This button will launch my Capstone app!",Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }


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
            Toast.makeText(this,"This does nothing! yet",Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
