package com.zhouqi.ncist.nbanewsclient.Utils;

import com.zhouqi.ncist.nbanewsclient.model.dbmodel.DBLogin;

import org.litepal.crud.DataSupport;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by z on 2017/1/19.
 *正则表达式判断
 */

public class CheckUtils {
    /**
     * 判断邮箱格式
     * @param email  邮箱字符串
     * @return  布尔值 FALSE 为不是邮箱格式 TRUE为邮箱格式
     */
    public static boolean isEmail(String email){
        if (null==email || "".equals(email)) return false;
        //Pattern p = Pattern.compile("\\w+@(\\w+.)+[a-z]{2,3}"); //简单匹配
        //邮箱格式
        String str = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
//        Pattern p =  Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");//复杂匹配
        Pattern pattern = Pattern.compile(str);
        Matcher m = pattern.matcher(email);
        return m.matches();
    }

    /**
     * 检查两次输入密码
     * @param password1  第一次输入密码
      * @param password2  第二次输入密码
     * @return
     */
    public static  boolean  CheckPassword(String password1,String password2){
        if(password1.equals(password2)){
            return  true;
        }else{
            return  false ;
        }
    }

    /**
     * 查询数据库中的注册的信息
     */
    public  static List<DBLogin>  checkDBdata(String username){
        return  DataSupport.where("username= ? ",username).find(DBLogin.class);
    }
}
