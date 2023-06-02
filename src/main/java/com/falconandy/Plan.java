package com.falconandy;

import org.json.JSONException;
import org.json.JSONObject;

public class Plan {
    private String branch;

    private JSONObject jsonPlan;

    public Plan setBranch(String branch) {
        this.branch = branch;
        this.jsonPlan = null;
        return this;
    }

    public JSONObject toJSONObject() throws JSONException {
        if (this.jsonPlan != null) {
            return this.jsonPlan;
        }

        JSONObject plan = new JSONObject();
        plan.put("branch", branch);
        this.jsonPlan = plan;
        return plan;
    }
}
