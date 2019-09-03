package com.company;

public enum HTTPError {
    Bad_Request, Unauthorized, Payment_Required, Not_Found;

    public static String getErrorName(int errorNumber) {
        switch (errorNumber) {
            case 400:
                return Bad_Request.toString();
            case 401:
                return Unauthorized.toString();
            case 402:
                return Payment_Required.toString();
            case 404:
                return Not_Found.toString();
            default:
                System.out.println(errorNumber + " is incorrect");
                return "Incorrect number";
        }
    }
}
