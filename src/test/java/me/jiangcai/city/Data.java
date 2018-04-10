package me.jiangcai.city;

import org.apache.commons.codec.binary.Hex;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.StreamUtils;

import java.io.IOException;

public class Data {
    @Test
    public void g1() throws IOException {
        // 装载并且打印这个文件
        byte[] data = StreamUtils.copyToByteArray(new ClassPathResource("/GetMarketSuccess.raw").getInputStream());

        // 打印它的hex 格式
        System.out.println(Hex.encodeHexString(data));
    }

    /**
     *
     */
    @Test
    public void p1() throws IOException {
        String[] names = new String[]{
                "login_0","login_1","event_0","setPlayer_0","getMarket_0"
        };
        for(String name:names){
            System.out.println(name);
            byte[] data = StreamUtils.copyToByteArray(new ClassPathResource("/p1/"+name+".raw").getInputStream());
            System.out.println(Hex.encodeHexString(data));
        }
    }
}
