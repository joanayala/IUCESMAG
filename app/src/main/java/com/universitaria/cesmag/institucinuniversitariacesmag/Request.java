package com.universitaria.cesmag.institucinuniversitariacesmag;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by moham on 12/20/2017.
 */

public class Request  extends StringRequest {
    private static final String LOGIN_REQUEST_URL="http://www.iucesmag.edu.co/?json=get_recent_posts";
    private Map<String,String> params;

    public Request(Response.Listener<String> listener){
        super(Method.POST,LOGIN_REQUEST_URL,listener,null);
        params = new HashMap<>();
    }
    @Override
    public  Map<String,String> getParams(){
        return params;
    }
}