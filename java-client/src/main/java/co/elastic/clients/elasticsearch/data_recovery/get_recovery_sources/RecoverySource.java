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

package co.elastic.clients.elasticsearch.data_recovery.get_recovery_sources;

import co.elastic.clients.elasticsearch.data_recovery.SourceType;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
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

// typedef: data_recovery.get_recovery_sources.RecoverySource

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#data_recovery.get_recovery_sources.RecoverySource">API
 *      specification</a>
 */
@JsonpDeserializable
public class RecoverySource implements JsonpSerializable {
	private final boolean complete;

	private final String name;

	private final SourceType type;

	// ---------------------------------------------------------------------------------------------

	private RecoverySource(Builder builder) {

		this.complete = ApiTypeHelper.requireNonNull(builder.complete, this, "complete", false);
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");

	}

	public static RecoverySource of(Function<Builder, ObjectBuilder<RecoverySource>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Whether the logical source was completely captured in the recovery
	 * point. For a data stream, this includes its backing and failure-store
	 * indices.
	 * <p>
	 * API name: {@code complete}
	 */
	public final boolean complete() {
		return this.complete;
	}

	/**
	 * Required - The name of the index or data stream.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - The type of logical source.
	 * <p>
	 * API name: {@code type}
	 */
	public final SourceType type() {
		return this.type;
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

		generator.writeKey("complete");
		generator.write(this.complete);

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("type");
		this.type.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RecoverySource}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RecoverySource> {
		private Boolean complete;

		private String name;

		private SourceType type;

		public Builder() {
		}
		private Builder(RecoverySource instance) {
			this.complete = instance.complete;
			this.name = instance.name;
			this.type = instance.type;

		}
		/**
		 * Required - Whether the logical source was completely captured in the recovery
		 * point. For a data stream, this includes its backing and failure-store
		 * indices.
		 * <p>
		 * API name: {@code complete}
		 */
		public final Builder complete(boolean value) {
			this.complete = value;
			return this;
		}

		/**
		 * Required - The name of the index or data stream.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - The type of logical source.
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(SourceType value) {
			this.type = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RecoverySource}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RecoverySource build() {
			_checkSingleUse();

			return new RecoverySource(this);
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
	 * Json deserializer for {@link RecoverySource}
	 */
	public static final JsonpDeserializer<RecoverySource> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RecoverySource::setupRecoverySourceDeserializer);

	protected static void setupRecoverySourceDeserializer(ObjectDeserializer<RecoverySource.Builder> op) {

		op.add(Builder::complete, JsonpDeserializer.booleanDeserializer(), "complete");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::type, SourceType._DESERIALIZER, "type");

	}

}
