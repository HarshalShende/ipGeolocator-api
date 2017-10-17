package com.ipgeolocation.api;

public class IpApi {
    private String time_zone;

    private String region_name;

    private String metro_code;

    private String zip_code;

    private String region_code;

    private String longitude;

    private String latitude;

    private String country_code;

    private String country_name;

    private String city;

    private String ip;

    public String getTime_zone() {
        return time_zone;
    }

    public void setTime_zone(String time_zone) {
        this.time_zone = time_zone;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }

    public String getMetro_code() {
        return metro_code;
    }

    public void setMetro_code(String metro_code) {
        this.metro_code = metro_code;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getRegion_code() {
        return region_code;
    }

    public void setRegion_code(String region_code) {
        this.region_code = region_code;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return   (char)27 + "[36m\n[!] time_zone = " + time_zone
                + "\n[!] region_name = " + region_name
                + (char)27 + "[31m"+"\n[!] metro_code = " + metro_code
                + "\n[!] zip_code = " + zip_code
                + "\n[!] region_code = " + region_code+(char)27+"[0m"
                + (char)27+"[32m"+"\n[!] longitude = " + longitude
                + "\n[!] latitude = " + latitude+(char)27+"[0m"
                + (char)27+"[33m"+"\n[!] country_code = " + country_code
                +"\n[!] country_name = " + country_name+(char)27+"[0m"
                +  (char)27+"[34m"+"\n[!] city = " + city
                + "\n[!] ip = " + ip+(char)27+"[0m";
    }
}
