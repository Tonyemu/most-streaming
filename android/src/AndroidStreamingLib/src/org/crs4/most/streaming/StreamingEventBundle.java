/*
 * Project MOST - Moving Outcomes to Standard Telemedicine Practice
 * http://most.crs4.it/
 *
 * Copyright 2014, CRS4 srl. (http://www.crs4.it/)
 * Dual licensed under the MIT or GPL Version 2 licenses.
 * See license-GPLv2.txt or license-MIT.txt
 */

package org.crs4.most.streaming;

import org.crs4.most.streaming.enums.StreamingEvent;
import org.crs4.most.streaming.enums.StreamingEventType;


public class StreamingEventBundle {

	 
	private StreamingEventType eventType = null;
	private StreamingEvent event = null;
	private String info = null;
	private Object data = null;
	
	/**
	 * This object contains all the informations of a Stream Event triggered by the Streaming Library
	 * @param eventType the type of this event
	 * @param event the event
	 * @param info a textual information describing this event
	 * @param data a generic object containing event-specific informations (the object type depends on the type of the event)
	 */
	public StreamingEventBundle(StreamingEventType eventType, StreamingEvent event, String info, Object data)
	{
		this.eventType = eventType;
		this.event = event;
		this.info = info;
		this.data = data;
	}

	/**
	 * Get the event type
	 * @return the event type
	 */
	public StreamingEventType getEventType() {
		return eventType;
	}

	public StreamingEvent getEvent() {
		return event;
	}

	/**
	 * Get a textual description of this event
	 * @return a textual description of this event
	 */
	public String getInfo() {
		return info;
	}

	/**
	 * Get a generic object containing event-specific informations (the object type depends on the type of the event)
	 * @return a generic object containing event-specific informations
	 */
	public Object getData() {
		return data;
	}
}
