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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.elasticsearch.cat.allocation.AllocationRecord;
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

// typedef: cat.allocation.Response
@JsonpDeserializable
public final class AllocationResponse implements JsonpSerializable {
	private final List<AllocationRecord> valueBody;

	// ---------------------------------------------------------------------------------------------

	public AllocationResponse(Builder builder) {

		this.valueBody = ModelTypeHelper.unmodifiableNonNull(builder.valueBody, "_value_body");

	}

	public AllocationResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Response value.
	 * <p>
	 * API name: {@code _value_body}
	 */
	public List<AllocationRecord> valueBody() {
		return this.valueBody;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (AllocationRecord item0 : this.valueBody) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AllocationResponse}.
	 */
	public static class Builder implements ObjectBuilder<AllocationResponse> {
		private List<AllocationRecord> valueBody;

		/**
		 * Response value.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public Builder valueBody(List<AllocationRecord> value) {
			this.valueBody = value;
			return this;
		}

		/**
		 * Response value.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public Builder valueBody(AllocationRecord... value) {
			this.valueBody = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #valueBody(List)}, creating the list if needed. 4
		 */
		public Builder addValueBody(AllocationRecord value) {
			if (this.valueBody == null) {
				this.valueBody = new ArrayList<>();
			}
			this.valueBody.add(value);
			return this;
		}

		/**
		 * Set {@link #valueBody(List)} to a singleton list.
		 */
		public Builder valueBody(Function<AllocationRecord.Builder, ObjectBuilder<AllocationRecord>> fn) {
			return this.valueBody(fn.apply(new AllocationRecord.Builder()).build());
		}

		/**
		 * Add a value to {@link #valueBody(List)}, creating the list if needed. 5
		 */
		public Builder addValueBody(Function<AllocationRecord.Builder, ObjectBuilder<AllocationRecord>> fn) {
			return this.addValueBody(fn.apply(new AllocationRecord.Builder()).build());
		}

		/**
		 * Builds a {@link AllocationResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AllocationResponse build() {

			return new AllocationResponse(this);
		}
	}

	public static final JsonpDeserializer<AllocationResponse> _DESERIALIZER = createAllocationResponseDeserializer();
	protected static JsonpDeserializer<AllocationResponse> createAllocationResponseDeserializer() {

		JsonpDeserializer<List<AllocationRecord>> valueDeserializer = JsonpDeserializer
				.arrayDeserializer(AllocationRecord._DESERIALIZER);

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.valueBody(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

}
