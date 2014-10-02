package com.example.micalculadora;


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity implements OnClickListener{
	
	private Button cero;
	private Button uno;
	private Button dos;
	private Button tres;
	private Button cuatro;
	private Button cinco;
	private Button seis;
	private Button siete;
	private Button ocho;
	private Button nueve;
	private Button Suma;
	private Button Resta;
	private Button Multiplicacion;
	private Button Division;
	private Button igual;
	private Button punto;
	private Button borrar;
	
	boolean decimal = false;
	boolean suma = false;
	boolean resta = false;
	boolean multi = false;
	boolean div = false;
	
	Double[] numero1 = new Double [20];
	Double resultado;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		this.cero=(Button)findViewById(R.id.cero);	
		this.uno=(Button)findViewById(R.id.uno);	
		this.dos=(Button)findViewById(R.id.dos);
		this.tres=(Button)findViewById(R.id.tres);	
		this.cuatro=(Button)findViewById(R.id.cuatro);
		this.cinco=(Button)findViewById(R.id.cinco);	
		this.seis=(Button)findViewById(R.id.seis);	
		this.siete=(Button)findViewById(R.id.siete);	
		this.ocho=(Button)findViewById(R.id.ocho);
		this.nueve=(Button)findViewById(R.id.nueve);	
		this.Suma=(Button)findViewById(R.id.suma);	
		this.Resta=(Button)findViewById(R.id.resta);	
		this.Multiplicacion=(Button)findViewById(R.id.multi);	
		this.Division=(Button)findViewById(R.id.division);	
		this.igual=(Button)findViewById(R.id.igual);	
		this.punto=(Button)findViewById(R.id.punto);
		this.borrar=(Button)findViewById(R.id.borrar);	
		
		cero.setOnClickListener(this);
		uno.setOnClickListener(this);
		dos.setOnClickListener(this);
		tres.setOnClickListener(this);
		cuatro.setOnClickListener(this);
		cinco.setOnClickListener(this);
		seis.setOnClickListener(this);
		siete.setOnClickListener(this);
		ocho.setOnClickListener(this);
		nueve.setOnClickListener(this);
		Suma.setOnClickListener(this);
		Resta.setOnClickListener(this);
		Multiplicacion.setOnClickListener(this);
		Division.setOnClickListener(this);
		igual.setOnClickListener(this);
		punto.setOnClickListener(this);
		borrar.setOnClickListener(this);

	}

 public void onClick(View v){
	 
	 TextView pantalla = (TextView)findViewById(R.id.pantalla);
	 int seleccion = v.getId();
	 String a = pantalla.getText().toString();
	 
	 try{
	 switch(seleccion){
	 
	 case R.id.cero:
		 pantalla.setText(a+"0");
		 break;
	 case R.id.uno:
		 pantalla.setText(a+"1");
		 break;
	 case R.id.dos:
		 pantalla.setText(a+"2");
		 break;
	 case R.id.tres:
		 pantalla.setText(a+"3");
		 break;
	 case R.id.cuatro:
		 pantalla.setText(a+"4");
		 break;
	 case R.id.cinco:
		 pantalla.setText(a+"5");
		 break;
	 case R.id.seis:
		 pantalla.setText(a+"6");
		 break;
	 case R.id.siete:
		 pantalla.setText(a+"7");
		 break;
	 case R.id.ocho:
		 pantalla.setText(a+"8");
		 break;
	 case R.id.nueve:
		 pantalla.setText(a+"9");
		 break;
	 case R.id.suma:
		 suma = true;
		 numero1[0] = Double.parseDouble(a);
		 pantalla.setText("");
		 break;
	 case R.id.resta:
		 resta = true;
		 numero1[0] = Double.parseDouble(a);
		 pantalla.setText("");
		 break;
	 case R.id.multi:
		 multi = true;
		 numero1[0] = Double.parseDouble(a);
		 pantalla.setText("");
		 break;
	 case R.id.division:
		 div = true;
		 numero1[0] = Double.parseDouble(a);
		 pantalla.setText("");
		 break;
	 case R.id.igual:
		 numero1[1] = Double.parseDouble(a);
		 
		 if(suma == true){
			 resultado = numero1[0] + numero1[1];
			 pantalla.setText(String.valueOf(resultado));
					 
		 }else if(resta == true){
			 resultado = numero1[0] - numero1[1];
			 pantalla.setText(String.valueOf(resultado));
			 
		 }else if(multi == true){
			 resultado = numero1[0] * numero1[1];
			 pantalla.setText(String.valueOf(resultado));
			 
		 }else if(div == true){
			 resultado = numero1[0] / numero1[1];
			 pantalla.setText(String.valueOf(resultado));
			 
		 }
		 break;
	 case R.id.punto:
		 if(decimal == false){
			 pantalla.setText(a+".");
		 decimal = true;
		 }else{return;}
		 break;
	 case R.id.borrar:
		 pantalla.setText("");
		 break;
	 }
	 }catch(Exception e){
	 
		 pantalla.setText("Error");
     };
	 
 }
 

	
	
}
