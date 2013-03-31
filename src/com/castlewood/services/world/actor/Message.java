package com.castlewood.services.world.actor;

/**
 * A {@link Message} is a packet of data for a {@link MessageAcceptor} to
 * accept. The {@link Message} contains a corresponding {@link MessageAcceptor}
 * {@link Class} that will accept this type of {@link Message}.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public interface Message
{

	/**
	 * The {@link Message} must have a corresponding {@link MessageAcceptor}
	 * {@link Class} that can accept this type of {@link Message}.
	 * 
	 * @return The {@link MessageAcceptor} {@link Class}.
	 */
	public Class<? extends MessageAcceptor<?>> acceptor();

}
