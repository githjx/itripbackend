package cn.solr;

import org.apache.solr.client.solrj.beans.Field;

public class Hotel {
    @Field("id")
    private Integer id;

    @Field("address")
    private String address;

    @Field("hotelName")
    private String hotelName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
}
