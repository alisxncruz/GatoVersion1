package com.example.gatoalison;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    int turno,cont,conta=0;
    String letra;


    TextView texto;

    //Creo mis botones
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,
            buttonVolver, buttonSalir;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);


        texto=(TextView)findViewById(R.id.texto);

        button1=(Button)(findViewById(R.id.button1));
        button2=(Button)(findViewById(R.id.button2));
        button3=(Button)(findViewById(R.id.button3));
        button4=(Button)(findViewById(R.id.button4));
        button5=(Button)(findViewById(R.id.button5));
        button6=(Button)(findViewById(R.id.button6));
        button7=(Button)(findViewById(R.id.button7));
        button8=(Button)(findViewById(R.id.button8));
        button9=(Button)(findViewById(R.id.button9));
        buttonSalir=(Button)(findViewById(R.id.buttonSalir));
        buttonVolver =(Button)(findViewById(R.id.buttonVolver));



        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonSalir.setOnClickListener(this);
        buttonVolver.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        cont++;
        turno=cont%2;

        if(turno == 1){
            imprimirXO('X', v);
        }


        else{
            imprimirXO('O', v);
        }


    }


    public void imprimirXO(char letra, View v){

        if(v.getId() == R.id.buttonVolver){
            texto.setEnabled(true);
            texto.setText("");

            button1.setEnabled(true);
            button1.setText("");

            button2.setEnabled(true);
            button2.setText("");

            button3.setEnabled(true);
            button3.setText("");

            button4.setEnabled(true);
            button4.setText("");

            button5.setEnabled(true);
            button5.setText("");

            button6.setEnabled(true);
            button6.setText("");

            button7.setEnabled(true);
            button7.setText("");

            button8.setEnabled(true);
            button8.setText("");

            button9.setEnabled(true);
            button9.setText("");
        }

        if(v.getId() == R.id.buttonSalir){
            System.exit(0);
        }


        if(v.getId() == R.id.button1){
            button1.setText(letra+"");
            button1.setEnabled(false);
        }//Cierro el IF
        else if(v.getId() == R.id.button2){
            button2.setText(letra+"");
            button2.setEnabled(false);
        }
        else if(v.getId() == R.id.button3){
            button3.setText(letra+"");
            button3.setEnabled(false);
        }
        else if(v.getId() == R.id.button4){
            button4.setText(letra+"");
            button4.setEnabled(false);
        }
        else if(v.getId() == R.id.button5){
            button5.setText(letra+"");
            button5.setEnabled(false);
        }
        else if(v.getId() == R.id.button6){
            button6.setText(letra+"");
            button6.setEnabled(false);
        }
        else if(v.getId() == R.id.button7){
            button7.setText(letra+"");
            button7.setEnabled(false);
        }
        else if(v.getId() == R.id.button8){
            button8.setText(letra+"");
            button8.setEnabled(false);
        }
        else if(v.getId() == R.id.button9){
            button9.setText(letra+"");
            button9.setEnabled(false);
        }

        Ganador(letra);


    }//Fin del Metodo imprimirXO

    public void Ganador(char letra){

        if(button1.getText().toString().equals(letra+"") && (button2.getText().toString().equals(letra+"")) && (button3.getText().toString().equals(letra+""))){
            texto.setText("El ganador es el del turno " + letra);
            texto.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);

        }else if(button4.getText().toString().equals(letra+"") && (button5.getText().toString().equals(letra+"")) && (button6.getText().toString().equals(letra+""))){
            texto.setText("El ganador es el del turno "+ letra);
            texto.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);

        }else if(button7.getText().toString().equals(letra+"") && (button8.getText().toString().equals(letra+"")) && (button9.getText().toString().equals(letra+""))){
            texto.setText("El ganador es el del turno "+letra);
            texto.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);

        }else if(button1.getText().toString().equals(letra+"") && (button4.getText().toString().equals(letra+"")) && (button7.getText().toString().equals(letra+""))){
            texto.setText("El ganador es el del turno "+letra);
            texto.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);

        }else if(button2.getText().toString().equals(letra+"") && (button5.getText().toString().equals(letra+"")) && (button8.getText().toString().equals(letra+""))){
            texto.setText("El ganador es el del turno "+letra);
            texto.setEnabled(false);
            button1.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button9.setEnabled(false);

        }else if(button3.getText().toString().equals(letra+"") && (button6.getText().toString().equals(letra+"")) && (button9.getText().toString().equals(letra+""))){
            texto.setText("El ganador es "+letra);
            texto.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);

        }else if(button1.getText().toString().equals(letra+"") && (button5.getText().toString().equals(letra+"")) && (button9.getText().toString().equals(letra+""))){
            texto.setText("El ganador es el del turno "+ letra);
            texto.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);

        }else if(button3.getText().toString().equals(letra+"") && (button5.getText().toString().equals(letra+"")) && (button7.getText().toString().equals(letra+""))){
            texto.setText("El ganador es el del turno "+ letra);
            texto.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button4.setEnabled(false);
            button6.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);

        }else if(conta<9){
            conta++;
        }else {
            texto.setText("¡ES UN EMPATE!");
        }




    }




}