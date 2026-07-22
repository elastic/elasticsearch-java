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

import co.elastic.clients.elasticsearch._types.Time;
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

// typedef: indices._types.IndexSettingsUnassignedNodeLeft

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.IndexSettingsUnassignedNodeLeft">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndexSettingsUnassignedNodeLeft implements JsonpSerializable {
	@Nullable
	private final Time delayedTimeout;

	// ---------------------------------------------------------------------------------------------

	private IndexSettingsUnassignedNodeLeft(Builder builder) {

		this.delayedTimeout = builder.delayedTimeout;

	}

	public static IndexSettingsUnassignedNodeLeft of(
			Function<Builder, ObjectBuilder<IndexSettingsUnassignedNodeLeft>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The amount of time to wait for a node that has left before assuming its
	 * shards are permanently missing and starting to allocate replacement replicas.
	 * <p>
	 * API name: {@code delayed_timeout}
	 */
	@Nullable
	public final Time delayedTimeout() {
		return this.delayedTimeout;
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

		if (this.delayedTimeout != null) {
			generator.writeKey("delayed_timeout");
			this.delayedTimeout.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexSettingsUnassignedNodeLeft}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<IndexSettingsUnassignedNodeLeft> {
		@Nullable
		private Time delayedTimeout;

		public Builder() {
		}
		private Builder(IndexSettingsUnassignedNodeLeft instance) {
			this.delayedTimeout = instance.delayedTimeout;

		}
		/**
		 * The amount of time to wait for a node that has left before assuming its
		 * shards are permanently missing and starting to allocate replacement replicas.
		 * <p>
		 * API name: {@code delayed_timeout}
		 */
		public final Builder delayedTimeout(@Nullable Time value) {
			this.delayedTimeout = value;
			return this;
		}

		/**
		 * The amount of time to wait for a node that has left before assuming its
		 * shards are permanently missing and starting to allocate replacement replicas.
		 * <p>
		 * API name: {@code delayed_timeout}
		 */
		public final Builder delayedTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.delayedTimeout(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndexSettingsUnassignedNodeLeft}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexSettingsUnassignedNodeLeft build() {
			_checkSingleUse();

			return new IndexSettingsUnassignedNodeLeft(this);
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
	 * Json deserializer for {@link IndexSettingsUnassignedNodeLeft}
	 */
	public static final JsonpDeserializer<IndexSettingsUnassignedNodeLeft> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndexSettingsUnassignedNodeLeft::setupIndexSettingsUnassignedNodeLeftDeserializer);

	protected static void setupIndexSettingsUnassignedNodeLeftDeserializer(
			ObjectDeserializer<IndexSettingsUnassignedNodeLeft.Builder> op) {

		op.add(Builder::delayedTimeout, Time._DESERIALIZER, "delayed_timeout");

	}

}
