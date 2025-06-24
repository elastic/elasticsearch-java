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

// typedef: indices._types.DataStreamFailureStoreTemplate

/**
 * Template equivalent of DataStreamFailureStore that allows nullable values.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.DataStreamFailureStoreTemplate">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataStreamFailureStoreTemplate implements JsonpSerializable {
	@Nullable
	private final Boolean enabled;

	@Nullable
	private final FailureStoreLifecycleTemplate lifecycle;

	// ---------------------------------------------------------------------------------------------

	private DataStreamFailureStoreTemplate(Builder builder) {

		this.enabled = builder.enabled;
		this.lifecycle = builder.lifecycle;

	}

	public static DataStreamFailureStoreTemplate of(
			Function<Builder, ObjectBuilder<DataStreamFailureStoreTemplate>> fn) {
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
	public final FailureStoreLifecycleTemplate lifecycle() {
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
	 * Builder for {@link DataStreamFailureStoreTemplate}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataStreamFailureStoreTemplate> {
		@Nullable
		private Boolean enabled;

		@Nullable
		private FailureStoreLifecycleTemplate lifecycle;

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
		public final Builder lifecycle(@Nullable FailureStoreLifecycleTemplate value) {
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
				Function<FailureStoreLifecycleTemplate.Builder, ObjectBuilder<FailureStoreLifecycleTemplate>> fn) {
			return this.lifecycle(fn.apply(new FailureStoreLifecycleTemplate.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataStreamFailureStoreTemplate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataStreamFailureStoreTemplate build() {
			_checkSingleUse();

			return new DataStreamFailureStoreTemplate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataStreamFailureStoreTemplate}
	 */
	public static final JsonpDeserializer<DataStreamFailureStoreTemplate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataStreamFailureStoreTemplate::setupDataStreamFailureStoreTemplateDeserializer);

	protected static void setupDataStreamFailureStoreTemplateDeserializer(
			ObjectDeserializer<DataStreamFailureStoreTemplate.Builder> op) {

		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(Builder::lifecycle, FailureStoreLifecycleTemplate._DESERIALIZER, "lifecycle");

	}

}
