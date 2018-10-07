package ru.skoltech.smartchairservice.model;

import java.util.*;

/**
 * @author rost.
 */
public class CanvasResponse {

    static public List<List<Map<Object, Object>>> generateSimpleValues(){
        List<Map<Object, Object>>result = new ArrayList<Map<Object, Object>>() ;
        result.add(new HashMap<Object, Object>(){{
            put("x", "1");
            put("y", "1");
        }});
        result.add(new HashMap<Object, Object>(){{
            put("x", "2");
            put("y", "2");
        }});

        return Collections.singletonList(result);
    }
}
