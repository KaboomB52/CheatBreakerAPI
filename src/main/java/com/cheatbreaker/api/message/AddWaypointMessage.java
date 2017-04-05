package com.cheatbreaker.api.message;

import com.cheatbreaker.api.object.CBWaypoint;
import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class AddWaypointMessage implements CBMessage {

    private final CBWaypoint waypoint;

    public AddWaypointMessage(CBWaypoint waypoint) {
        this.waypoint = waypoint;
    }

    @Override
    public String getAction() {
        return "addwaypoint";
    }

    @Override
    public Map<String, Object> toMap() {
        return ImmutableMap.of(
                "name", waypoint.getName(),
                "xyz", waypoint.getX() + "," + waypoint.getY() + "," + waypoint.getZ(),
                "dimension", waypoint.getDimension()
        );
    }

}