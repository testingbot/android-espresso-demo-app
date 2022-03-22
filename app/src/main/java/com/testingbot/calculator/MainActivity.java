package com.testingbot.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {
    private String outputText = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setListeners();
    }

    private void updateView() {
        TextView output = (TextView) findViewById(R.id.output);
        output.setText(this.outputText);
    }

    private void setListeners() {
        Button button1 = (Button) findViewById(R.id.but1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputText += "1";
                updateView();
            }
        });
        Button button2 = (Button) findViewById(R.id.but2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputText += "2";
                updateView();
            }
        });
        Button button3 = (Button) findViewById(R.id.but3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputText += "3";
                updateView();
            }
        });
        Button button4 = (Button) findViewById(R.id.but4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputText += "4";
                updateView();
            }
        });
        Button button5 = (Button) findViewById(R.id.but5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputText += "5";
                updateView();
            }
        });
        Button button6 = (Button) findViewById(R.id.but6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputText += "6";
                updateView();
            }
        });
        Button button7 = (Button) findViewById(R.id.but7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputText += "7";
                updateView();
            }
        });
        Button button8 = (Button) findViewById(R.id.but8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputText += "8";
                updateView();
            }
        });
        Button button9 = (Button) findViewById(R.id.but9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputText += "9";
                updateView();
            }
        });
        Button button0 = (Button) findViewById(R.id.but0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputText += "0";
                updateView();
            }
        });

        Button buttonClear = (Button) findViewById(R.id.butclear);
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputText = "";
                updateView();
            }
        });
        Button buttonAdd = (Button) findViewById(R.id.butplus);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputText += "+";
                updateView();
            }
        });
        Button buttonSub = (Button) findViewById(R.id.butsub);
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputText += "-";
                updateView();
            }
        });
        Button buttonDiv = (Button) findViewById(R.id.butdiv);
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputText += "/";
                updateView();
            }
        });
        Button buttonMultiply = (Button) findViewById(R.id.butmul);
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputText += "*";
                updateView();
            }
        });
        Button buttonDot = (Button) findViewById(R.id.butdot);
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputText += ".";
                updateView();
            }
        });
        Button buttonEquals = (Button) findViewById(R.id.buteq);
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Expression expression = new ExpressionBuilder(outputText).build();
                double result = expression.evaluate();
                outputText = Double.toString(result);
                updateView();
            }
        });
    }
}