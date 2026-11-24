package com.xicor.practice;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

public final class PracticeScreen extends Screen {
    private boolean timingCoach = true;
    private boolean targetOverlay = true;

    public PracticeScreen() {
        super(Text.literal("Xicor Practice"));
    }

    @Override
    protected void init() {
        int cx = this.width / 2;
        int y = this.height / 2 - 35;

        addDrawableChild(ButtonWidget.builder(
            Text.literal("Timing coach: " + (timingCoach ? "ON" : "OFF")),
            button -> {
                timingCoach = !timingCoach;
                button.setMessage(Text.literal("Timing coach: " + (timingCoach ? "ON" : "OFF")));
            }
        ).dimensions(cx - 90, y, 180, 20).build());

        addDrawableChild(ButtonWidget.builder(
            Text.literal("Target overlay: " + (targetOverlay ? "ON" : "OFF")),
            button -> {
                targetOverlay = !targetOverlay;
                button.setMessage(Text.literal("Target overlay: " + (targetOverlay ? "ON" : "OFF")));
            }
        ).dimensions(cx - 90, y + 25, 180, 20).build());

        addDrawableChild(ButtonWidget.builder(
            Text.literal("Done"),
            button -> close()
        ).dimensions(cx - 90, y + 55, 180, 20).build());
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context, mouseX, mouseY, delta);
        context.drawCenteredTextWithShadow(textRenderer, title, width / 2, height / 2 - 65, 0xFFFFFF);
        super.render(context, mouseX, mouseY, delta);
    }

    @Override
    public boolean shouldPause() {
        return false;
    }
}
