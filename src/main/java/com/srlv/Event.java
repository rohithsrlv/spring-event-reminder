package com.srlv;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Event {
	
	private String eventName;
	private String eventAddress;
	private LocalTime startTime;
	private LocalTime endTime;
	private Signup signup;
	
public Event(@Value("${event.eventName}")String eventName,@Value("${event.eventAddress}") String eventAddress,@Value("${event.startTime}")LocalTime startTime,
		@Value("${event.endTime}")LocalTime endTime,Signup signup) {
		
		this.eventName = eventName;
		this.eventAddress = eventAddress;
		this.startTime =startTime;
		this.endTime =endTime;
		this.signup=signup;
		
	}
public String eventReminderWeb() {

    if (signup == null) {
        return "Try to address the signup issue....";
    }

    if (eventAddress == null || eventAddress.isBlank()) {
        return "Event address not yet decided....";
    }

    return signup.getName() + ", " + eventName +
            " will happen at " + eventAddress +
            " from " + startTime +
            " to " + endTime + ".";
}

//public void eventReminder() {
//	signup.greet();
//	
//	if(signup==null) {
//		System.out.println(" try to address the signup issue....");
//		return;}
//	
//	if(eventAddress==null) {
//		System.out.println(" Eventaddress not yet decided....");
//		return;
//	}
//	System.out.println(signup.getName()+", " +getEventName()  + 
//			" will happend at " + getEventAddress() + " at " + getStartTime() +
//			" pm to " + getEndTime() + " pm.");
//}
public String getEventName() {
	return eventName;
}
public void setEventName(String eventName) {
	this.eventName = eventName;
}
public String getEventAddress() {
	return eventAddress;
}
public void setEventAddress(String eventAddress) {
	this.eventAddress = eventAddress;
}
public LocalTime getStartTime() {
	return startTime;
}
public void setStartTime(LocalTime startTime) {
	this.startTime = startTime;
}
public LocalTime getEndTime() {
	return endTime;
}
public void setEndTime(LocalTime endTime) {
	this.endTime = endTime;
}


}
