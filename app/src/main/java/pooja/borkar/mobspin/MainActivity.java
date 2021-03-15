package pooja.borkar.mobspin;






        import android.app.Activity;
        import android.graphics.drawable.Animatable;
        import android.graphics.drawable.Drawable;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ImageView imageView3 = (ImageView)findViewById(R.id.imageview1);
        imageView3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Drawable drawable = ((ImageView)v).getDrawable();
                ((Animatable) drawable).start();
            }
        });
    }

}
