package jp.ne.hatena.vvakame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HelloJava extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hello_java);

		Button changeButton = (Button) findViewById(R.id.changeActivityButton);
		changeButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(HelloJava.this, HelloScala.class));
			}
		});
	}
}