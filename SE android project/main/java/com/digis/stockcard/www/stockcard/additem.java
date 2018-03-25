package com.digis.stockcard.www.stockcard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class additem extends AppCompatActivity {
    private EditText itemName , itemCode, cashRegister,itemDescription,itemAmount;
    private Button addButton;

    private Context thisContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additem);

        itemName = (EditText) findViewById(R.id.itemname);
        itemCode = (EditText) findViewById(R.id.itemcode);
        cashRegister = (EditText) findViewById(R.id.cashregistercode);
        itemDescription = (EditText) findViewById(R.id.itemdescription);
        itemAmount = (EditText) findViewById(R.id.itemamount);
        addButton = (Button) findViewById(R.id.addbutton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
    }
}



