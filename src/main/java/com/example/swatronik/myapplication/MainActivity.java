package com.example.swatronik.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener {

    TextView Num1;
    TextView Num2;
    TextView Operation;

    Button btnAdd;
    Button btnSub;
    Button btnMul;
    Button btnDiv;
    Button btnRes;
    Button btnSgn;
    Button btnDot;
    Button btnC;
    Button btnCE;
    Button btnDel;
    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;



    /** Called when the activity is first created. */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newscreen);

        Num1 = findViewById(R.id.Num1);
        Num2 = findViewById(R.id.Num2);
        Operation = findViewById(R.id.Operation);

        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnRes = findViewById(R.id.btnRes);
        btnSgn = findViewById(R.id.btnSgn);
        btnDot = findViewById(R.id.btnDot);
        btnDel = findViewById(R.id.btnDel);
        btnCE  = findViewById(R.id.btnCE);
        btnC   = findViewById(R.id.btnC);
        btn0   = findViewById(R.id.btn0);
        btn1   = findViewById(R.id.btn1);
        btn2   = findViewById(R.id.btn2);
        btn3   = findViewById(R.id.btn3);
        btn4   = findViewById(R.id.btn4);
        btn5   = findViewById(R.id.btn5);
        btn6   = findViewById(R.id.btn6);
        btn7   = findViewById(R.id.btn7);
        btn8   = findViewById(R.id.btn8);
        btn9   = findViewById(R.id.btn9);

        btnRes.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnDot.setOnClickListener(this);
        btnSgn.setOnClickListener(this);
        btnDel.setOnClickListener(this);
        btnCE.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);


        Num1.setText("0");
    }
    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        double num1;
        double num2;
        int oper = 0;
        String str = Num1.getText().toString();

        if ("+" == Operation.getText().toString())oper=1;
        else if ("-" == Operation.getText().toString())oper=2;
        else if ("*" == Operation.getText().toString())oper=3;
        else if ("/" == Operation.getText().toString())oper=4;

        if ("Error" == Num2.getText().toString()){
            Num1.setText("0");
            Num2.setText("");
            Operation.setText("");
        }

        num1 = Float.parseFloat(str);

        switch (v.getId()) {
            case R.id.btnAdd:
                if (str.charAt(str.length()-1)=='.'){str = str.substring(0,str.length()-1); Num1.setText(str);}
                if ("" == Num2.getText().toString()){ Num2.setText(str); Num1.setText("0");}
                else {num2 = Float.parseFloat(Num2.getText().toString());
                    if (1 == oper)num2+=num1;
                    else if (2 == oper)num2-=num1;
                    else if (3 == oper)num2*=num1;
                    else if (0 == num1){Num2.setText("Error");break;}
                    else num2/=num1;
                    Num2.setText(String.valueOf(num2));
                    Num1.setText("0");
                }
                Operation.setText("+");
                break;
            case R.id.btnSub:
                if (str.charAt(str.length()-1)=='.'){str = str.substring(0,str.length()-1); Num1.setText(str);}
                if ("" == Num2.getText().toString()){ Num2.setText(str); Num1.setText("0");}
                else {num2 = Float.parseFloat(Num2.getText().toString());
                    if (oper==1)num2+=num1;
                    else if (oper==2)num2-=num1;
                    else if (oper==3)num2*=num1;
                    else if (num1==0){Num2.setText("Error");break;}
                    else num2/=num1;
                    Num2.setText(String.valueOf(num2));
                    Num1.setText("0");
                }
                Operation.setText("-");
                break;
            case R.id.btnMul:
                if (str.charAt(str.length()-1)=='.'){str = str.substring(0,str.length()-1); Num1.setText(str);}
                if ("" == Num2.getText().toString()){ Num2.setText(str); Num1.setText("0");}
                else {num2 = Float.parseFloat(Num2.getText().toString());
                    if (1 == oper)num2+=num1;
                    else if (2 == oper)num2-=num1;
                    else if (3 == oper)num2*=num1;
                    else if (0 == num1){Num2.setText("Error");break;}
                    else num2/=num1;
                    Num2.setText(String.valueOf(num2));
                    Num1.setText("0");
                }
                Operation.setText("*");
                break;
            case R.id.btnDiv:
                if (str.charAt(str.length()-1)=='.'){str = str.substring(0,str.length()-1); Num1.setText(str);}
                if ("" == Num2.getText().toString()){ Num2.setText(str); Num1.setText("0");}
                else {num2 = Float.parseFloat(Num2.getText().toString());
                    if (1 == oper)num2+=num1;
                    else if (2 == oper)num2-=num1;
                    else if (3 == oper)num2*=num1;
                    else if (0 == num1){Num2.setText("Error");break;}
                    else num2/=num1;
                    Num2.setText(String.valueOf(num2));
                    Num1.setText("0");
                }
                Operation.setText("/");
                break;
            case R.id.btnRes:
                if (str.charAt(str.length()-1)=='.'){str = str.substring(0,str.length()-1); Num1.setText(str);}
                if (!("" == Num2.getText().toString())){
                    num2 = Float.parseFloat(Num2.getText().toString());
                    if (1 == oper)num2+=num1;
                    else if (2 == oper)num2-=num1;
                    else if (3 == oper)num2*=num1;
                    else if (0 == num1){Num2.setText("Error");break;}
                    else num2/=num1;
                    Num1.setText(String.valueOf(num2));
                    Num2.setText("");
                    Operation.setText("");
                }
                break;
            case R.id.btnC:
                Num1.setText("0");
                Num2.setText("");
                Operation.setText("");
                break;
            case R.id.btnCE:
                Num1.setText("0");
                break;
            case R.id.btnDel:
                str = str.substring(0,str.length()-1);
                if (str=="")str="0";
                Num1.setText(str);
                break;
            case R.id.btnSgn:
                Num1.setText(String.valueOf(num1*(-1)));
                break;
            case R.id.btnDot:
                if (!(str.contains(".")))Num1.setText(str + ".");
                break;
            case R.id.btn0:
                if ("0"==str)Num1.setText("0");
                else if(str.length()<10) Num1.setText(str+"0");
                break;
            case R.id.btn1:
                if ("0"==str)Num1.setText("1");
                else if(str.length()<10) Num1.setText(str+"1");
                break;
            case R.id.btn2:
                if ("0"==str)Num1.setText("2");
                else if(str.length()<10) Num1.setText(str+"2");
                break;
            case R.id.btn3:
                if ("0"==str)Num1.setText("3");
                else if(str.length()<10) Num1.setText(str+"3");
                break;
            case R.id.btn4:
                if ("0"==str)Num1.setText("4");
                else if(str.length()<10) Num1.setText(str+"4");
                break;
            case R.id.btn5:
                if ("0"==str)Num1.setText("5");
                else if(str.length()<10) Num1.setText(str+"5");
                break;
            case R.id.btn6:
                if ("0"==str)Num1.setText("6");
                else if(str.length()<10) Num1.setText(str+"6");
                break;
            case R.id.btn7:
                if ("0"==str)Num1.setText("7");
                else if(str.length()<10) Num1.setText(str+"7");
                break;
            case R.id.btn8:
                if ("0"==str)Num1.setText("8");
                else if(str.length()<10) Num1.setText(str+"8");
                break;
            case R.id.btn9:
                if ("0"==str)Num1.setText("9");
                else if(str.length()<10) Num1.setText(str+"9");
                break;
            default:
                break;
        }

    }
}
