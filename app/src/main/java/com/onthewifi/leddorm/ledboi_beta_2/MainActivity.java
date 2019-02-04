//Working Project//
///////////////////
///////////////////
//////////////////

package com.onthewifi.leddorm.ledboi_beta_2;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.onthewifi.leddorm.ledboi_beta_2.R;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner ;



    //DEFINE TEXT VIEW

    TextView PresetTextView ;

    //make string Arrary

    String ColorsPresets[] = {"Full Rainbow","Unblended Rainbow","Blended Rainbow","Full ISU Colors","Random Colors","Aqua and Yellow","Clouds","Chilled ISU Colors","Spooktober", "OFF"};



    //defins array adapter of string type

    ArrayAdapter<String> adapter;

    //define string variable for record

    String record= "";

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        spinner = (Spinner)findViewById(R.id.spinner1);

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ColorsPresets);

        PresetTextView = (TextView)findViewById(R.id.PresetTextView);

        //set adapter to spinner

        spinner.setAdapter(adapter);

        //set spinner method

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                //Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + " selected", Toast.LENGTH_LONG).show();

                switch (position)
                {
                    case 0:
                        record = "1";
                        break;
                    case 1:
                        record = "2";
                        break;
                    case 2:
                        record = "3";
                        break;
                    case 3:
                        record = "4";
                        break;
                    case 4:
                        record = "5";
                        break;
                    case 5:
                        record = "6";
                        break;
                    case 6:
                        record = "7";
                        break;
                    case 7:
                        record = "8";
                        break;
                    case 8:
                        record = "9";
                        break;
                    case 9:
                        record = "10";
                        break;


                }

                PresetTextView.setTextSize(5);
                PresetTextView.setText(record);
                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + " selected "+"and Yote Across The Network!", Toast.LENGTH_LONG).show();
                DataSender dataSender = new DataSender();
                dataSender.execute(PresetTextView.getText().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });
    }




      /*  public void throwData (View v)
        {
            PresetTextView.setTextSize(5);
            PresetTextView.setText(record);
            Toast.makeText(getBaseContext(), "Data Was Yote Across The Network!", Toast.LENGTH_LONG).show();
            DataSender dataSender = new DataSender();
            dataSender.execute(PresetTextView.getText().toString());


        }*/








}

















