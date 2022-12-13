package udemy;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomName {

    public static String  randomString(int count){
       return  RandomStringUtils.randomAlphabetic(count);
    }

    public static void main(String[] args) {
        System.out.println(randomString(5));

    }
}
