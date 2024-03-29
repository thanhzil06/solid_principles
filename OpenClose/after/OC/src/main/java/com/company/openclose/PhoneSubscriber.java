package com.company.openclose;

import java.util.List;

public class PhoneSubscriber extends Subscriber{

    @Override 
    public double calculateBill() {
        // only for learn - should not care as now
        // open for modification, as base class open for extension
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return totalDuration*baseRate/100;
    }

}