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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.Monitoring
@JsonpDeserializable
public final class Monitoring extends Base {
	private final boolean collectionEnabled;

	private final Map<String, Long> enabledExporters;

	// ---------------------------------------------------------------------------------------------

	public Monitoring(Builder builder) {
		super(builder);

		this.collectionEnabled = Objects.requireNonNull(builder.collectionEnabled, "collection_enabled");
		this.enabledExporters = ModelTypeHelper.unmodifiableNonNull(builder.enabledExporters, "enabled_exporters");

	}

	public Monitoring(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code collection_enabled}
	 */
	public boolean collectionEnabled() {
		return this.collectionEnabled;
	}

	/**
	 * API name: {@code enabled_exporters}
	 */
	public Map<String, Long> enabledExporters() {
		return this.enabledExporters;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);

		generator.writeKey("collection_enabled");
		generator.write(this.collectionEnabled);

		generator.writeKey("enabled_exporters");
		generator.writeStartObject();
		for (Map.Entry<String, Long> item0 : this.enabledExporters.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Monitoring}.
	 */
	public static class Builder extends Base.AbstractBuilder<Builder> implements ObjectBuilder<Monitoring> {
		private Boolean collectionEnabled;

		private Map<String, Long> enabledExporters;

		/**
		 * API name: {@code collection_enabled}
		 */
		public Builder collectionEnabled(boolean value) {
			this.collectionEnabled = value;
			return this;
		}

		/**
		 * API name: {@code enabled_exporters}
		 */
		public Builder enabledExporters(Map<String, Long> value) {
			this.enabledExporters = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #enabledExporters(Map)}, creating the map if
		 * needed.
		 */
		public Builder putEnabledExporters(String key, Long value) {
			if (this.enabledExporters == null) {
				this.enabledExporters = new HashMap<>();
			}
			this.enabledExporters.put(key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Monitoring}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Monitoring build() {

			return new Monitoring(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Monitoring}
	 */
	public static final JsonpDeserializer<Monitoring> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Monitoring::setupMonitoringDeserializer, Builder::build);

	protected static void setupMonitoringDeserializer(DelegatingDeserializer<Monitoring.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::collectionEnabled, JsonpDeserializer.booleanDeserializer(), "collection_enabled");
		op.add(Builder::enabledExporters, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.longDeserializer()),
				"enabled_exporters");

	}

}
