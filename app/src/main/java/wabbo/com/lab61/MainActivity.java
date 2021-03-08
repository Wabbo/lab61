package wabbo.com.lab61;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<MovieModel> list ;
    MovieListAdapter adapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.listView);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this) ;
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        list = Arrays.asList( new MovieModel("Survey Corps",1000  ,R.drawable.survey_corps_logo),
                new MovieModel("Military Police Brigade",2000  ,R.drawable.brigade_logo),
                new MovieModel("Garrison",10000  ,R.drawable.garrison_logo)
        );
        adapter = new MovieListAdapter(this,list);
        recyclerView.setAdapter(adapter);
    }
}