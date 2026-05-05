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

package co.elastic.clients.elasticsearch.indices;

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
import java.lang.Boolean;
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

// typedef: indices._types.DataStreamFailureStore

/**
 * Data stream failure store contains the configuration of the failure store for
 * a given data stream.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.DataStreamFailureStore">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataStreamFailureStore implements JsonpSerializable {
	@Nullable
	private final Boolean enabled;

	@Nullable
	private final FailureStoreLifecycle lifecycle;

	// ---------------------------------------------------------------------------------------------

	private DataStreamFailureStore(Builder builder) {

		this.enabled = builder.enabled;
		this.lifecycle = builder.lifecycle;

	}

	public static DataStreamFailureStore of(Function<Builder, ObjectBuilder<DataStreamFailureStore>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If defined, it turns the failure store on/off
	 * (<code>true</code>/<code>false</code>) for this data stream. A data stream
	 * failure store that's disabled (enabled: <code>false</code>) will redirect no
	 * new failed indices to the failure store; however, it will not remove any
	 * existing data from the failure store.
	 * <p>
	 * API name: {@code enabled}
	 */
	@Nullable
	public final Boolean enabled() {
		return this.enabled;
	}

	/**
	 * If defined, it specifies the lifecycle configuration for the failure store of
	 * this data stream.
	 * <p>
	 * API name: {@code lifecycle}
	 */
	@Nullable
	public final FailureStoreLifecycle lifecycle() {
		return this.lifecycle;
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

		if (this.enabled != null) {
			generator.writeKey("enabled");
			generator.write(this.enabled);

		}
		if (this.lifecycle != null) {
			generator.writeKey("lifecycle");
			this.lifecycle.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataStreamFailureStore}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataStreamFailureStore> {
		@Nullable
		private Boolean enabled;

		@Nullable
		private FailureStoreLifecycle lifecycle;

		public Builder() {
		}
		private Builder(DataStreamFailureStore instance) {
			this.enabled = instance.enabled;
			this.lifecycle = instance.lifecycle;

		}
		/**
		 * If defined, it turns the failure store on/off
		 * (<code>true</code>/<code>false</code>) for this data stream. A data stream
		 * failure store that's disabled (enabled: <code>false</code>) will redirect no
		 * new failed indices to the failure store; however, it will not remove any
		 * existing data from the failure store.
		 * <p>
		 * API name: {@code enabled}
		 */
		public final Builder enabled(@Nullable Boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * If defined, it specifies the lifecycle configuration for the failure store of
		 * this data stream.
		 * <p>
		 * API name: {@code lifecycle}
		 */
		public final Builder lifecycle(@Nullable FailureStoreLifecycle value) {
			this.lifecycle = value;
			return this;
		}

		/**
		 * If defined, it specifies the lifecycle configuration for the failure store of
		 * this data stream.
		 * <p>
		 * API name: {@code lifecycle}
		 */
		public final Builder lifecycle(
				Function<FailureStoreLifecycle.Builder, ObjectBuilder<FailureStoreLifecycle>> fn) {
			return this.lifecycle(fn.apply(new FailureStoreLifecycle.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataStreamFailureStore}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataStreamFailureStore build() {
			_checkSingleUse();

			return new DataStreamFailureStore(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataStreamFailureStore}
	 */
	public static final JsonpDeserializer<DataStreamFailureStore> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataStreamFailureStore::setupDataStreamFailureStoreDeserializer);

	protected static void setupDataStreamFailureStoreDeserializer(
			ObjectDeserializer<DataStreamFailureStore.Builder> op) {

		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(Builder::lifecycle, FailureStoreLifecycle._DESERIALIZER, "lifecycle");

	}

}
