package com.example.new_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Esta clase define el comportamiento de la calculadora básica, su funcionalidad y elementos.
 * @author: Pablo Ascorbe, Alberto Escalona, David Íñiguez e Iñaki Lafuente a partir de la librería de ritik2410
 * @version: 29/04/2021
 * @see <a href = "https://github.com/ritik2410/Elegant_Calculator"/>Elegant_Calculator</a>
 */

public class MainActivity extends AppCompatActivity {
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b0;

    private Button b_equal;
    private Button b_multi;
    private Button b_divide;
    private Button b_add;
    private Button b_sub;

    private Button b_clear; //C
    private Button b_dot;
    private Button b_ans;
    private Button b_plusMinus;
    private Button b_backspace;

    private TextView t1;
    private TextView t2;

    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char EQU = '=';
    private final char EXTRA = '@';

    private char ACTION;
    private double val1 = Double.NaN;
    private double val2;

    private double aux = Double.NaN;
    private boolean primeraVez = true;

    private int count = 0;
    private String expression = "";
    private String text = "";
    private Double result = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewSetup();

        b1.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b1, permite escribir un 1 en la calculadora, borrando el texto invalid expression si estuviese
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(t1.getText().equals("Invalid Expression")){
                    t1.setText("");
                }
                t2.setText(t2.getText().toString() + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b2, permite escribir un 2 en la calculadora, borrando el texto invalid expression si estuviese
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(t1.getText().equals("Invalid Expression")){
                    t1.setText("");
                }
                t2.setText(t2.getText().toString() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b3, permite escribir un 3 en la calculadora, borrando el texto invalid expression si estuviese
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(t1.getText().equals("Invalid Expression")){
                    t1.setText("");
                }
                t2.setText(t2.getText().toString() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b4, permite escribir un 4 en la calculadora, borrando el texto invalid expression si estuviese
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(t1.getText().equals("Invalid Expression")){
                    t1.setText("");
                }
                t2.setText(t2.getText().toString() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b5, permite escribir un 5 en la calculadora, borrando el texto invalid expression si estuviese
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(t1.getText().equals("Invalid Expression")){
                    t1.setText("");
                }
                t2.setText(t2.getText().toString() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b6, permite escribir un 6 en la calculadora, borrando el texto invalid expression si estuviese
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(t1.getText().equals("Invalid Expression")){
                    t1.setText("");
                }
                t2.setText(t2.getText().toString() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b7, permite escribir un 7 en la calculadora, borrando el texto invalid expression si estuviese
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(t1.getText().equals("Invalid Expression")){
                    t1.setText("");
                }
                t2.setText(t2.getText().toString() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b8, permite escribir un 8 en la calculadora, borrando el texto invalid expression si estuviese
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(t1.getText().equals("Invalid Expression")){
                    t1.setText("");
                }
                t2.setText(t2.getText().toString() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b9, permite escribir un 9 en la calculadora, borrando el texto invalid expression si estuviese
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(t1.getText().equals("Invalid Expression")){
                    t1.setText("");
                }
                t2.setText(t2.getText().toString() + "9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b0, permite escribir un 0 en la calculadora, borrando el texto invalid expression si estuviese
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(t1.getText().equals("Invalid Expression")){
                    t1.setText("");
                }
                t2.setText(t2.getText().toString() + "0");
            }
        });

        b_dot.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_dot, permite escribir un punto decimal en la calculadora, borrando el texto invalid expression si estuviese
             * e impidiendo que haya mas de un punto decimal por número
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                exceedLength();
                if(t1.getText().equals("Invalid Expression")){
                    t1.setText("");
                }
                if((!t2.getText().toString().isEmpty()) && (puedeDecimal( t2.getText().toString())) ){
                    t2.setText(t2.getText().toString() + ".");
                }else{
                    t2.setText(t2.getText().toString() + "");
                }

            }
        });

        b_ans.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_ans, permite escribir la respuesta anterior en la calculadora, borrando el texto invalid expression si estuviese
             * y añadiendo un 0 en el caso de que no se haya realizado ninguna operación previa
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                if(t1.getText().equals("Invalid Expression")){
                    t1.setText("");
                }
                if (primeraVez) {
                    t2.setText(t2.getText().toString() + "0");
                } else {
                    t2.setText(t2.getText().toString() + String.valueOf(aux));
                }
            }
        });

