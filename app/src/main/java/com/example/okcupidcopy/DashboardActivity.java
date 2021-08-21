package com.example.okcupidcopy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.yuyakaido.android.cardstackview.CardStackLayoutManager;
import com.yuyakaido.android.cardstackview.CardStackListener;
import com.yuyakaido.android.cardstackview.CardStackView;
import com.yuyakaido.android.cardstackview.Direction;
import com.yuyakaido.android.cardstackview.StackFrom;
import com.yuyakaido.android.cardstackview.SwipeableMethod;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class DashboardActivity extends AppCompatActivity {
    private CardStackLayoutManager manager;
    private ViewAdapter adapter;


    private ImageView secondImage;
    private ImageView thirdImage;
    private ImageView forthImage;
    private ImageView fifthImage;
    private ImageView sixthImage;
    private ImageView seventhImage;
    private ImageView eighthImage;
    private ImageView heart;
    private ImageView message;

    private TextView mTvPreferences,mTvProfile;
    private ImageView mIvPreferences, mIvProfile;


    private static final String TAG = DashboardActivity.class.getSimpleName();
    private RecyclerView recyclerView;
    private Button mb2;
    private Glide glide;
    private List<ProfileDTO>profileDTOS=new ArrayList<>();
   // private ViewAdapter viewAdapter;
    private Runnable runnable=new Runnable() {
        @Override
        public void run() {
            readjson();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        CardStackView cardStackView=findViewById(R.id.card_stack_view);
       // initView();
       // setRecycler();

        mIvPreferences=findViewById(R.id.ivPreferences);
        mTvPreferences=findViewById(R.id.tvPreferences);
        mIvProfile=findViewById(R.id.ivProfile);
        mTvProfile=findViewById(R.id.prof);

        heart=findViewById(R.id.heart);
        message=findViewById(R.id.msg);
        secondImage=findViewById(R.id.circle2);
        thirdImage=findViewById(R.id.circle3);
        forthImage=findViewById(R.id.circle4);
        fifthImage =findViewById(R.id.circle5);
        sixthImage=findViewById(R.id.circle6);
        seventhImage=findViewById(R.id.circle7);
        eighthImage=findViewById(R.id.circle8);


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
        adapter=new ViewAdapter(profileDTOS);
        cardStackView.setLayoutManager(manager);
        cardStackView.setAdapter(adapter);
        cardStackView.setItemAnimator(new DefaultItemAnimator());
        startBackground();

        //Merge Listeners from Reeta

        heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,LikesActivity.class);
                startActivity(intent);
            }
        });
        secondImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        thirdImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,MainActivity3.class);
                startActivity(intent);

            }
        });
        forthImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,MainActivity4.class);
                startActivity(intent);

            }
        });
        fifthImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,MainActivity5.class);
                startActivity(intent);

            }
        });
        sixthImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,MainActivity6.class);
                startActivity(intent);

            }
        });
        seventhImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,MainActivity7.class);
                startActivity(intent);

            }
        });
        eighthImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,MainActivity8.class);
                startActivity(intent);

            }
        });
        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,MessagesActivity.class);
                startActivity(intent);
            }
        });

        mIvProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,Profile.class);
                startActivity(intent);
            }
        });
        mTvProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,Profile.class);
                startActivity(intent);
            }
        });

        mTvPreferences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,Preferences.class);
                startActivity(intent);
            }
        });

        mIvPreferences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,Preferences.class);
                startActivity(intent);
            }
        });
    }


//    private List<ItemModel> addList() {
//        List<ItemModel> itemModelList=new ArrayList<>();
////        for(int i=0;i<20;i++){
////            itemModelList.add(new ItemModel(R.drawable.boy3,"Vivian",32,"Ujjan","80%","Person for friendship only and I like travelling so be ready for more fun with me, I am very funny person and like to connect with also same type of persons"));
////            itemModelList.add(new ItemModel(R.drawable.boy2,"Shiv",30,"Delhi","40%","Person for friendship only and I like travelling so be ready for more fun with me, I am very funny person and like to connect with also same type of persons"));
////            itemModelList.add(new ItemModel(R.drawable.boy4,"Vivian",32,"Ujjan","90%","Person for friendship only and I like travelling so be ready for more fun with me, I am very funny person and like to connect with also same type of persons"));
////            itemModelList.add(new ItemModel(R.drawable.girl1,"Raksha",22,"Banguluru","68%","Person for friendship only and I like travelling so be ready for more fun with me, I am very funny person and like to connect with also same type of persons"));
////        }
//
//
//       return itemModelList;
//
//       // initView();
//        //setRecycler();
//    }

//    private void setRecycler() {
//        viewAdapter=new ViewAdapter(profileDTOS);
//        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
//        //recyclerView.setLayoutManager(linearLayoutManager);
//        //recyclerView.setAdapter(viewAdapter);
//
//    }

    private void initView() {
    }

    private void startBackground(){
        Thread thread=new Thread(runnable);
        thread.start();
    }

    private void readjson() {
        try {
            InputStream inputStream=getAssets().open("random.json");
            int data=inputStream.read();

            StringBuilder builder=new StringBuilder();

            while(data!=-1){
                char ch=(char) data;
                builder.append(ch);
                data=inputStream.read();
            }
            buildpojofromjson(builder.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void buildpojofromjson(String json) {
        Type type=new TypeToken<DataDTO>(){}.getType();
        DataDTO dataDTO=new Gson().fromJson(json,type);
        profileDTOS=dataDTO.getProfile();



//        String json=builder.toString();
//        Gson gson=new Gson();
//        Type type=new TypeToken<DataDTO>(){}.getType();
//        DataDTO dataDTO=gson.fromJson(json,type);
//        profileDTOS= (dataDTO.getProfile());
        updateUi();
    }

    private void updateUi() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                adapter.updateData(profileDTOS);
            }
        });
    }
}