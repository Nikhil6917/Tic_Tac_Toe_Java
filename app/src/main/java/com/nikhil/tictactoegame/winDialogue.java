package com.nikhil.tictactoegame;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class winDialogue extends Dialog {
    private final String message;
    private final MainActivity mainActivity;

    public winDialogue(@NonNull Context context,String message,MainActivity mainActivity) {
        super(context);
        this.message=message;
        this.mainActivity =mainActivity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.win_dialogoe_layout);
        final TextView messageTxt = findViewById(R.id.messageText);
        final Button startAgain = findViewById(R.id.startAgainBtn);
        messageTxt.setText(message);
        startAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivity.restartMatch();
                dismiss();

            }
        });
    }
}
