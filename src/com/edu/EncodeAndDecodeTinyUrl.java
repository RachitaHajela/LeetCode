package com.edu;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by Rachita on 10/7/2017.
 */
public class EncodeAndDecodeTinyUrl {

    public class Codec {
        String alphabet = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        HashMap<String, String> map = new HashMap<>();
        Random rand = new Random();
        String key = getRand();

        public String getRand() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                sb.append(alphabet.charAt(rand.nextInt(62)));
            }
            return sb.toString();
        }

        public String encode(String longUrl) {
            while (map.containsKey(key)) {
                key = getRand();
            }
            map.put(key, longUrl);
            return "http://tinyurl.com/" + key;
        }

        public String decode(String shortUrl) {
            return map.get(shortUrl.replace("http://tinyurl.com/", ""));
        }
    }
}
