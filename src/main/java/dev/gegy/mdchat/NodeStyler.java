package dev.gegy.mdchat;// Created 2022-04-03T02:52:00

import net.minecraft.text.MutableText;
import org.commonmark.node.Node;
import org.jetbrains.annotations.Nullable;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author KJP12
 * @since ${version}
 **/
public interface NodeStyler {
    Function<NodeStyler[], NodeStyler> EVENT_INVOKER = callbacks -> (node, textSupplier) -> {
        for (NodeStyler styler : callbacks) {
            MutableText text = styler.style(node, textSupplier);
            if (text != null) return text;
        }
        return null;
    };

    /**
     * Styles the given markdown node & formatted child text into Minecraft-formatted text.
     *
     * @param node         The markdown node to format.
     * @param textSupplier The supplier for the child nodes.
     * @return If handled, a maybe formatted Minecraft text node, else null.
     */
    @Nullable MutableText style(Node node, Supplier<MutableText> textSupplier);
}
