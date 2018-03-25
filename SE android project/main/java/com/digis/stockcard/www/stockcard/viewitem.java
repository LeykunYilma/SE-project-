package com.digis.stockcard.www.stockcard;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class viewitem extends AppCompatActivity {



        private Button viewButton;
        private TextView item1,item2,item3,item4,item5,item6;

        private Context thisContext = this;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.viewitem);


            viewButton = (Button) findViewById(R.id.viewbutton);
            item1 = (TextView) findViewById(R.id.item1);
            item2 = (TextView) findViewById(R.id.item2);
            item3 = (TextView) findViewById(R.id.item3);
            item4 = (TextView) findViewById(R.id.item4);
            item5 = (TextView) findViewById(R.id.item5);
            item6 = (TextView) findViewById(R.id.item6);


            viewButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                 ArrayList<String> names =  array.ViewItemName();
                    ArrayList<String> amounts = array.ViewItemAmount();
                    Toast.makeText(thisContext,"this is: "+ amounts, Toast.LENGTH_LONG).show();




                    item1.setText("Product Name: "+(names.get(0).toUpperCase()) + " Item Amount: " +amounts.get(0));
                    item2.setText("Product Name: "+names.get(1)+ " Item Amount: " +amounts.get(1));
                    item3.setText("Product Name: "+names.get(2)+ " Item Amount: "  +amounts.get(2));
                    item4.setText("Product Name: "+names.get(3)+  " Item Amount: "  +amounts.get(3));
                    item5.setText("Product Name: "+names.get(4)+ " Item Amount: " +amounts.get(4));
                    item6.setText("Product Name: "+names.get(5)+  " Item Amount: "  +amounts.get(5));
             }
       });

        } }

