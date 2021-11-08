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
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: dangling_indices.list_dangling_indices.Response
@JsonpDeserializable
public class ListDanglingIndicesResponse implements JsonpSerializable {
	private final List<DanglingIndex> danglingIndices;

	// ---------------------------------------------------------------------------------------------

	private ListDanglingIndicesResponse(Builder builder) {

		this.danglingIndices = ModelTypeHelper.unmodifiableRequired(builder.danglingIndices, this, "danglingIndices");

	}

	public static ListDanglingIndicesResponse of(Function<Builder, ObjectBuilder<ListDanglingIndicesResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code dangling_indices}
	 */
	public final List<DanglingIndex> danglingIndices() {
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

		if (ModelTypeHelper.isDefined(this.danglingIndices)) {
			generator.writeKey("dangling_indices");
			generator.writeStartArray();
			for (DanglingIndex item0 : this.danglingIndices) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ListDanglingIndicesResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ListDanglingIndicesResponse> {
		private List<DanglingIndex> danglingIndices;

		/**
		 * Required - API name: {@code dangling_indices}
		 */
		public final Builder danglingIndices(List<DanglingIndex> value) {
			this.danglingIndices = value;
			return this;
		}

		/**
		 * Required - API name: {@code dangling_indices}
		 */
		public final Builder danglingIndices(DanglingIndex... value) {
			this.danglingIndices = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code dangling_indices}
		 */
		@SafeVarargs
		public final Builder danglingIndices(Function<DanglingIndex.Builder, ObjectBuilder<DanglingIndex>>... fns) {
			this.danglingIndices = new ArrayList<>(fns.length);
			for (Function<DanglingIndex.Builder, ObjectBuilder<DanglingIndex>> fn : fns) {
				this.danglingIndices.add(fn.apply(new DanglingIndex.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link ListDanglingIndicesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ListDanglingIndicesResponse build() {
			_checkSingleUse();

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
