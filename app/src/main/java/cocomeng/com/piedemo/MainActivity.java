package cocomeng.com.piedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    PieView pieView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pieView= (PieView) findViewById(R.id.pie);
        PieData pieData;
        ArrayList<PieData> mData=new ArrayList<>();
        pieData=new PieData();
        pieData.setValue(300);
        mData.add(pieData);

        pieData=new PieData();
        pieData.setValue(200);
        mData.add(pieData);

        pieData=new PieData();
        pieData.setValue(700);
        mData.add(pieData);

        pieView.setData(mData);
    }
}
