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

package co.elastic.clients.elasticsearch.dangling_indices;

import co.elastic.clients.elasticsearch.dangling_indices.list_dangling_indices.DanglingIndex;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: dangling_indices.list_dangling_indices.Response
@JsonpDeserializable
public final class ListDanglingIndicesResponse implements JsonpSerializable {
	private final List<DanglingIndex> danglingIndices;

	// ---------------------------------------------------------------------------------------------

	public ListDanglingIndicesResponse(Builder builder) {

		this.danglingIndices = ModelTypeHelper.unmodifiableNonNull(builder.danglingIndices, "dangling_indices");

	}

	public ListDanglingIndicesResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code dangling_indices}
	 */
	public List<DanglingIndex> danglingIndices() {
		return this.danglingIndices;
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

		generator.writeKey("dangling_indices");
		generator.writeStartArray();
		for (DanglingIndex item0 : this.danglingIndices) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ListDanglingIndicesResponse}.
	 */
	public static class Builder implements ObjectBuilder<ListDanglingIndicesResponse> {
		private List<DanglingIndex> danglingIndices;

		/**
		 * Required - API name: {@code dangling_indices}
		 */
		public Builder danglingIndices(List<DanglingIndex> value) {
			this.danglingIndices = value;
			return this;
		}

		/**
		 * Required - API name: {@code dangling_indices}
		 */
		public Builder danglingIndices(DanglingIndex... value) {
			this.danglingIndices = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #danglingIndices(List)}, creating the list if needed.
		 */
		public Builder addDanglingIndices(DanglingIndex value) {
			if (this.danglingIndices == null) {
				this.danglingIndices = new ArrayList<>();
			}
			this.danglingIndices.add(value);
			return this;
		}

		/**
		 * Set {@link #danglingIndices(List)} to a singleton list.
		 */
		public Builder danglingIndices(Function<DanglingIndex.Builder, ObjectBuilder<DanglingIndex>> fn) {
			return this.danglingIndices(fn.apply(new DanglingIndex.Builder()).build());
		}

		/**
		 * Add a value to {@link #danglingIndices(List)}, creating the list if needed.
		 */
		public Builder addDanglingIndices(Function<DanglingIndex.Builder, ObjectBuilder<DanglingIndex>> fn) {
			return this.addDanglingIndices(fn.apply(new DanglingIndex.Builder()).build());
		}

		/**
		 * Builds a {@link ListDanglingIndicesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ListDanglingIndicesResponse build() {

			return new ListDanglingIndicesResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ListDanglingIndicesResponse}
	 */
	public static final JsonpDeserializer<ListDanglingIndicesResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, ListDanglingIndicesResponse::setupListDanglingIndicesResponseDeserializer, Builder::build);

	protected static void setupListDanglingIndicesResponseDeserializer(
			DelegatingDeserializer<ListDanglingIndicesResponse.Builder> op) {

		op.add(Builder::danglingIndices, JsonpDeserializer.arrayDeserializer(DanglingIndex._DESERIALIZER),
				"dangling_indices");

	}

}
