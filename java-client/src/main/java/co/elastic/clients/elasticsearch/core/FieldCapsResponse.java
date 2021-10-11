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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.elasticsearch.core.field_caps.FieldCapability;
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
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.field_caps.Response
@JsonpDeserializable
public final class FieldCapsResponse implements JsonpSerializable {
	private final List<String> indices;

	private final Map<String, Map<String, FieldCapability>> fields;

	// ---------------------------------------------------------------------------------------------

	public FieldCapsResponse(Builder builder) {

		this.indices = ModelTypeHelper.unmodifiableNonNull(builder.indices, "indices");
		this.fields = ModelTypeHelper.unmodifiableNonNull(builder.fields, "fields");

	}

	public FieldCapsResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code indices}
	 */
	public List<String> indices() {
		return this.indices;
	}

	/**
	 * Required - API name: {@code fields}
	 */
	public Map<String, Map<String, FieldCapability>> fields() {
		return this.fields;
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

		generator.writeKey("indices");
		generator.writeStartArray();
		for (String item0 : this.indices) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("fields");
		generator.writeStartObject();
		for (Map.Entry<String, Map<String, FieldCapability>> item0 : this.fields.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.writeStartObject();
			for (Map.Entry<String, FieldCapability> item1 : item0.getValue().entrySet()) {
				generator.writeKey(item1.getKey());
				item1.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldCapsResponse}.
	 */
	public static class Builder implements ObjectBuilder<FieldCapsResponse> {
		private List<String> indices;

		private Map<String, Map<String, FieldCapability>> fields;

		/**
		 * Required - API name: {@code indices}
		 */
		public Builder indices(List<String> value) {
			this.indices = value;
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 */
		public Builder indices(String... value) {
			this.indices = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #indices(List)}, creating the list if needed.
		 */
		public Builder addIndices(String value) {
			if (this.indices == null) {
				this.indices = new ArrayList<>();
			}
			this.indices.add(value);
			return this;
		}

		/**
		 * Required - API name: {@code fields}
		 */
		public Builder fields(Map<String, Map<String, FieldCapability>> value) {
			this.fields = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #fields(Map)}, creating the map if needed.
		 */
		public Builder putFields(String key, Map<String, FieldCapability> value) {
			if (this.fields == null) {
				this.fields = new HashMap<>();
			}
			this.fields.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link FieldCapsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldCapsResponse build() {

			return new FieldCapsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FieldCapsResponse}
	 */
	public static final JsonpDeserializer<FieldCapsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FieldCapsResponse::setupFieldCapsResponseDeserializer, Builder::build);

	protected static void setupFieldCapsResponseDeserializer(DelegatingDeserializer<FieldCapsResponse.Builder> op) {

		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"indices");
		op.add(Builder::fields, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.stringMapDeserializer(FieldCapability._DESERIALIZER)), "fields");

	}

}
