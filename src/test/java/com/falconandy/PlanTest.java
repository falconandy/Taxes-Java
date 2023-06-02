package com.falconandy;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlanTest {
    @Test
    public void testToJSONObject() throws JSONException {
        Plan testPlan = new Plan();
        String branch = "taxes-1";
        testPlan.setBranch(branch);
        JSONObject result = testPlan.toJSONObject();
        assertEquals(branch, result.getString("branch"));
    }
}
