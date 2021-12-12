package com.xxmicloxx.NoteBlockAPI.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.xxmicloxx.NoteBlockAPI.songplayer.SongPlayer;

public class PlayTickEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
	private boolean cancelled = false;
	private SongPlayer song;
	private Player player;
	
	public PlayTickEvent(SongPlayer song, Player player) {
		this.song = song;
		this.player = player;
	}
	
	@Override
	public boolean isCancelled() {
		return cancelled;
	}

	@Override
	public void setCancelled(boolean arg0) {
		this.cancelled = arg0;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	public SongPlayer getSongPlayer() {
		return song;
	}

	public Player getPlayer() {
		return player;
	}
}
