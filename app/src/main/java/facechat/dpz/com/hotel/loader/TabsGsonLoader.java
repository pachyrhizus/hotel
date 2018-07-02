package facechat.dpz.com.hotel.loader;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.VolleyHelper;
import com.google.gson.reflect.TypeToken;

import facechat.dpz.com.hotel.model.DisplayItem;
import facechat.dpz.com.hotel.model.GenericSubjectItem;


/**
 * Created by tv metro on 9/1/14.
 */
public class TabsGsonLoader extends BaseGsonLoader<GenericSubjectItem<DisplayItem>> {
    public static int LOADER_ID = 0x401;
    @Override
    public void setCacheFileName() {
        cacheFileName = "tabs_content.cache";
    }

    @Override
    public void setLoaderURL(DisplayItem item) {
        calledURL = "http://appstore.duokanbox.com/v2/app/home";
    }

    public TabsGsonLoader(Context context, DisplayItem item) {
        super(context, item);
    }

    @Override
    protected void loadDataByGson() {
        RequestQueue requestQueue = VolleyHelper.getInstance(getContext().getApplicationContext()).getAPIRequestQueue();
        GsonRequest<GenericSubjectItem<DisplayItem>> gsonRequest = new GsonRequest<GenericSubjectItem<DisplayItem>>(calledURL, new TypeToken<GenericSubjectItem<DisplayItem>>(){}.getType(), null, listener, errorListener);

        gsonRequest.setCacheNeed(getContext().getCacheDir() + "/" + cacheFileName);
        requestQueue.add(gsonRequest);
    }

}
