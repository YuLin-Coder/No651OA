package com.njl.oa.shiro;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class EncryptionTest {

    @Test
    public void encryption(){
        String hashAlgorithmName = "MD5";//加密
        String credentials = "000000";//密码
        int hashIterations = 1024; //加密次数
        ByteSource bytes = ByteSource.Util.bytes("100003");//盐值
        Object obj = new SimpleHash(hashAlgorithmName, credentials, bytes, hashIterations);
        System.out.println(obj);
    }
}
