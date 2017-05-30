package id.co.mitschool.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final List<Inbox> dataseet = new ArrayList<>();
        final InboxAdapter adapter = new InboxAdapter(dataseet);

        dataseet.add(new Inbox("Budi", "hai aku budi", "5M"));
        dataseet.add(new Inbox("Andi", "hai aku Andi", "7M"));
        dataseet.add(new Inbox("Rendi", "hai aku Rendi", "3H"));
        dataseet.add(new Inbox("Sandi", "hai aku Sandi", "1M"));
        dataseet.add(new Inbox("Aldi", "hai aku Aldi", "2M"));
        dataseet.add(new Inbox("Cindi", "hai aku Cindi", "50M"));

        RecyclerView rvInbox = (RecyclerView) findViewById(R.id.rv_inbox);
        rvInbox.setLayoutManager(new LinearLayoutManager(this));
        rvInbox.addItemDecoration(new SpacesItemDecoration(this, R.dimen.space_5));
        rvInbox.setAdapter(adapter);
        rvInbox.addOnItemTouchListener(new RecyclerTouchListener(MainActivity.this, rvInbox,
                new RecyclerTouchListener.ClickListener() {
                    @Override
                    public void onClick(View view, int position) {
                        Toast.makeText(MainActivity.this, dataseet.get(position).getName(), Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onLongClick(View view, int position) {
//                        Toast.makeText(MainActivity.this, dataseet.get(position).getMessage(), Toast.LENGTH_LONG).show();
                        adapter.remove(dataseet, position);

                    }
                }));
    }

}
