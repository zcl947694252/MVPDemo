package com.example.mvpdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mvpdemo.presenter.LoginPresenter;
import com.example.mvpdemo.view.LoginView;

public class MainActivity extends AppCompatActivity implements LoginView, View.OnClickListener {

    private EditText name;
    private EditText pwd;
    private LoginPresenter presenter;
    private int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         name = findViewById(R.id.username);
         pwd = findViewById(R.id.pwd);

         presenter = new LoginPresenter(this);

        findViewById(R.id.loginBtn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        presenter.login(name.getText().toString(),pwd.getText().toString());
    }

    @Override
    public void loginSuccess() {
        count++;
        if (count%2==1)
            Toast.makeText(getApplicationContext(), "哈哈哈 天生我材必有用", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(getApplicationContext(), "有朋自远方来不亦乐乎", Toast.LENGTH_LONG).show();
    }

    @Override
    public void loginLoading() {
        Toast.makeText(getApplicationContext(), "1 - 2 - 3 准备进入", Toast.LENGTH_LONG).show();
    }

    @Override
    public void loginFail() {
        count++;
       if (count%2==1)
           Toast.makeText(getApplicationContext(), "悲哀啊 天要亡我,非战之罪", Toast.LENGTH_LONG).show();
       else
           Toast.makeText(getApplicationContext(), "有朋自远方来必诛之", Toast.LENGTH_LONG).show();
    }
}
