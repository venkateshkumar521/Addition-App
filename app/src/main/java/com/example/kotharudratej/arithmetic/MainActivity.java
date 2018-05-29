package com.example.kotharudratej.arithmetic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button Addition;
    private EditText ed1,ed2;
    private TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText) findViewById(R.id.et1);
        ed2=(EditText)findViewById(R.id.et2);
        t1=(TextView)findViewById(R.id.t2);
        Addition=(Button)findViewById(R.id.btAdd);
        Addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals("")||ed2.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this,"please enter some details",Toast.LENGTH_SHORT).show();
                }

                else
                {
                    int a1=Integer.parseInt(ed1.getText().toString());
                    int a2=Integer.parseInt(ed2.getText().toString());
                    int a=a1+a2;
                    t1.setText(String.valueOf("Result:"+a));
                }
            }
        });
    }
}
