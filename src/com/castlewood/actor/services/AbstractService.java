package com.castlewood.actor.services;

import java.util.concurrent.TimeUnit;

import com.castlewood.Server;
import com.castlewood.actor.AbstractActor;
import com.castlewood.actor.Message;

/**
 * An {@link AbstractService} is a medium between {@link Message}s and the
 * {@link Server}.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 * @param <M>
 *            The type of {@link Message} this {@link AbstractService} accepts.
 */
public abstract class AbstractService<M extends Message> extends
		AbstractActor<M>
{

	/**
	 * A {@link AbstractService} runs on a cycle. The
	 * {@link AbstractService#delay()} represents the time in-between cycles in
	 * {@link TimeUnit#MILLISECONDS}.
	 * 
	 * @return The delay in {@link TimeUnit#MILLISECONDS}.
	 */
	public abstract int delay();

	/**
	 * This is called when a {@link AbstractService} is registered to the
	 * {@link Server}. The initialization process must be successful to be
	 * registered.
	 * 
	 * @return If the initialization was successful.
	 */
	public abstract boolean initiate();

	/**
	 * This is called when a {@link AbstractService} is removed from the
	 * {@link Server}. The shutdown process must be successful to be remove.
	 * 
	 * @return If the shutdown was successful.
	 */
	public abstract boolean shutdown();

}
