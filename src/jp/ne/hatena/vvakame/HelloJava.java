package jp.ne.hatena.vvakame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HelloJava extends Activity implements OnClickListener {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hello_java);

		((Button) findViewById(R.id.changeActivityButton))
				.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		Intent intent = null;
		switch (v.getId()) {
		case R.id.changeActivityButton:
			intent = new Intent(this, HelloScala.class);
			startActivity(intent);
			break;
		default:
			break;
		}
	}
}