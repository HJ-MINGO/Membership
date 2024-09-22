package com.membership.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

/**
 * packageName    : com.membership.entity
 * fileName       : TestClass
 * author         : NAHAEJUN
 * date           : 2024-09-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-16        NAHAEJUN              최초생성
 */
public class TestClass {


    class FileColor {
        private final String r;
        private final String g;
        private final String b;
        private final Retctangle shape;

        public FileColor(String r, String g, String b, Retctangle shape) {
            this.r = r;
            this.g = g;
            this.b = b;
            this.shape = shape;
        }


        public String toString() {
            return "r : "+ r + ", g = " + g + ",  b =" + b + ",  sahpe = " + shape.getHeight() + ", " + shape.getWidth();
        }
    }
    @EqualsAndHashCode
    class Color {
        public final int r;
        public final int g;
        public final int b;

        public Color(int r, int g, int b) {
            this.r = r;
            this.g = g;
            this.b = b;
        }

        public String toHex() {
            return String.format("#%02x%02x%02x", r, g, b);
        }

    }


    class Retctangle {
        private int width;
        private int height;

        public Retctangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        private void setWidth(int width) {
            this.width = width;
        }

        private void setHeight(int height) {
            this.height = height;
        }

        public int getHeight() {
            return this.height;
        }
        public int getWidth() {
            return this.width;
        }
    }

    public static void main(String[] args) {

        Retctangle retctangle =  new TestClass().new Retctangle(10,20);
        FileColor fileColor =  new TestClass().new FileColor("r", "g", "b", retctangle);

        System.out.println(fileColor.toString());

        retctangle.setHeight(30);
        retctangle.setHeight(50);

        System.out.println(fileColor.toString());


        UserInfo userInfo =  new TestClass().new UserInfo(1,20_000);
        UserInfo userInfo2 =  userInfo.withLevel(70_000);

        System.out.println(userInfo == userInfo2);

    }

    @AllArgsConstructor
    class AccountInfo {
        private final long mileage;

        public AccountLevel getLevel(){
            if (mileage > 100_000) return AccountLevel.DIAMOND;
            else if (mileage > 50_000) return AccountLevel.GOLD;
            else if (mileage > 30_000) return AccountLevel.SILVER;
            else if (mileage > 10_000) return AccountLevel.BRONZE;
            else return AccountLevel.NONE;
        }

        public AccountInfo withLevel(long mileage){
            return new AccountInfo(mileage);
        }
    }


    class UserInfo {
        private final long id;
        private final long mileage;

        public UserInfo(long id, long mileage) {
            this.id = id;
            this.mileage = mileage;
        }

        public AccountLevel getLevel(){
            if (mileage > 100_000) return AccountLevel.DIAMOND;
            else if (mileage > 50_000) return AccountLevel.GOLD;
            else if (mileage > 30_000) return AccountLevel.SILVER;
            else if (mileage > 10_000) return AccountLevel.BRONZE;
            else return AccountLevel.NONE;
        }

        public UserInfo withLevel(long mileage){
            return new UserInfo(this.id,mileage);
        }
    }

    enum AccountLevel {
        DIAMOND,
        GOLD,
        SILVER,
        BRONZE,
        NONE;
    }

}
