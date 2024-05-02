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
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
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

// typedef: connector._types.CustomScheduling

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#connector._types.CustomScheduling">API
 *      specification</a>
 */
@JsonpDeserializable
public class CustomScheduling implements JsonpSerializable {
	private final CustomSchedulingConfigurationOverrides configurationOverrides;

	private final boolean enabled;

	private final String interval;

	@Nullable
	private final DateTime lastSynced;

	private final String name;

	// ---------------------------------------------------------------------------------------------

	private CustomScheduling(Builder builder) {

		this.configurationOverrides = ApiTypeHelper.requireNonNull(builder.configurationOverrides, this,
				"configurationOverrides");
		this.enabled = ApiTypeHelper.requireNonNull(builder.enabled, this, "enabled");
		this.interval = ApiTypeHelper.requireNonNull(builder.interval, this, "interval");
		this.lastSynced = builder.lastSynced;
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");

	}

	public static CustomScheduling of(Function<Builder, ObjectBuilder<CustomScheduling>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code configuration_overrides}
	 */
	public final CustomSchedulingConfigurationOverrides configurationOverrides() {
		return this.configurationOverrides;
	}

	/**
	 * Required - API name: {@code enabled}
	 */
	public final boolean enabled() {
		return this.enabled;
	}

	/**
	 * Required - API name: {@code interval}
	 */
	public final String interval() {
		return this.interval;
	}

	/**
	 * API name: {@code last_synced}
	 */
	@Nullable
	public final DateTime lastSynced() {
		return this.lastSynced;
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
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

		generator.writeKey("configuration_overrides");
		this.configurationOverrides.serialize(generator, mapper);

		generator.writeKey("enabled");
		generator.write(this.enabled);

		generator.writeKey("interval");
		generator.write(this.interval);

		if (this.lastSynced != null) {
			generator.writeKey("last_synced");
			this.lastSynced.serialize(generator, mapper);
		}
		generator.writeKey("name");
		generator.write(this.name);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CustomScheduling}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<CustomScheduling> {
		private CustomSchedulingConfigurationOverrides configurationOverrides;

		private Boolean enabled;

		private String interval;

		@Nullable
		private DateTime lastSynced;

		private String name;

		/**
		 * Required - API name: {@code configuration_overrides}
		 */
		public final Builder configurationOverrides(CustomSchedulingConfigurationOverrides value) {
			this.configurationOverrides = value;
			return this;
		}

		/**
		 * Required - API name: {@code configuration_overrides}
		 */
		public final Builder configurationOverrides(
				Function<CustomSchedulingConfigurationOverrides.Builder, ObjectBuilder<CustomSchedulingConfigurationOverrides>> fn) {
			return this.configurationOverrides(fn.apply(new CustomSchedulingConfigurationOverrides.Builder()).build());
		}

		/**
		 * Required - API name: {@code enabled}
		 */
		public final Builder enabled(boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * Required - API name: {@code interval}
		 */
		public final Builder interval(String value) {
			this.interval = value;
			return this;
		}

		/**
		 * API name: {@code last_synced}
		 */
		public final Builder lastSynced(@Nullable DateTime value) {
			this.lastSynced = value;
			return this;
		}

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CustomScheduling}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CustomScheduling build() {
			_checkSingleUse();

			return new CustomScheduling(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CustomScheduling}
	 */
	public static final JsonpDeserializer<CustomScheduling> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CustomScheduling::setupCustomSchedulingDeserializer);

	protected static void setupCustomSchedulingDeserializer(ObjectDeserializer<CustomScheduling.Builder> op) {

		op.add(Builder::configurationOverrides, CustomSchedulingConfigurationOverrides._DESERIALIZER,
				"configuration_overrides");
		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(Builder::interval, JsonpDeserializer.stringDeserializer(), "interval");
		op.add(Builder::lastSynced, DateTime._DESERIALIZER, "last_synced");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");

	}

}
