/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.transport.rest5_client.low_level.sniffer;

import co.elastic.clients.transport.rest5_client.low_level.Node;
import co.elastic.clients.transport.rest5_client.low_level.Rest5Client;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * {@link Rest5Client.FailureListener} implementation that allows to perform
 * sniffing on failure. Gets notified whenever a failure happens and uses a {@link Sniffer} instance
 * to manually reload hosts and sets them back to the {@link Rest5Client}. The {@link Sniffer} instance
 * needs to be lazily set through {@link #setSniffer(Sniffer)}.
 */
public class SniffOnFailureListener extends Rest5Client.FailureListener {

    private volatile Sniffer sniffer;
    private final AtomicBoolean set;

    public SniffOnFailureListener() {
        this.set = new AtomicBoolean(false);
    }

    /**
     * Sets the {@link Sniffer} instance used to perform sniffing
     * @throws IllegalStateException if the sniffer was already set, as it can only be set once
     */
    public void setSniffer(Sniffer sniffer) {
        Objects.requireNonNull(sniffer, "sniffer must not be null");
        if (set.compareAndSet(false, true)) {
            this.sniffer = sniffer;
        } else {
            throw new IllegalStateException("sniffer can only be set once");
        }
    }

    @Override
    public void onFailure(Node node) {
        if (sniffer == null) {
            throw new IllegalStateException("sniffer was not set, unable to sniff on failure");
        }
        sniffer.sniffOnFailure();
    }
}
