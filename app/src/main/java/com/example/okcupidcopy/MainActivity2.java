package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

import com.yuyakaido.android.cardstackview.CardStackLayoutManager;
import com.yuyakaido.android.cardstackview.CardStackListener;
import com.yuyakaido.android.cardstackview.CardStackView;
import com.yuyakaido.android.cardstackview.Direction;
import com.yuyakaido.android.cardstackview.StackFrom;
import com.yuyakaido.android.cardstackview.SwipeableMethod;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    private CardStackLayoutManager manager;
    private CardStackAdapter adapter;
    private ImageView firstImage;
    private ImageView thirdImage;
    private ImageView forthImage;
    private ImageView fifthImage;
    private ImageView sixthImage;
    private ImageView seventhImage;
    private ImageView eighthImage;
    private ImageView heart;
    private ImageView message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        heart=findViewById(R.id.heart);
        message=findViewById(R.id.msg);
        firstImage=findViewById(R.id.circle1);
        thirdImage=findViewById(R.id.circle3);
        forthImage=findViewById(R.id.circle4);
        fifthImage =findViewById(R.id.circle5);
        sixthImage=findViewById(R.id.circle6);
        seventhImage=findViewById(R.id.circle7);
        eighthImage=findViewById(R.id.circle8);
        CardStackView cardStackView=findViewById(R.id.card_stack_view);
        manager=new CardStackLayoutManager(this, new CardStackListener() {
            @Override
            public void onCardDragging(Direction direction, float ratio) {


            }

            @Override
            public void onCardSwiped(Direction direction) {

            }

            @Override
            public void onCardRewound() {

            }

            @Override
            public void onCardCanceled() {

            }

            @Override
            public void onCardAppeared(View view, int position) {

            }

            @Override
            public void onCardDisappeared(View view, int position) {

            }
        });
        manager.setStackFrom(StackFrom.None);
        manager.setVisibleCount(3);
        manager.setTranslationInterval(8.0f);
        manager.setScaleInterval(0.95f);
        manager.setSwipeThreshold(0.3f);
        manager.setMaxDegree(20.0f);
        manager.setDirections(Direction.HORIZONTAL);
        manager.setCanScrollHorizontal(true);
        manager.setSwipeableMethod(SwipeableMethod.Manual);
        manager.setOverlayInterpolator(new LinearInterpolator());
        adapter=new CardStackAdapter(addList());
        cardStackView.setLayoutManager(manager);
        cardStackView.setAdapter(adapter);
        cardStackView.setItemAnimator(new DefaultItemAnimator());
        firstImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,DashboardActivity.class);
                startActivity(intent);
            }
        });
        thirdImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
            }
        });
        forthImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity4.class);
                startActivity(intent);
            }
        });
        fifthImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity5.class);
                startActivity(intent);
            }
        });
        sixthImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity6.class);
                startActivity(intent);
            }
        });
        seventhImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity7.class);
                startActivity(intent);
            }
        });
        eighthImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity8.class);
                startActivity(intent);
            }
        });
        heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,LikesActivity.class);
                startActivity(intent);
            }
        });
        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MessagesActivity.class);
                startActivity(intent);
            }
        });

    }

    private List<ItemModel> addList() {
        List<ItemModel> itemModelList=new ArrayList<>();
        for(int i=0;i<5;i++){
            itemModelList.add(new ItemModel(R.drawable.prabhakar,"Prabhakar",23,"Kanpur","80%","I am a Heart Hacker"));
            itemModelList.add(new ItemModel(R.drawable.girl3,"Shivani",26,"Delhi","82%","Ping me on Instagram-roshanig."));
            itemModelList.add(new ItemModel(R.drawable.girl1,"Anjali",25,"Mumbai","70%","Big time foodie,Poetry,Honest."));
            itemModelList.add(new ItemModel(R.drawable.girls2,"Raksha",27,"Banguluru","88%","Professinally I am a dancer."));
            itemModelList.add(new ItemModel(R.drawable.boy1,"Aahsan",20,"Indore","90%","Looking for serious people !"));
            itemModelList.add(new ItemModel(R.drawable.boy2,"Virat",30,"Gurgaon","98%","I drink massive amount of coffee"));
            itemModelList.add(new ItemModel(R.drawable.girls4,"Kumudh",23,"Bhopal","78%","I am passionate,sweet,funny,and happy"));
            itemModelList.add(new ItemModel(R.drawable.girl5,"Rupali",22,"Gwalior","85%","I am new to online dating,tips for conversation?"));
            itemModelList.add(new ItemModel(R.drawable.girl6,"Shailee",25,"Shimla","92%","I believe in Goodness and humanitarian values."));
            itemModelList.add(new ItemModel(R.drawable.girl7,"Deeksha",26,"Surat","96%","Looking for decent and interesting person."));
        }
        return itemModelList;
    }
}