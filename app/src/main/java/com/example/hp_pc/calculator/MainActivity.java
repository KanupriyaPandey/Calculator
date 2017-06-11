package com.example.hp_pc.calculator;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.hp_pc.calculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    String opr;
    final ActivityMainBinding binding1 = DataBindingUtil.setContentView(
            this, R.layout.activity_main);

    private String operand1="";
    private String operand2="";
    private String operator="";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        binding1.seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opr=binding1.seven.getText().toString();
                setTextView1OnBinding(binding1.textView1.getText(),opr);
            }
        });
        binding1.eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opr=binding1.eight.getText().toString();
                setTextView1OnBinding(binding1.textView1.getText(),opr);
            }
        });
        binding1.nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opr=binding1.nine.getText().toString();
                setTextView1OnBinding(binding1.textView1.getText(),opr);
            }
        });
        binding1.six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opr=binding1.six.getText().toString();
                setTextView1OnBinding(binding1.textView1.getText(),opr);
            }
        });
        binding1.five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opr=binding1.five.getText().toString();
                setTextView1OnBinding(binding1.textView1.getText(),opr);
            }
        });
        binding1.four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opr=binding1.four.getText().toString();
                setTextView1OnBinding(binding1.textView1.getText(),opr);
            }
        });
        binding1.three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opr=binding1.three.getText().toString();
                setTextView1OnBinding(binding1.textView1.getText(),opr);
            }
        });
        binding1.two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opr=binding1.two.getText().toString();
                setTextView1OnBinding(binding1.textView1.getText(),opr);
            }
        });
        binding1.one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opr=binding1.one.getText().toString();
                setTextView1OnBinding(binding1.textView1.getText(),opr);
            }
        });
        /*binding1.sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1=""+binding1.textView1.getText();
                operator=CalculatorOperators.MINUS;
                opr=binding1.sub.getText().toString();
                setTextView1OnBinding(binding1.textView1.getText(),opr);
            }
        });
        binding1.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1=""+binding1.textView1.getText();
                operator=CalculatorOperators.ADD;
                opr=binding1.add.getText().toString();
                setTextView1OnBinding(binding1.textView1.getText(),opr);
            }
        });
*/
    }

    //TextView return type is CharSequence

    private void setTextView1OnBinding(CharSequence text, String opr){

        if(operator.equalsIgnoreCase(CalculatorOperators.EQUAL)){
            flush();
            binding1.textView1.setText( binding1.textView2.getText());
            binding1.textView2.setText("");
        }else if(!opr.equalsIgnoreCase(operator)&&!operand1.isEmpty()&&!operator.isEmpty()){
            operand2=opr;
            String res=evaluateOperation(operand1,operand2,operator);
            setTextView2OnBinding(res);
            operand1=res;
        }else{
            String nextText=text+opr;
            binding1.textView1.setText(nextText);
        }

    }



    /**
     * reset
     */
    private void flush(){
        operand2="";
        operator="";
        operand1="";
    }

    private void setTextView2OnBinding(String result){
        binding1.textView2.setText(result);
    }
    /**
     * a generic method to evaluate the result. this should be called on every operator click
     * @return
     */
    private String evaluateOperation(String oprnd1,String opnd2,String oprtr){
        double result=0;

        switch(oprtr){
            case CalculatorOperators.ADD:
                result= Integer.parseInt(oprnd1) + Integer.parseInt(opnd2);
                break;
            case CalculatorOperators.MINUS:
                result= Integer.parseInt(oprnd1) - Integer.parseInt(opnd2);
                break;
            case CalculatorOperators.MULTIPLY:
                result= Integer.parseInt(oprnd1) * Integer.parseInt(opnd2);
                break;
            case CalculatorOperators.DIVIDE:
                result= Integer.parseInt(oprnd1) / Integer.parseInt(opnd2);
                break;
        }
        return ""+result;
    }
}
