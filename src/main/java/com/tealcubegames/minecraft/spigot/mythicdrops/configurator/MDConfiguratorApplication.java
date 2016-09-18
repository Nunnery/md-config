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
package com.tealcubegames.minecraft.spigot.mythicdrops.configurator;

import com.tealcubegames.minecraft.spigot.mythicdrops.configurator.health.ChatColorHealthCheck;
import com.tealcubegames.minecraft.spigot.mythicdrops.configurator.resources.ChatColorResource;
import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.configuration.EnvironmentVariableSubstitutor;
import io.dropwizard.configuration.SubstitutingSourceProvider;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class MDConfiguratorApplication extends Application<MDConfiguratorConfiguration> {

    public static void main(String[] args) throws Exception {
        new MDConfiguratorApplication().run(args);
    }

    @Override
    public String getName() {
        return "MythicDrops-Configurator";
    }

    @Override
    public void initialize(Bootstrap<MDConfiguratorConfiguration> bootstrap) {
        bootstrap.addBundle(new AssetsBundle("/ui", "/", "index.html"));
        bootstrap.setConfigurationSourceProvider(
                new SubstitutingSourceProvider(
                        bootstrap.getConfigurationSourceProvider(), new EnvironmentVariableSubstitutor(false)));
    }

    @Override
    public void run(MDConfiguratorConfiguration configuration, Environment environment) {
        environment.jersey().setUrlPattern("/api/*");
        environment.jersey().register(new ChatColorResource());
        environment.healthChecks().register("chatColor", new ChatColorHealthCheck());
    }

}
