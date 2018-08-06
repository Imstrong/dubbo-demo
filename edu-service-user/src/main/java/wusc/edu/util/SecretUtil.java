package wusc.edu.util;

import com.alibaba.druid.filter.config.ConfigTools;

public class SecretUtil {
    public static String encryptPassword(String password) throws Exception{
        return ConfigTools.encrypt(password);
    }
    public static void main(String[] args)throws Exception{
        System.out.println(encryptPassword("123456"));
    }
}
