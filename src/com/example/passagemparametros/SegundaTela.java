package com.example.passagemparametros;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaTela extends Activity
{
 @Override
    public void onCreate(Bundle savedInstanceState) 
    {
  super.onCreate(savedInstanceState);
  
  TextView textView = new TextView(this);
  Intent intent = getIntent();
  
  Bundle params = intent.getExtras();  
   
  if(params!=null)
  {   
   String mostraTexto = params.getString("mensagem");
   textView.setText(mostraTexto);
   setContentView(textView);
  }
    }
}