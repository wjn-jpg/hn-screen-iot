package com.ntdq.hnscreen.build.command;

import com.ntdq.hnscreen.handler.mapping.PointMapping;

import java.util.LinkedList;
import java.util.List;

public class EnergyPLCExecutor implements CommandGenExecutor {

    private static final int FIRST_ADDRESS = 0;

    private final List<PointAttributeParse> pointAttributeParses = new LinkedList<>();


    private static PointMapping pointMapping;


    private static final long templateEnergy = 1628209117201903617L;

    public static void setPointMapping(PointMapping pointMapping) {
        EnergyPLCExecutor.pointMapping = pointMapping;
    }

    @Override
    public List<PointAttributeParse> getPointAttributeParseList() {
        return null;
    }
}
