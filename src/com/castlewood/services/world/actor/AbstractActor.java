package com.castlewood.services.world.actor;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * A {@link AbstractActor} is a simple implementation of an {@link Actor}. It
 * performs simple actions such as storing {@link Message}s and looping through
 * them when {@link Actor#evalute()} is called.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public abstract class AbstractActor implements Actor
{

	/**
	 * The {@link AbstractActor#inbox} holds {@link Message}s. This is used a
	 * {@link ConcurrentLinkedQueue} to ensure order as well as keeping the
	 * {@link AbstractActor} concurrent.
	 */
	private Queue<Message> inbox = new ConcurrentLinkedQueue<>();

	@Override
	public void accept(Message message)
	{
		inbox.offer(message);
	}

	@Override
	public void evalute()
	{
		Message message;
		while ((message = inbox.poll()) != null)
		{
			evaluate(message);
		}
	}

	/**
	 * This is used by the extending class. The extending class will have to
	 * evaluate a {@link Message} one at a time.
	 * 
	 * @param message
	 *            The {@link Message} to evaluate.
	 */
	protected abstract void evaluate(Message message);

}
