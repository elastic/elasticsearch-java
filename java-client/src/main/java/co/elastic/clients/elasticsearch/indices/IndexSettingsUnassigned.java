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

// typedef: indices._types.IndexSettingsUnassigned

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.IndexSettingsUnassigned">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndexSettingsUnassigned implements JsonpSerializable {
	@Nullable
	private final IndexSettingsUnassignedNodeLeft nodeLeft;

	// ---------------------------------------------------------------------------------------------

	private IndexSettingsUnassigned(Builder builder) {

		this.nodeLeft = builder.nodeLeft;

	}

	public static IndexSettingsUnassigned of(Function<Builder, ObjectBuilder<IndexSettingsUnassigned>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code node_left}
	 */
	@Nullable
	public final IndexSettingsUnassignedNodeLeft nodeLeft() {
		return this.nodeLeft;
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

		if (this.nodeLeft != null) {
			generator.writeKey("node_left");
			this.nodeLeft.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexSettingsUnassigned}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<IndexSettingsUnassigned> {
		@Nullable
		private IndexSettingsUnassignedNodeLeft nodeLeft;

		public Builder() {
		}
		private Builder(IndexSettingsUnassigned instance) {
			this.nodeLeft = instance.nodeLeft;

		}
		/**
		 * API name: {@code node_left}
		 */
		public final Builder nodeLeft(@Nullable IndexSettingsUnassignedNodeLeft value) {
			this.nodeLeft = value;
			return this;
		}

		/**
		 * API name: {@code node_left}
		 */
		public final Builder nodeLeft(
				Function<IndexSettingsUnassignedNodeLeft.Builder, ObjectBuilder<IndexSettingsUnassignedNodeLeft>> fn) {
			return this.nodeLeft(fn.apply(new IndexSettingsUnassignedNodeLeft.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndexSettingsUnassigned}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexSettingsUnassigned build() {
			_checkSingleUse();

			return new IndexSettingsUnassigned(this);
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
	 * Json deserializer for {@link IndexSettingsUnassigned}
	 */
	public static final JsonpDeserializer<IndexSettingsUnassigned> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndexSettingsUnassigned::setupIndexSettingsUnassignedDeserializer);

	protected static void setupIndexSettingsUnassignedDeserializer(
			ObjectDeserializer<IndexSettingsUnassigned.Builder> op) {

		op.add(Builder::nodeLeft, IndexSettingsUnassignedNodeLeft._DESERIALIZER, "node_left");

	}

}
