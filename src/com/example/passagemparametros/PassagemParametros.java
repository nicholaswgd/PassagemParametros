package com.example.passagemparametros;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PassagemParametros extends Activity 
{
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //CRIA OS OBJETOS
        final EditText campoTexto = (EditText) findViewById(R.id.editText1);
        Button botao = (Button) findViewById(R.id.envio);
        
        //CLICK DO BOTÃO
        botao.setOnClickListener(new Button.OnClickListener () 
        {
            public void onClick(View v)
            {
                Intent intent = new Intent(v.getContext(), SegundaTela.class);
                Bundle params = new Bundle();
                
                String resposta = campoTexto.getText().toString();
                params.putString("mensagem", resposta);
                intent.putExtras(params);
                startActivity(intent);
            }
        });
    }
}
