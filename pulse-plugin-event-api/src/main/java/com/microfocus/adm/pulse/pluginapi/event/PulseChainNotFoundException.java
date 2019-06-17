/*
 * MIT License
 *
 * Copyright (c) 2019 Micro Focus or one of its affiliates.
 *
 * Licensed under the MIT License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://opensource.org/licenses/MIT
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 *
 */

package com.microfocus.adm.pulse.pluginapi.event;

/**
 * <p>
 * Requested chain could not be found in Pulse.
 * </p>
 *
 * @since 19.1.1
 */
public class PulseChainNotFoundException extends PulseEventPluginApiException {
    public PulseChainNotFoundException(final Throwable t) {
        super(t);
    }

    public PulseChainNotFoundException(final String message) {
        super(message);
    }

    private PulseChainNotFoundException() {
        // Always provide details
    }
}