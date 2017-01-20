package com.zhouqi.ncist.nbanewsclient.View.MFragment.LoginAndLoad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.zhouqi.ncist.nbanewsclient.R;
import com.zhouqi.ncist.nbanewsclient.Utils.CheckUtils;
import com.zhouqi.ncist.nbanewsclient.model.dbmodel.DBLogin;

import java.util.List;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et_username;
    private EditText et_first;
    private EditText et_second;
    private Button bt_login;
    private String mName;
    private String mPsw1;
    private String mPsw2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    /**
     * 加载数据
     */
    private void initView() {
        et_username = (EditText) findViewById(R.id.et_login_username);
        et_first = (EditText) findViewById(R.id.et_login__first_password);
        et_second = (EditText) findViewById(R.id.et_login__second_password);
        bt_login = (Button) findViewById(R.id.bt_login);
        bt_login.setEnabled(false);
        bt_login.setOnClickListener(this);
        et_username.addTextChangedListener(mTextWatcher);
        et_first.addTextChangedListener(mTextWatcher);
        et_second.addTextChangedListener(mTextWatcher);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_login:
                if(CheckUtils.isEmail(mName)){
                    if(CheckUtils.CheckPassword(mPsw1,mPsw2)){
                        List<DBLogin> logins = CheckUtils.checkDBdata(mName);
                        if(logins.size()>0){
                            Toast.makeText(this, "用户已经注册", Toast.LENGTH_SHORT).show();
                        }else{
                            DBLogin dbLogin = new DBLogin();
                            dbLogin.setLoad(false);
                            dbLogin.setUsername(mName);
                            dbLogin.setPassword(mPsw1);
                            dbLogin.setLogin(true);
                            dbLogin.save();
                            Toast.makeText(this, "注册成功", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(LoginActivity.this,LoadActivity.class));
                            finish();
                        }
                    }else{
                        Toast.makeText(this, "两次密码输入不一致", Toast.LENGTH_SHORT).show();
                        et_second.setText("");
                    }
                }else{
                    Toast.makeText(this, "邮箱格式错误", Toast.LENGTH_SHORT).show();
                    et_username.setText("");
                }

        }

    }

    /**
     * 监听EditText内容的变化
     */
    private TextWatcher mTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            if(TextUtils.isEmpty(et_username.getText().toString())|TextUtils.isEmpty(et_first.getText().toString())|TextUtils.isEmpty(et_second.getText().toString())){
                bt_login.setEnabled(false);
            }else{
                bt_login.setEnabled(true);
                mName = et_username.getText().toString().trim();
                mPsw1 = et_first.getText().toString().trim();
                mPsw2 = et_second.getText().toString().trim();
            }
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
}
