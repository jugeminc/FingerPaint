package sample.application.fingerpaint;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewManager;
import android.view.WindowManager;
import android.widget.ImageView;

public class FigerPaintActivity extends Activity implements OnTouchListener{
	
	
	public Canvas canvas;
	public Paint  paint;
	public Path   path;
	public Bitmap bitmap;
	public Float  x1;
	public Float  y1;
	public Integer w;
	public Integer h;

	public boolean onTouch (View v, MotionEvent event){
		
		
		
		return Boolean.valueOf(true);
		//return Boolean2.TRUE;
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
	    super.onCreate(savedInstanceState);
	    this.setContentView(R.layout.fingerpaint);
		
		ImageView iv = (ImageView) this.findViewById(R.id.imageView1);
		Object obj = this.getSystemService(Context.WINDOW_SERVICE);
		WindowManager wm = (WindowManager)obj;
		Display disp = wm.getDefaultDisplay();
		
		w = disp.getWidth();
		h = disp.getHeight();
		
		bitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
		paint = new Paint();
		path = new Path();
		canvas = new Canvas();
		
		
		
	}
}
