package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {

    TextView outputs,inputs;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputs =  findViewById(R.id.inputs);
        outputs =  findViewById(R.id.outputs);
    }
    public  void onclear(View view)
    {
        inputs.setText(null);
        outputs.setText(null);

    }
    public void onpoint(View v)
    {
        inputs.setText(inputs.getText() + ".");
    }
    public void onone(View view)
    {
        inputs.setText(inputs.getText() + "1");

    }
    public void ontwo(View view)
    {
        inputs.setText(inputs.getText() + "2");

    }
    public void onthree(View view)
    {
        inputs.setText(inputs.getText() + "3");

    }
    public void onfour(View view)
    {
        inputs.setText(inputs.getText() + "4");

    }
    public void onfive(View view)
    {
        inputs.setText(inputs.getText() + "5");

    }
    public void onsix(View view)
    {
        inputs.setText(inputs.getText() + "6");

    }
    public void onseven(View view)
    {
        inputs.setText(inputs.getText() + "7");

    }
    public void oneight(View view)
    {
        inputs.setText(inputs.getText() + "8");

    }
    public void onnine(View view)
    {
        inputs.setText(inputs.getText() + "9");

    }
    public void onzero(View view)
    {
        inputs.setText(inputs.getText() + "0");

    }
    public void onadd(View view)
    {


              inputs.setText(inputs.getText()+ "+");




    }
    public void onmultiplication(View view)
    {


            inputs.setText(inputs.getText()+ "*");



    }
    public void ondivision(View view)
    {



        inputs.setText(inputs.getText()+ "/");


    }
    public void modulus(View abbishak)
    {

        inputs.setText( inputs.getText() + "%");
    }
    public void delete(View view)
    {
        String inputstring = inputs.getText().toString();
        if (inputstring.length()==0)
        {

        }
        else
        {

           String result = inputstring.substring(0, inputstring.length()-1);
           inputs.setText(result +"");
        }
    }
    public void onminus(View view)
    {

        inputs.setText(inputs.getText()+ "-");


    }
    public void onequals(View v)
    {
        String workings = inputs.getText().toString();

        ScriptEngine ingine = new ScriptEngineManager().getEngineByName("rhino");
        try {
            double result = (double)ingine.eval(workings);
            outputs.setText(result+"");
        }
        catch (ScriptException e)
        {
            Toast.makeText(getApplicationContext(),"invalid",Toast.LENGTH_SHORT).show();
        }


    }
}
