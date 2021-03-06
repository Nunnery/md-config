/**
 * This file is part of MythicDrops Configurator, licensed under the MIT License.
 *
 * Copyright (C) 2016 Richard Harrah
 *
 * Permission is hereby granted, free of charge,
 * to any person obtaining a copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software,
 * and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
 * OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.tealcubegames.minecraft.spigot.mythicdrops.configurator.health;

import com.codahale.metrics.health.HealthCheck;
import org.bukkit.ChatColor;

import java.util.Arrays;
import java.util.List;

public class ChatColorHealthCheck extends HealthCheck {
    @Override
    protected Result check() throws Exception {
        List<ChatColor> colorList = Arrays.asList(ChatColor.values());
        if (colorList.size() > 0 && colorList.size() == ChatColor.values().length) {
            return Result.healthy();
        }
        return Result.unhealthy("colorList is 0 or doesn't match ChatColor.values().length");
    }
}
