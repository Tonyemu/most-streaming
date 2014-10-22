/*!
 * Project MOST - Moving Outcomes to Standard Telemedicine Practice
 * http://most.crs4.it/
 *
 * Copyright 2014, CRS4 srl. (http://www.crs4.it/)
 * Dual licensed under the MIT or GPL Version 2 licenses.
 * See license-GPLv2.txt or license-MIT.txt
 */

package org.crs4.most.streaming;



import org.crs4.most.streaming.enums.StreamState;
import android.view.SurfaceView;

/**
 * An IStream object represents a single audio/video stream object. You can obtain a new IStream object by calling
 * the method {@link StreamingLib#createStream(java.util.HashMap, android.os.Handler)}.
 *
 */
public interface IStream {
	
	 
    /**
     * 
     * @return the name of this stream
     */
    public String getName();
    
    
    /**
     * 
     * @return the current state of this stream
     */
    public StreamState getState();
    
    
    
    /**
	 * Prepare the stream by providing a video surface
	 * @param surfaceView the Surface where to render the stream
	 *
	 */
	public void prepare(SurfaceView surface);
	
    /**
     * Play the stream
     */
	public void play() ;
	
	/**
	 * pause the stream
	 */
	public void pause();
	
	/**
	 * Update the uri of the stream
	 * @param uri the new uri
	 */
	public void setUri(String uri);
	
	/**
     * Get the current value of latency property of this stream (Reads the value from native code to be sure to return the effective latency value)
     * @return the latency value in ms
     */
	public int getLatency();
	
	/**
	 * Destroy this stream
	 */
	public void destroy();

}

