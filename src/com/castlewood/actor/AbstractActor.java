package com.castlewood.actor;

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
public abstract class AbstractActor<M extends Message> implements Actor<M>
{

	/**
	 * The {@link AbstractActor#inbox} holds {@link Message}s. This is used a
	 * {@link ConcurrentLinkedQueue} to ensure order as well as keeping the
	 * {@link AbstractActor} concurrent.
	 */
	private final Queue<M> inbox = new ConcurrentLinkedQueue<>();

	@Override
	public void accept(final M message)
	{
		this.inbox.offer(message);
	}

	@Override
	public void evalute()
	{
		M message;
		while ((message = this.inbox.poll()) != null)
		{
			this.evaluate(message);
		}
	}

	/**
	 * This is used by the extending class. The extending class will have to
	 * evaluate a {@link Message} one at a time.
	 * 
	 * @param message
	 *            The {@link Message} to evaluate.
	 */
	protected abstract void evaluate(M message);

}
