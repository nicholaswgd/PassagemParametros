package com.ems.parametros;

import com.ems.parametros.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tela_2 extends Activity {

	Button btTela2;
	TextView msg;
	Bundle params;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela_2);

		msg = (TextView) findViewById(R.id.txtResultado);

		// Recupera a Intent
		Intent it = getIntent();
		if (it != null) {
			Bundle params = it.getExtras();
			if (params != null) {
				String nome = params.getString("nome");
				msg.setText("Olá [" + nome + "], seja bem vindo!");
			}
		}
		btTela2 = (Button) findViewById(R.id.btTela2_Tela_1);
		
		btTela2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// Finaliza a Intent
				finish();
			}
		});

	}

}
