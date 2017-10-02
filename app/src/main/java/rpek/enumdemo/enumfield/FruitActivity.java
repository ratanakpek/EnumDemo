package rpek.enumdemo.enumfield;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import rpek.enumdemo.R;

public class FruitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);

       TextView tv = (TextView) findViewById(R.id.tvFruit);

        //we can user setter & getter with enum
        Fruit.APPLE.setFruit("YES, Love APPLE");
       // Fruit.PINE_APPLE.setFruit("NO, DON'T LIKE");
        //Fruit.BANANA.setFruit("NORMAL BANANA");

        tv.setText(Fruit.APPLE.getFruit()+"");


    }
}
