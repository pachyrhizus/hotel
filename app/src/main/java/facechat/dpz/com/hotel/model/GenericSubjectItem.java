package facechat.dpz.com.hotel.model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import facechat.dpz.com.hotel.utils.DateFormate;

/**
 * Created by liuhuadong on 9/23/14.
 */
public class GenericSubjectItem<T> implements Serializable {
    private static final long serialVersionUID = 2L;
    public ArrayList<GenericAlbum<T>>  data;
    public long                        update_time;
    public Preload                     preload;
    public String                      base_url;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nGenericSubjectItem: update_time=" + DateFormate.dateToString(new Date(update_time)));
        sb.append("\n");
        return  sb.toString();
    }
}

