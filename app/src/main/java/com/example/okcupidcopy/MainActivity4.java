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

public class MainActivity4 extends AppCompatActivity {
    private CardStackLayoutManager manager;
    private CardStackAdapter adapter;
    private ImageView firstImage;
    private ImageView secondImage;
    private ImageView thirdImage;
    private ImageView fivethImage;
    private ImageView sixthImage;
    private ImageView seventhImage;
    private ImageView eighthImage;
    private ImageView heart;
    private ImageView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        firstImage=findViewById(R.id.circle1);
        heart=findViewById(R.id.heart);
        message=findViewById(R.id.msg);
        secondImage=findViewById(R.id.circle2);
        thirdImage=findViewById(R.id.circle3);
        fivethImage=findViewById(R.id.circle5);
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
        heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity4.this,LikesActivity.class);
                startActivity(intent);
            }
        });
        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity4.this,MessagesActivity.class);
                startActivity(intent);
            }
        });
        firstImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity4.this,DashboardActivity.class);
                startActivity(intent);
            }
        });
        secondImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity4.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        thirdImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity4.this,MainActivity3.class);
                startActivity(intent);
            }
        });
        fivethImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity4.this,MainActivity5.class);
                startActivity(intent);
            }
        });
        sixthImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity4.this,MainActivity6.class);
                startActivity(intent);
            }
        });
        seventhImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity4.this,MainActivity7.class);
                startActivity(intent);
            }
        });
        eighthImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity4.this,MainActivity8.class);
                startActivity(intent);
            }
        });
    }

    private List<ItemModel> addList() {
        List<ItemModel> itemModelList=new ArrayList<>();
        for(int i=0;i<5;i++){
            itemModelList.add(new ItemModel(R.drawable.foren,"Joy",40,"USA","70%","Extremely nerby introvert that is liable to talk a lot."));
            itemModelList.add(new ItemModel(R.drawable.foren1,"Krish",23,"North Koria","40%","Unique, funny, klutz, horro and disney moive freak. "));
            itemModelList.add(new ItemModel(R.drawable.foren2,"Abharahim",27,"France","60%","I Love to haev fun and be adventurous."));
            itemModelList.add(new ItemModel(R.drawable.foren3,"Charles",38,"Canada","68%","I am just a modern day hippie."));
            itemModelList.add(new ItemModel(R.drawable.foren6,"Joseph",36,"Poland","50%","Introvert, gamer, love pets and watch Netflix."));
            itemModelList.add(new ItemModel(R.drawable.foren7,"Daniel",40,"Germany","76%","Small poetry tran seeks slowburn summer softness."));
            itemModelList.add(new ItemModel(R.drawable.foren8,"Thomas",29,"Brazil","63%","I like space,books,and cats."));
            itemModelList.add(new ItemModel(R.drawable.foren9,"Richard",28,"Italy","23%","Like to have fun like meeting new people helping people."));
            itemModelList.add(new ItemModel(R.drawable.foren10,"Mary",26,"UK","76%","Talkative,enjoy watching anime,read books and funny."));
            itemModelList.add(new ItemModel(R.drawable.foren12,"Barbara",29,"Austria","32%","I am a shy awkward girl who likes anime."));
            itemModelList.add(new ItemModel(R.drawable.foren13,"Jennifer",25,"Australia","69%","Loyal and honest person"));
        }
        return itemModelList;
    }
}