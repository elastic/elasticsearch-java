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

package co.elastic.clients.elasticsearch.connector;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: connector._types.SchedulingConfiguration

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#connector._types.SchedulingConfiguration">API
 *      specification</a>
 */
@JsonpDeserializable
public class SchedulingConfiguration implements JsonpSerializable {
	@Nullable
	private final ConnectorScheduling accessControl;

	@Nullable
	private final ConnectorScheduling full;

	@Nullable
	private final ConnectorScheduling incremental;

	// ---------------------------------------------------------------------------------------------

	private SchedulingConfiguration(Builder builder) {

		this.accessControl = builder.accessControl;
		this.full = builder.full;
		this.incremental = builder.incremental;

	}

	public static SchedulingConfiguration of(Function<Builder, ObjectBuilder<SchedulingConfiguration>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code access_control}
	 */
	@Nullable
	public final ConnectorScheduling accessControl() {
		return this.accessControl;
	}

	/**
	 * API name: {@code full}
	 */
	@Nullable
	public final ConnectorScheduling full() {
		return this.full;
	}

	/**
	 * API name: {@code incremental}
	 */
	@Nullable
	public final ConnectorScheduling incremental() {
		return this.incremental;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.accessControl != null) {
			generator.writeKey("access_control");
			this.accessControl.serialize(generator, mapper);

		}
		if (this.full != null) {
			generator.writeKey("full");
			this.full.serialize(generator, mapper);

		}
		if (this.incremental != null) {
			generator.writeKey("incremental");
			this.incremental.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SchedulingConfiguration}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SchedulingConfiguration> {
		@Nullable
		private ConnectorScheduling accessControl;

		@Nullable
		private ConnectorScheduling full;

		@Nullable
		private ConnectorScheduling incremental;

		/**
		 * API name: {@code access_control}
		 */
		public final Builder accessControl(@Nullable ConnectorScheduling value) {
			this.accessControl = value;
			return this;
		}

		/**
		 * API name: {@code access_control}
		 */
		public final Builder accessControl(
				Function<ConnectorScheduling.Builder, ObjectBuilder<ConnectorScheduling>> fn) {
			return this.accessControl(fn.apply(new ConnectorScheduling.Builder()).build());
		}

		/**
		 * API name: {@code full}
		 */
		public final Builder full(@Nullable ConnectorScheduling value) {
			this.full = value;
			return this;
		}

		/**
		 * API name: {@code full}
		 */
		public final Builder full(Function<ConnectorScheduling.Builder, ObjectBuilder<ConnectorScheduling>> fn) {
			return this.full(fn.apply(new ConnectorScheduling.Builder()).build());
		}

		/**
		 * API name: {@code incremental}
		 */
		public final Builder incremental(@Nullable ConnectorScheduling value) {
			this.incremental = value;
			return this;
		}

		/**
		 * API name: {@code incremental}
		 */
		public final Builder incremental(Function<ConnectorScheduling.Builder, ObjectBuilder<ConnectorScheduling>> fn) {
			return this.incremental(fn.apply(new ConnectorScheduling.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SchedulingConfiguration}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SchedulingConfiguration build() {
			_checkSingleUse();

			return new SchedulingConfiguration(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SchedulingConfiguration}
	 */
	public static final JsonpDeserializer<SchedulingConfiguration> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SchedulingConfiguration::setupSchedulingConfigurationDeserializer);

	protected static void setupSchedulingConfigurationDeserializer(
			ObjectDeserializer<SchedulingConfiguration.Builder> op) {

		op.add(Builder::accessControl, ConnectorScheduling._DESERIALIZER, "access_control");
		op.add(Builder::full, ConnectorScheduling._DESERIALIZER, "full");
		op.add(Builder::incremental, ConnectorScheduling._DESERIALIZER, "incremental");

	}

}