        b_add.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_add, permite escribir un + en la calculadora, borrando el texto invalid expression si estuviese
             * y comprobando que la sintaxis lo permite, en caso contrario no añade nada
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                if(t1.getText().equals("Invalid Expression")){
                    t1.setText("");
                }
                if((!t2.getText().toString().isEmpty()) && (permiteSimbolo(t2.getText().toString(),"+"))){
                    operationClicked("+");
                }else{
                    t2.setText(t2.getText().toString() + "");
                }

            }
        });

        b_sub.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_sub, permite escribir un - en la calculadora, borrando el texto invalid expression si estuviese
             * y realizando las comprobaciones oportunas para que permita escribir numeros negativos pero no permita sintaxis incorrectas.
             * Se da por válida la sintaxis de dos símbolos seguidos siempre que el segundo sea un - representando un numero negativo: 1*-5
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                if(t1.getText().equals("Invalid Expression")){
                    t1.setText("");
                }else if(t2.getText().toString().isEmpty()){
                    t2.setText("-");
                }
                else if(t2.getText().toString().equals("-")){
                    t2.setText(t2.getText().toString() + "");
                }else if(permiteSimbolo(t2.getText().toString(),"-")){
                    if (t2.length() != 0) {
                        String s = t2.getText().toString() + "-";
                        t2.setText(s);
                        count = 0;
                    } else {
                        String text = t1.getText().toString();
                        if (text.length() > 0) {
                            String newText = text.substring(0, text.length() - 1) + "-";
                            t1.setText(newText);
                        } else if (text.length() == 0) {
                            t2.setText("-");
                        }
                    }
                }
            }
        });

        b_multi.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_multi, permite escribir un * en la calculadora, borrando el texto invalid expression si estuviese
             * y comprobando que la sintaxis lo permite, en caso contrario no añade nada
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                if(t1.getText().equals("Invalid Expression")){
                    t1.setText("");
                }
                if((!t2.getText().toString().isEmpty()) && (permiteSimbolo(t2.getText().toString(),"*"))){
                    operationClicked("*");
                }else{
                    t2.setText(t2.getText().toString() + "");
                }
            }
        });

        b_divide.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_divide, permite escribir una / en la calculadora, borrando el texto invalid expression si estuviese
             * y comprobando que la sintaxis lo permite, en caso contrario no añade nada
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                if(t1.getText().equals("Invalid Expression")){
                    t1.setText("");
                }
                if((!t2.getText().toString().isEmpty()) && (permiteSimbolo(t2.getText().toString(),"/"))){
                    operationClicked("/");
                }else{
                    t2.setText(t2.getText().toString() + "");
                }

            }
        });

        b_plusMinus.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_plusMinus, permite  poner en negativo el resultado actual, borrando el texto invalid expression si estuviese
             * Funciona con la expresión y con el resultado calculado. Pone el opuesto como resultado para seguir calculando desde ahi
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                if(t1.getText().equals("Invalid Expression")){
                    t1.setText("");
                }
                if (!t2.getText().toString().isEmpty() || !t1.getText().toString().isEmpty()) {
                    String s = t1.getText().toString();
                    char arr[] = s.toCharArray();
                    if (arr[0] == '-')
                        t2.setText(s.substring(1, s.length()));
                    else
                        t2.setText("-" + s);
                }
            }
        });

        b_equal.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_equal, permite ecalcular el resultado de la expresión escrita, con caso especial por si esta vacía la expresion
             * y empleando el metodo calculate que se ve mas adelante. Si sucede una excepción muestra Invalid Expression
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {

                if (t2.length() != 0) {
                    expression = t2.getText().toString();
                }
                t1.setText("");
                if (expression.length() == 0)
                    expression = "0.0";
                try {
                    result = calculate(expression);
                    t2.setText(result + "");
                    primeraVez = false;
                    aux = result;
                } catch (Exception e) {
                    try{
                        if((Double) Double.parseDouble(expression) instanceof Double){
                            t1.setText(expression);
                        }else{
                            t1.setText("Invalid Expression");
                            expression = "";
                        }

                    }catch (NumberFormatException numberFormatException){
                        numberFormatException.printStackTrace();

                    }
                    t2.setText("");
                    e.printStackTrace();
                }
            }
        });

        b_clear.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_clear, permite borrar los campos de texto
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                val1 = Double.NaN;
                val2 = Double.NaN;
                t1.setText("");
                t2.setText("");
            }
        });

        b_backspace.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_backspace, permite eliminar el ultimo caracter escrito en el cuadro de texto de escritura de la expresion, borrando el texto invalid expression si estuviese
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                if(t1.getText().equals("Invalid Expression")){
                    t1.setText("");
                }
                if ((t2.getText().length() > 0)) {
                    if (t2.getText().length() == 1) {
                        t2.setText("");
                    } else {
                        CharSequence name = t2.getText().toString();
                        t2.setText(name.subSequence(0, name.length() - 1));
                    }
                }
            }
        });

        t2.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            /**
             * Listener para calcular el resultado provisional de la expresion escrita hasta el momento, con casos particulares para calcular el resultado correctamente de la expresión mas larga
             * valida hasta el momento, ignorando los ultimos signos: 14+8*- mostraría 22. Si es un número lo muestra tal cual. Se activa cada vez que el texto de la expresión cambia
             * @param s interfaz de elementos que se puede editar su contenido
             */
            @Override
            public void afterTextChanged(Editable s) {
                if (t2.getText().toString().length() > 0) {
                    double resultadoParcial = 0;
                    char[] t2CharArray = t2.getText().toString().toCharArray();
                    char[] t2CharArrayCopia;
                    int numSimbolos = getNumSimbolos(t2CharArray);
                    if (numSimbolos == 0) {
                        t1.setText(t2.getText().toString());
                    } else {
                        if ((numSimbolos == 1 && esSimbolo(t2CharArray[t2CharArray.length - 1])) || (numSimbolos == 2 && esSimbolo(t2CharArray[t2CharArray.length - 1]) && esSimbolo(t2CharArray[t2CharArray.length - 2]))) {
                            t2CharArrayCopia = eliminarUltimosSimbolos(t2CharArray);
                            t1.setText(charArrayToString(t2CharArrayCopia));
                        } else {
                            t2CharArrayCopia = t2.getText().toString().toCharArray();
                            if (numSimbolos > 1 && esSimbolo(t2CharArray[t2CharArray.length - 1])) {
                                t2CharArrayCopia = eliminarUltimosSimbolos(t2CharArray);
                            }
                            resultadoParcial = calculate(charArrayToString(t2CharArrayCopia));
                            t1.setText(resultadoParcial + "");
                        }

                    }
                }
            }
        });

    }

    /**
     * Método que analiza si es válido escribir el símbolo sim a continuación en la expresión, caso especial para el - ya que es el único que puede ir detrás de otro símbolo.
     * @param s es la propia expresión
     * @param sim simbolo en concretoq ue se va a analizar si es válido sintácticamente en la expresion
     * @return true si el símbolo se puede escribir a continuación y false si sería sintaxis incorrecta
     */
    private boolean permiteSimbolo(String s, String sim){
        char[] arr = s.toCharArray();
        int n=arr.length-1;
        boolean valido=true;
        if (esSimbolo(arr[n])) {
            if(!sim.equals("-")){
                valido=false;
            }else{
                if(esSimbolo(arr[n-1])){
                    valido=false;
                }
            }
        }
        return valido;
    }

    /**
     * Método que analiza si la expresión permite escribir un punto decimal, es decir si el último número no tenía punto hasta ahora
     * @param s es la propia expresión
     * @return true si permite un decimal a continuación y false si sería sintaxis incorrecta
     */
    private boolean puedeDecimal(String s){
        char[] arr = s.toCharArray();
        int n=arr.length-1;
        boolean valido=true;
        while (n>=0 && !esSimbolo(arr[n])) {
            if(arr[n]=='.'){
                valido=false;
            }
            n--;
        }
        if(esSimbolo(arr[arr.length-1])){
            valido=false;
        }
        return valido;
    }

    /**
     * Método que transforma un array de caracteres en una string
     * @param arr array de caracteres a transformar
     * @return string correspondiente al array de caracteres
     */
    private String charArrayToString(char[] arr) {
        String s = "";

        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        return s;
    }

    /**
     * Método que calcula el número de símbolos en un array de caracteres, correspondiente a la expresión. El - (marca de numero negativo) inicial no se cuenta
     * @param arr es la propia expresión
     * @return int con el numero de símbolos (sin contar el negativo inicial si lo hubiere)
     */
    private int getNumSimbolos(char[] arr) {
        int position = 0;
        int contador = 0;
        boolean anterior = false;
        if (arr[0] == '-') {
            position++;
        }
        for (int i = position; i < arr.length; i++) {
            if (arr[i] == '+' || arr[i] == '-' || arr[i] == '*' || arr[i] == '/') {
                if (!anterior) {
                    contador++;
                    anterior = true;
                }
            }
            anterior = false;
        }
        return contador;
    }

    /**
     * Método que analiza si el caracter en cuestión es uno de los símbolos de las operaciones (+,-,*,/)
     * @param caracter caracter a analizar
     * @return true si es un símbolo de operación y false en caso contrario
     */
    private boolean esSimbolo(char caracter) {
        return (caracter == '+' || caracter == '-' || caracter == '*' || caracter == '/');
    }

    /**
     * Método que elimina de la expresión los ultimos simbolos que finalizan la expresión(18*9+-, en este caso deja 18*9)
     * Se emplea para crear una operación válida para el cálculo automático del resultado provisional
     * @param arr es la propia expresión
     * @return array de caracteres con la expresión válida para ser calculada
     */
    private char[] eliminarUltimosSimbolos(char[] arr) {
        int n = arr.length;
        while (esSimbolo(arr[n - 1])) {
            n--;
        }
        char[] arrReturn = new char[n];

        for (int i = 0; i < n; i++) {
            arrReturn[i] = arr[i];
        }

        return arrReturn;
    }

    /**
     * Método que inicializa los botones de la vista, original de la librería
     */
    private void viewSetup() {
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        b0 = findViewById(R.id.button0);

        b_equal = findViewById(R.id.button_equal);
        b_multi = findViewById(R.id.button_multi);
        b_divide = findViewById(R.id.button_divide);
        b_add = findViewById(R.id.button_add);
        b_sub = findViewById(R.id.button_sub);

        b_clear = findViewById(R.id.button_clear);
        b_dot = findViewById(R.id.button_dot);
        b_ans = findViewById(R.id.button_ANS);
        b_plusMinus = findViewById(R.id.button_plusMinus);
        b_backspace = findViewById(R.id.button_backspace);

        t1 = findViewById(R.id.input);
        t2 = findViewById(R.id.output);
    }


    /**
     * Método original de la librería
     */
    // Remove error message that is already written there.
    private void ifErrorOnOutput() {
        if (t2.getText().toString().equals("Error")) {
            t2.setText("");
        }
    }

    /**
     * Método original de la librería
     */
    // Make text small if too many digits.
    private void exceedLength() {
        if (t1.getText().toString().length() > 10) {
            t1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        }
    }

    /**
     * Método que se ejecuta cuando se hace click en un boton de operacion, añade el simbolo a la expresión
     * @param op es el símbolo a añadir
     */
    private void operationClicked(String op) {
        if (t2.length() != 0) {
            t2.setText(t2.getText() + op);
            count = 0;
        } else {
            String text = t1.getText().toString();
            if (text.length() > 0) {
                String newText = text.substring(0, text.length() - 1) + op;
                t1.setText(newText);
            }
        }
    }

    /**
     * Método que calcula el resultado de una expresión dada, tiene en cuenta distintos casos dependiendo del tipo de operación
     * Tiene en cuenta si un número es negativo, le cambia el signo si es necesario y calcula la expresión al completo
     * @param expression es la propia expresión
     * @return double con el resultado de la expresión redondeado a 5 cifras decimales
     */
    private double calculate(String expression) {
        String op1String = "";
        String op2String = "";

        double op1 = 0;
        double op2 = 0;

        char simbol = '+';
        boolean neg = false;

        int position = 0;
        char arr[] = expression.toCharArray();

        boolean primeraVez = true;
        boolean cambiarSigno = false;

        if (arr[0] == '-')
            neg = true;

        while ((arr[position] != '+' && arr[position] != '-' && arr[position] != '*' && arr[position] != '/') || primeraVez) {
            op1String += arr[position];
            position++;
            primeraVez = false;
        }
        simbol = arr[position];
        if (arr[position + 1] == '-') {
            cambiarSigno = true;
            position++;
        }

        for (int i = position + 1; i < arr.length; i++) {
            if (arr[i] != '+' && arr[i] != '-' && arr[i] != '*' && arr[i] != '/') {
                op2String += arr[i];
            } else {
                op1 = Double.valueOf(op1String);
                op2 = Double.valueOf(op2String);
                if (cambiarSigno) {
                    op2 = op2 * (-1);
                    cambiarSigno = false;
                }

                switch (simbol) {
                    case '+': {
                        op1 += op2;
                        break;
                    }
                    case '-': {
                        op1 -= op2;
                        break;
                    }
                    case '*': {
                        op1 = op1 * op2;
                        break;
                    }
                    case '/': {
                        op1 = op1 / op2;
                        break;
                    }
                }
                simbol = arr[i];
                if (arr[i + 1] == '-') {
                    cambiarSigno = true;
                    i++;
                }
                position = i;
                op2String = "";
                op1String = String.valueOf(op1);

            }
        }

        op1 = Double.valueOf(op1String);
        op2 = Double.valueOf(op2String);

        if (cambiarSigno) {
            op2 = op2 * (-1);
            cambiarSigno = false;
        }
        switch (simbol) {
            case '+': {
                op1 += op2;
                break;
            }
            case '-': {
                op1 -= op2;
                break;
            }
            case '*': {
                op1 = op1 * op2;
                break;
            }
            case '/': {
                op1 = op1 / op2;
                break;
            }

        }

        return round(op1,5);
    }

    /**
     * Método que redondea un double al numero de cifras decimales deseadas
     * @param value número a redondear
     * @param places número de cifras decimales
     * @return double redondeado a places cifras decimales
     */
    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

}