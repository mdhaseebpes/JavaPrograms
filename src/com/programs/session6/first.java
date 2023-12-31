package com.programs.session6;


import udemy.CountStringArray;

public  class first{



    public void brush(){
        System.out.println("first class paint");
    }

   protected void color(){
        System.out.println("first class");
    }

    public void theInvalidCityErrorIsDisplayed() {
        String errorMsg;
        String okayBtnTxt;
        int i = 1;
        if (i > 2) {
            errorMsg = "Please enter a valid city name.";
            okayBtnTxt = "Okay";
            System.out.println("if block " +errorMsg +  " " + okayBtnTxt );
        } else {
            errorMsg = "Please enter the valid city name";
            okayBtnTxt = "OK";
            System.out.println("else block " +errorMsg +  " " + okayBtnTxt );
        }
    }

    public static void main(String[] args) {
        first fi = new first();
        fi.theInvalidCityErrorIsDisplayed();

        CountStringArray countStringArray = new CountStringArray();
        //countStringArray.dummy();

        String[] ar1 = {"Apple", "Orange", "Mango", "Apple", "Mango", "Orange", "Orange"};
        countStringArray.printCount(ar1);
        //System.out.println(name);



    }
}
