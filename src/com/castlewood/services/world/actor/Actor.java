package com.castlewood.services.world.actor;

/**
 * An {@link Actor} is a {@link MessageAcceptor} where the {@link Message}s are
 * stored. The {@link Message}s are then evaluated one by one at a given time.
 * An {@link Actor} accepts all types of {@link Message}s.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public interface Actor extends MessageAcceptor<Message>
{

	/**
	 * This should be called when an {@link Actor} should process and handle its
	 * stored {@link Message}s.
	 */
	public void evalute();

}
