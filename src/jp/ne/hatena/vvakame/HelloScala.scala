package jp.ne.hatena.vvakame

import _root_.android.app.Activity
import _root_.android.content.Intent
import _root_.android.os.Bundle
import _root_.android.view.View
import _root_.android.widget.Button

class HelloScala extends Activity {
  import android.view.View.OnClickListener

  override def onCreate(savedInstanceState: Bundle):Unit = {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.hello_scala)

    findViewById(R.id.changeActivityButton).asInstanceOf[Button]
      .setOnClickListener(()=>{
        startActivity(new Intent(this, classOf[HelloJava]))
      })
  }

  implicit def funcOnClick(f:View => Unit): OnClickListener = {
    new OnClickListener(){ def onClick(v: View) = f.apply(v) }
  }
  implicit def funcOnClick0(f:() => Unit): OnClickListener = {
    new OnClickListener() { def onClick(v: View) = f.apply }
  }
}
