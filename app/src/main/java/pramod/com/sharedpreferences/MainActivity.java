package pramod.com.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText n,a;
    private TextView tv;
    private SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n = findViewById(R.id.name);
        a = findViewById(R.id.age);
        tv = findViewById(R.id.result);

        sp = getSharedPreferences("myshredpreferences", MODE_PRIVATE);
    }(

    public void saveData(View view){
        String name = n.getText().toString();
        int age = Integer.parseInt(a.getText().toString());

        SharedPrefereces.Editor editor = sp.edit();
        editor.putString("NAME", name);
        editor.putInt("AGE",age);
        editor.apply();

        displayData();
    }

    
}