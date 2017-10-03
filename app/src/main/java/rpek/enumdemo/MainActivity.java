package rpek.enumdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import rpek.enumdemo.enam.Country;

import static rpek.enumdemo.enam.Country.JAPAN;
import static rpek.enumdemo.enam.Country.KOREA;
import static rpek.enumdemo.enam.Country.PHNOM_PENH;

public class MainActivity extends AppCompatActivity {
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initilize value with JAPAN
        //So It will print JAPAN on textview
        Country countryType = JAPAN;

        //If statement
        if(countryType.equals(Country.PHNOM_PENH)){
            tvResult.setText(PHNOM_PENH+"");
        }else if(countryType.equals(Country.JAPAN)){
            tvResult.setText(JAPAN+"");
        }else if(countryType.equals(Country.KOREA)){
            tvResult.setText(KOREA+"");
        }

        //reference to xml to display result from java code
        tvResult= (TextView) findViewById(R.id.tvResult);
        switch (countryType){
            case PHNOM_PENH:
                tvResult.setText(PHNOM_PENH+"");
                break;
            case JAPAN:
                tvResult.setText(JAPAN+"");
                break;
            case KOREA:
                tvResult.setText(KOREA+"");
                break;
        }




        //How to do enum iteration
        StringBuilder concateString=new StringBuilder();
        for(Country country: Country.values()){
            concateString.append(country+ "\n");
        }
        tvResult.setText(concateString);




    }
}
