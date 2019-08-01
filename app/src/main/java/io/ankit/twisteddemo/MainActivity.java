package io.ankit.twisteddemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import io.ankit.twistedlayoutmanager.TwistedLayoutManager;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        TwistedLayoutManager layoutManager=new TwistedLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<Integer> integerArrayList=new ArrayList<>();
        for (int i = 0; i <500 ; i++) {
            integerArrayList.add(i);
        }
        ModelDummyAdapter adapter=new ModelDummyAdapter(MainActivity.this,integerArrayList);
        recyclerView.setAdapter(adapter);

    }
}
