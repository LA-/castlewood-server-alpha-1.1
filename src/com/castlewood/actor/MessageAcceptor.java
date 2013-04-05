package com.castlewood.actor;

/**
 * A {@link MessageAcceptor} accepts a {@link Message}. The
 * {@link MessageAcceptor} will then process and handle the {@link Message}.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 * @param <M>
 *            The {@link Message} type that the {@link MessageAcceptor} will
 *            accept.
 */
public interface MessageAcceptor<M extends Message>
{

	/**
	 * This is called when a {@link Message} is sent to the
	 * {@link MessageAcceptor}.
	 * 
	 * @param message
	 *            The {@link Message} being sent.
	 */
	public void accept(M message);

}
