package com.ems.parametros;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tela_1 extends Activity {

	// Declaração das variáveis
	Button btTela1;
	EditText txtNome;
	Bundle params;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Carrega a tela principal
		setContentView(R.layout.tela_1);

		// Cria uma variavel para capturar o valor digitado
		txtNome = (EditText) findViewById(R.id.txtNome);

		btTela1 = (Button) findViewById(R.id.btTela1_Tela2);

		btTela1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// Cria uma Intent para armazenar os dados
				Intent itTela2 = new Intent(Tela_1.this, Tela_2.class);

				Bundle params = new Bundle();

				// Grava o valor na outra tela
				params.putString("nome", txtNome.getText().toString());

				// Limpa o campo na Tela 1
				txtNome.setText("");

				itTela2.putExtras(params);

				// Cria uma Activity dinamicamente
				startActivity(itTela2);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
