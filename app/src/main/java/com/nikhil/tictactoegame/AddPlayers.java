package com.nikhil.tictactoegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddPlayers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_players);
        final EditText playerOne = findViewById(R.id.PlayerOneName);
        final EditText playerTwo = findViewById(R.id.PlayerTwoName);
        final Button startButton = findViewById(R.id.StartButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String getPlayerNameOne = playerOne.getText().toString();
                final String getPlayerNameTwo = playerTwo.getText().toString();
                if(getPlayerNameOne.isEmpty()||getPlayerNameTwo.isEmpty()){
                    Toast.makeText(AddPlayers.this,"Please enter your names",Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent =new Intent(AddPlayers.this,MainActivity.class);
                    intent.putExtra("Player One",getPlayerNameOne);
                    intent.putExtra("Player Two",getPlayerNameTwo);
                    startActivity(intent);
                }
            }
        });
    }
}