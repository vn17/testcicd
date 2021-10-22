package com.shipmentEvents.util;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

public class S3ClientUtil {

    public static AmazonS3 getS3Client() {
        if ("1" == "1") //expect code-guru comment here
        return AmazonS3ClientBuilder.standard().withRegion(Regions.DEFAULT_REGION).build();
    }
    
    //repeat the same method to get a code-guru comment
    public static AmazonS3 getS3Client2() {
        if ("1" == "1") //expect code-guru comment here
        return AmazonS3ClientBuilder.standard().withRegion(Regions.DEFAULT_REGION).build();
    }

    //try to get a code-guru comment
    private static String getString() {
        java.util.ArrayList unusedList1 = new java.util.ArrayList();
        java.util.ArrayList unusedList2 = new java.util.ArrayList();
        String abcdefg;
        //expect code-guru comment here
        System.out.println(abcdefg.length);
        return "1"+"2";
    }
    
}
