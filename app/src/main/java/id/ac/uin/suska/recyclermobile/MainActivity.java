package id.ac.uin.suska.recyclermobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerv);

        List<itemRec> items = new ArrayList<itemRec>();
        items.add(new itemRec("osama", "osam@gmail.com", R.drawable.alucard));
        items.add(new itemRec("mohd", "mhd@gmail.com", R.drawable.badang));
        items.add(new itemRec("putra", "ptr@gmail.com", R.drawable.chou));
        items.add(new itemRec("alucar", "alcrr@gmail.com", R.drawable.valir));
        items.add(new itemRec("roronoa", "zoro@gmail.com", R.drawable.kagura));
        items.add(new itemRec("luffy", "mongkeyd@gmail.com", R.drawable.gusion));
        items.add(new itemRec("franky", "frk@gmail.com", R.drawable.alucard));
        items.add(new itemRec("amat", "mat@gmail.com", R.drawable.chou));
        items.add(new itemRec("akbar", "makbar@gmail.com", R.drawable.badang));
        items.add(new itemRec("osama", "osam@gmail.com", R.drawable.valir));
        items.add(new itemRec("mohd", "mhd@gmail.com", R.drawable.kagura));
        items.add(new itemRec("putra", "ptr@gmail.com", R.drawable.gusion));
        items.add(new itemRec("alucar", "alcrr@gmail.com", R.drawable.badang));
        items.add(new itemRec("roronoa", "zoro@gmail.com", R.drawable.alucard));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new adapterMobile(getApplicationContext(), items));
    }
}