package com.example.listview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Dialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        Button buttonDialog = findViewById(R.id.butonDialog);
        TextView textDialog = findViewById(R.id.textDialog);

        buttonDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Dialog.this);


                builder.setTitle("Diálogo de ejemplo").setMessage("Presiona OK o Cancelar");

                builder.setPositiveButton("OK", (dialog, which) -> {
                    textDialog.setText("Presionaste OK");
                });

                builder.setNegativeButton("Cancelar", (dialog, which) -> {
                    textDialog.setText("Presionaste Cancelar");
                });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });
    }
}