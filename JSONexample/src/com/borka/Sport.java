package com.borka;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Comp14 on 14/09/2017.
 */
public class Sport {

    String subject,image,time;

    public Sport(JSONObject object) {

        try {
            this.image=object.getString("image");
            this.subject=object.getString("subject");
            this.time=object.getString("time");
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
