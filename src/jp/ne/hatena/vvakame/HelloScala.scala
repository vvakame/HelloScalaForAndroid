package jp.ne.hatena.vvakame

import _root_.android.app.Activity
import _root_.android.content.Intent
import _root_.android.os.Bundle
import _root_.android.view.View
import _root_.android.view.View.OnClickListener
import _root_.android.widget.Button

class HelloScala extends Activity {
  override def onCreate(savedInstanceState: Bundle) = {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.hello_scala)

    startActivity(new Intent(this, classOf[HelloJava]))
  }
}
