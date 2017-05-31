package mx.edu.cetis108.cetis1084am_app002;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    EditText txtNum1, txtNum2, txtResult;
    Button btn1,btn2,btn3,btn4;
    TextView TVnum1,TVnum2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNum1=(EditText)findViewById(R.id.txtNum1);
        txtNum2=(EditText)findViewById(R.id.txtNum2);
        txtResult=(EditText)findViewById(R.id.txtResult);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        TVnum1=(TextView)findViewById(R.id.TVnum1);
        TVnum2=(TextView)findViewById(R.id.TVnum2);

    }
    public void Sumar (View v)
    {
        int n1=Integer.parseInt(txtNum1.getText().toString());
        int n2=Integer.parseInt(txtNum2.getText().toString());
        int resultado=n1+n2;
        txtResult.setText(String.valueOf(resultado));
    }
    public void Restar (View v)
    {
        int n1=Integer.parseInt(txtNum1.getText().toString());
        int n2=Integer.parseInt(txtNum2.getText().toString());
        int resultado=n1-n2;
        txtResult.setText(String.valueOf(resultado));
    }
    public void Multiplicar (View v)
    {
        int n1=Integer.parseInt(txtNum1.getText().toString());
        int n2=Integer.parseInt(txtNum2.getText().toString());
        int resultado=n1*n2;
        txtResult.setText(String.valueOf(resultado));
    }
    public void Dividir (View v)
    {
        int n1=Integer.parseInt(txtNum1.getText().toString());
        int n2=Integer.parseInt(txtNum2.getText().toString());
        int resultado=n1/n2;
        txtResult.setText(String.valueOf(resultado));
    }
}
