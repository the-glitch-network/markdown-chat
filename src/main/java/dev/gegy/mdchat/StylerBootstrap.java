package dev.gegy.mdchat;// Created 2022-04-03T02:46:38

import net.fabricmc.fabric.api.event.Event;
import org.commonmark.parser.Parser;

/**
 * @author KJP12
 * @since ${version}
 **/
public interface StylerBootstrap {
    /**
     * Bootstraps global TextStylers.
     *
     * @param parser The parser builder to extend.
     * @param styler The event bus to add node stylers to.
     */
    void bootstrap(Parser.Builder parser, Event<NodeStyler> styler);
}
