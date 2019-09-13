package com.example.javakethua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText edName;
    private EditText edGender;
    private EditText edDateBird;
    private EditText edAddress;
    private Button btnThem;
    private TextView tvName;
    private TextView tvGender;
    private TextView tvDate;
    private TextView tvAddress;

     String name;
    String gender;
    String date_bird;
    String address;

    List<Person> personList;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        inputInfo();
        showInfo();




    }

    private void initView() {
        edName = (EditText) findViewById(R.id.ed_name);
        edGender = (EditText) findViewById(R.id.ed_gender);
        edDateBird = (EditText) findViewById(R.id.ed_date_bird);
        edAddress = (EditText) findViewById(R.id.ed_address);
      personList = new ArrayList<>();

        btnThem = (Button) findViewById(R.id.btn_them);

        tvName = (TextView) findViewById(R.id.tv_name);
        tvGender = (TextView) findViewById(R.id.tv_gender);
        tvDate = (TextView) findViewById(R.id.tv_date);
        tvAddress = (TextView) findViewById(R.id.tv_address);

    }


    private void inputInfo() {
        name = edName.getText().toString();
        gender = edGender.getText().toString();
        date_bird = edDateBird.getText().toString();
        address = edAddress.getText().toString();
        personList.add(new Person(name,gender,date_bird,address));

    }



    private void showInfo() {
        tvName.setText(personList.get(0).getName());
        tvGender.setText(personList.get(0).getGender());
        tvDate.setText(personList.get(0).getDate_bird());
        tvAddress.setText(personList.get(0).getAddress());
    }

    public void btn_click(View view) {
        inputInfo();
    }
}
