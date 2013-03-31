package com.castlewood.services.world.actor;

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
public class MessageAcceptorCarrier extends AbstractActor
{

	/**
	 * This holds the {@link MessageAcceptor}s for this
	 * {@link MessageAcceptorCarrier}.
	 */
	private Map<Class<? extends MessageAcceptor<?>>, MessageAcceptor<? extends Message>> acceptors = new HashMap<>();

	/**
	 * A {@link MessageAcceptorCarrier} can be created with a predetermined set
	 * of {@link MessageAcceptor}s.
	 * 
	 * @param acceptors
	 *            The {@link MessageAcceptor}s to register when the
	 *            {@link MessageAcceptorCarrier} is created.
	 */
	public MessageAcceptorCarrier(
			MessageAcceptor<? extends Message>[] acceptors)
	{
		for (MessageAcceptor<? extends Message> acceptor : acceptors)
		{
			register(acceptor);
		}
	}

	@Override
	protected void evaluate(Message message)
	{
		MessageAcceptor<Message> acceptor = (MessageAcceptor<Message>) acceptors
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
	public void register(MessageAcceptor<? extends Message> acceptor)
	{
		acceptors.put(
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
	public void remove(Class<? extends MessageAcceptor<? extends Message>> type)
	{
		acceptors.remove(type);
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
			Class<A> type)
	{
		return (A) acceptors.get(type);
	}

}
