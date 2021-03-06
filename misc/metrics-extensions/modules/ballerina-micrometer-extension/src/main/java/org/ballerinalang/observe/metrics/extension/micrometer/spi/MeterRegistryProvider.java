/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.ballerinalang.observe.metrics.extension.micrometer.spi;

import io.micrometer.core.instrument.MeterRegistry;

/**
 * This represents the Java SPI interface for {@link MeterRegistry} providers.
 */
public interface MeterRegistryProvider {

    /**
     * Returns a unique name of the {@link MeterRegistry} Provider.
     *
     * @return the Meter Registry name.
     */
    String getName();

    /**
     * Returns a new {@link MeterRegistry} to be used with Micrometer Metrics.
     *
     * @return A new {@link MeterRegistry}.
     */
    MeterRegistry get();

}
