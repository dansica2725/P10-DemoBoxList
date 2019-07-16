package c346.rp.edu.sg.demoboxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView colorLv;
    ArrayList<Color> colorList;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorLv = findViewById(R.id.colorLv);

        colorList = new ArrayList<>();

        colorList.add(new Color("Blue"));
        colorList.add(new Color("Orange"));
        colorList.add(new Color("Brown"));

        adapter = new CustomAdapter(MainActivity.this, R.layout.row, colorList);
        colorLv.setAdapter(adapter);
    }
}
