package textimagemaker.hooyee.com.textimagemaker.main;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

import textimagemaker.hooyee.com.textimagemaker.R;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public  void btn(View view){
        switch (view.getId()){
            case R.id.text2image:
                Intent intent=new Intent(this, Text2ImgActivity.class);
                startActivity(intent);
                break;
            case R.id.hh2image:
                Intent intent2=new Intent(this, ShhActivity.class);
                startActivity(intent2);
                break;
        }
    }
}
