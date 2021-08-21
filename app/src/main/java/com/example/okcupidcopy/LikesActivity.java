package com.example.okcupidcopy;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.ImageView;



import java.util.ArrayList;

public class LikesActivity extends AppCompatActivity implements OnClickListner {
    private RecyclerView recyclerView;
    private OnClickListner onClickListner;
    ImageView cancle;
    LikesAdapter adapter;

    private ArrayList<LikesItems> items=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_likes);
        cancle=findViewById(R.id.cancel);
        recyclerView=findViewById(R.id.recyclerview);
        buildataforAdapter();
        setDataForAdapter();
    }

    private void setDataForAdapter() {
        adapter=new LikesAdapter(items,this);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void buildataforAdapter() {
        for(int i=0;i<2;i++) {
            items.add(new LikesItems(R.drawable.boy3, "Vivian, 32", "Ujjan"));
            items.add(new LikesItems(R.drawable.girl1, "Roshani,25", "UP"));
            items.add(new LikesItems(R.drawable.girl3, "Reeta, 26", "Maharastra"));
            items.add(new LikesItems(R.drawable.boy1, "Rajkumar,36", "Kanpur"));
            items.add(new LikesItems(R.drawable.girl6, "Rani,28", "Chennai"));
            items.add(new LikesItems(R.drawable.rohan, "Rohan,27", "Surat"));
            items.add(new LikesItems(R.drawable.rano, "Rano, 25", "Ahmdabad"));
            items.add(new LikesItems(R.drawable.rahul, "Rahul, 27", "Kanpur"));
            items.add(new LikesItems(R.drawable.rashami, "Rashami, 23", "Raipur"));
            items.add(new LikesItems(R.drawable.raj, "Raj, 21", "Mumbai"));
        }
    }

    @Override
    public void onclick(LikesItems items1, int position) {
        items.remove(position);
        adapter.notifyItemRemoved(position);

    }
}