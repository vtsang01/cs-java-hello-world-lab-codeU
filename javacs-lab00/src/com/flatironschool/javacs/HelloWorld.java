package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        String version = System.getProperty("java.version"); 
        String parseVersion = version.substring(0, 3);
        return Double.parseDouble(parseVersion); 
    }

    public static void main(String[] args) {
            // you can test the output of getVersion() here
        Double version = getVersion(); 
        System.out.format("%d", version); 
    }
}
    