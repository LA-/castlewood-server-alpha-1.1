package com;

import com.castlewood.actor.services.world.entity.Entity;
import com.castlewood.actor.services.world.entity.Location;
import com.castlewood.actor.services.world.entity.mobile.Direction;
import com.castlewood.actor.services.world.entity.mobile.Directions;
import com.castlewood.actor.services.world.entity.mobile.MobileEntity;
import com.castlewood.actor.services.world.message.LocationChangeMessage;
import com.castlewood.actor.services.world.message.LocationTranslationMessage;
import com.castlewood.actor.services.world.message.PrimaryDirectionMessage;
import com.castlewood.actor.services.world.message.SecondaryDirectionMessage;

public class Test
{

	public static void main(final String... args)
	{
		Entity entity = new MobileEntity();
		Location location = entity.acceptor(Location.class);
		Directions directions = entity.acceptor(Directions.class);
		entity.accept(new LocationChangeMessage(333, 444, 555));
		entity.accept(new LocationTranslationMessage(1, 1, 1));
		entity.accept(new PrimaryDirectionMessage(Direction.NORTH));
		entity.accept(new SecondaryDirectionMessage(Direction.SOUTH));
		entity.evalute();
		System.out.println("Location: [" + location.x() + ", " + location.y()
				+ ", " + location.height() + "]");
		System.out.println("Directions: [" + directions.primary() + ", "
				+ directions.secondary() + "]");
	}
	
}
