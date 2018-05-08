package org.sandec.uts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    EditText edt_angka;
    Button bt_yen, bt_pounds, bt_euro, bt_USD;
    TextView tv_hasil;

    double angka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_angka = (EditText) findViewById(R.id.ET_input);
        bt_yen = (Button) findViewById(R.id.RpToYen);
        bt_euro = (Button) findViewById(R.id.RpToEuro);
        bt_pounds = (Button) findViewById(R.id.RpToPounds);
        bt_USD = (Button) findViewById(R.id.RpToUSD);
        tv_hasil = (TextView) findViewById(R.id.TV_Output);
    }
    public boolean cek(){
        if (edt_angka.getText().toString().isEmpty()){
            Toast.makeText(this, "Masukkan bilangan ", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    public void toYen(View v){
        if (!cek()){
            return;
        }

        try{
            int masukan = Integer.parseInt(edt_angka.getText().toString().trim());
            int hitung = masukan * 125;
            tv_hasil.setText(NumberFormat.getCurrencyInstance(Locale.JAPAN).format(hitung));
 //           angka = Double.parseDouble(edt_angka.getText().toString());
        }catch(Exception ex){
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
        }

  //      double hasil = angka / 125;
 //       tv_hasil.setText(NumberFormat.getCurrencyInstance(Locale.JAPAN).format(hasil));
  //      Toast.makeText(this, "1 Yen = Rp 125", Toast.LENGTH_SHORT).show();
    }

    public void toEuro(View v){
        if (!cek()){
            return;
        }

        try{
            int masukan = Integer.parseInt(edt_angka.getText().toString().trim());
            int hitung = masukan * 14103;
            tv_hasil.setText(NumberFormat.getCurrencyInstance(Locale.GERMANY).format(hitung));

//            angka = Double.parseDouble(edt_angka.getText().toString());
        }catch(Exception e){
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
        }
 //       double hasil = angka / 14103;
 //       tv_hasil.setText(NumberFormat.getCurrencyInstance(Locale.GERMANY).format(hasil));
 //       Toast.makeText(this, "1 Euro = Rp 14.103", Toast.LENGTH_SHORT).show();
    }

    public void toPounds(View v){
        if (!cek()){
            return;
        }

        try{
            int masukan = Integer.parseInt(edt_angka.getText().toString().trim());
            int hitung = masukan * 16618;
            tv_hasil.setText(NumberFormat.getCurrencyInstance(Locale.ENGLISH).format(hitung));

//            angka = Double.parseDouble(edt_angka.getText().toString());
        }catch(Exception e){
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
        }
    }

    public void toUSD(View v){
        if (!cek()){
            return;
        }

        try{
            int masukan = Integer.parseInt(edt_angka.getText().toString().trim());
            int hitung = masukan * 13260;
            tv_hasil.setText(NumberFormat.getCurrencyInstance(Locale.US).format(hitung));

        }catch(Exception e){
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
        }


    }
}

