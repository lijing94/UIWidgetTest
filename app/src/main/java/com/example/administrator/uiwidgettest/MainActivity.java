package com.example.administrator.uiwidgettest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button;
    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)  findViewById(R.id.button);
        button.setOnClickListener(this);        //要加implements View.OnClickListener才能用this

        editText = (EditText) findViewById(R.id.edit_text);

        imageView = (ImageView) findViewById(R.id.image_view);

        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
    }
    @Override
    public void onClick(View v) {
        //在此处添加逻辑
        //从editText处得到内容
        switch(v.getId()){
            case R.id.button :
                String inputText = editText.getText().toString();
                Toast.makeText(MainActivity.this, inputText, Toast.LENGTH_SHORT).show();
                imageView.setImageResource(R.drawable.jelly_bean);
                //if(progressBar.getVisibility() == View.GONE){
                //    progressBar.setVisibility(View.VISIBLE);
                //} else {
                //    progressBar.setVisibility(View.GONE);
                //}
                int progress = progressBar.getProgress();
                progress = progress + 10;
                progressBar.setProgress(progress);
                break;
            default:
                break;
        }


    }
}
