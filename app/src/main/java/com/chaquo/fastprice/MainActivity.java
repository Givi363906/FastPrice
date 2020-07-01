package com.chaquo.fastprice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;

public class MainActivity extends AppCompatActivity {

    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.testing);

        if (! Python.isStarted())
            Python.start(new AndroidPlatform(this));
/*
        Python py = Python.getInstance();

        PyObject py_file = py.getModule("Test"); //name file

        PyObject obj = py_file.callAttr("test"); // def name

        txt.setText(obj.toString());

 */


    }
}
