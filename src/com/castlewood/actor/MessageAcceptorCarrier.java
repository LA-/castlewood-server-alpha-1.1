package com.castlewood.actor;

import java.util.HashMap;
import java.util.Map;

/**
 * A {@link MessageAcceptorCarrier} is an {@link AbstractActor} with a map of
 * {@link MessageAcceptor}s. A {@link Message} is evaluated by getting the
 * corresponding {@link MessageAcceptor} and sending the message to it.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class MessageAcceptorCarrier extends AbstractActor<Message>
{

	/**
	 * This holds the {@link MessageAcceptor}s for this
	 * {@link MessageAcceptorCarrier}.
	 */
	protected final Map<Class<? extends MessageAcceptor<?>>, MessageAcceptor<? extends Message>> acceptors = new HashMap<>();

	/**
	 * A {@link MessageAcceptorCarrier} can be created with a predetermined set
	 * of {@link MessageAcceptor}s.
	 * 
	 * @param acceptors
	 *            The {@link MessageAcceptor}s to register when the
	 *            {@link MessageAcceptorCarrier} is created.
	 */
	public MessageAcceptorCarrier(
			final MessageAcceptor<? extends Message>[] acceptors)
	{
		for (final MessageAcceptor<? extends Message> acceptor : acceptors)
		{
			this.register(acceptor);
		}
	}

	@Override
	protected void evaluate(final Message message)
	{
		final MessageAcceptor<Message> acceptor = (MessageAcceptor<Message>) this.acceptors
				.get(message.acceptor());
		acceptor.accept(message);
	}

	/**
	 * This registers a single {@link MessageAcceptor} to this
	 * {@link MessageAcceptorCarrier}.
	 * 
	 * @param acceptor
	 *            The {@link MessageAcceptor} to register.
	 */
	public void register(final MessageAcceptor<? extends Message> acceptor)
	{
		this.acceptors.put(
				(Class<? extends MessageAcceptor<?>>) acceptor.getClass(),
				acceptor);
	}

	/**
	 * This removes a {@link MessageAcceptor} from this
	 * {@link MessageAcceptorCarrier}.
	 * 
	 * @param type
	 *            The {@link Class} of the {@link MessageAcceptor} to remove.
	 */
	public void remove(
			final Class<? extends MessageAcceptor<? extends Message>> type)
	{
		this.acceptors.remove(type);
	}

	/**
	 * This gets a {@link MessageAcceptor} that is being held by this
	 * {@link MessageAcceptorCarrier}.
	 * 
	 * @param type
	 *            The {@link Class} of the {@link MessageAcceptor}.
	 * @return The corresponding {@link MessageAcceptor}.
	 */
	public <A extends MessageAcceptor<? extends Message>> A acceptor(
			final Class<A> type)
	{
		return (A) this.acceptors.get(type);
	}

}
