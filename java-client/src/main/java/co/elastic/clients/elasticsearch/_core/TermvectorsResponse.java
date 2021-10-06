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

package co.elastic.clients.elasticsearch._core;

import co.elastic.clients.elasticsearch._core.termvectors.TermVector;
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
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.termvectors.Response
@JsonpDeserializable
public final class TermvectorsResponse implements JsonpSerializable {
	private final boolean found;

	private final String id;

	private final String index;

	@Nullable
	private final Map<String, TermVector> termVectors;

	private final long took;

	@Nullable
	private final String type;

	private final long version;

	// ---------------------------------------------------------------------------------------------

	public TermvectorsResponse(Builder builder) {

		this.found = Objects.requireNonNull(builder.found, "found");
		this.id = Objects.requireNonNull(builder.id, "_id");
		this.index = Objects.requireNonNull(builder.index, "_index");
		this.termVectors = ModelTypeHelper.unmodifiable(builder.termVectors);
		this.took = Objects.requireNonNull(builder.took, "took");
		this.type = builder.type;
		this.version = Objects.requireNonNull(builder.version, "_version");

	}

	public TermvectorsResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code found}
	 */
	public boolean found() {
		return this.found;
	}

	/**
	 * Required - API name: {@code _id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code _index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code term_vectors}
	 */
	@Nullable
	public Map<String, TermVector> termVectors() {
		return this.termVectors;
	}

	/**
	 * Required - API name: {@code took}
	 */
	public long took() {
		return this.took;
	}

	/**
	 * API name: {@code _type}
	 */
	@Nullable
	public String type() {
		return this.type;
	}

	/**
	 * Required - API name: {@code _version}
	 */
	public long version() {
		return this.version;
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

		generator.writeKey("found");
		generator.write(this.found);

		generator.writeKey("_id");
		generator.write(this.id);

		generator.writeKey("_index");
		generator.write(this.index);

		if (this.termVectors != null) {

			generator.writeKey("term_vectors");
			generator.writeStartObject();
			for (Map.Entry<String, TermVector> item0 : this.termVectors.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

		generator.writeKey("took");
		generator.write(this.took);

		if (this.type != null) {

			generator.writeKey("_type");
			generator.write(this.type);

		}

		generator.writeKey("_version");
		generator.write(this.version);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TermvectorsResponse}.
	 */
	public static class Builder implements ObjectBuilder<TermvectorsResponse> {
		private Boolean found;

		private String id;

		private String index;

		@Nullable
		private Map<String, TermVector> termVectors;

		private Long took;

		@Nullable
		private String type;

		private Long version;

		/**
		 * Required - API name: {@code found}
		 */
		public Builder found(boolean value) {
			this.found = value;
			return this;
		}

		/**
		 * Required - API name: {@code _id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code _index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code term_vectors}
		 */
		public Builder termVectors(@Nullable Map<String, TermVector> value) {
			this.termVectors = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #termVectors(Map)}, creating the map if needed.
		 */
		public Builder putTermVectors(String key, TermVector value) {
			if (this.termVectors == null) {
				this.termVectors = new HashMap<>();
			}
			this.termVectors.put(key, value);
			return this;
		}

		/**
		 * Set {@link #termVectors(Map)} to a singleton map.
		 */
		public Builder termVectors(String key, Function<TermVector.Builder, ObjectBuilder<TermVector>> fn) {
			return this.termVectors(Collections.singletonMap(key, fn.apply(new TermVector.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #termVectors(Map)}, creating the map if needed.
		 */
		public Builder putTermVectors(String key, Function<TermVector.Builder, ObjectBuilder<TermVector>> fn) {
			return this.putTermVectors(key, fn.apply(new TermVector.Builder()).build());
		}

		/**
		 * Required - API name: {@code took}
		 */
		public Builder took(long value) {
			this.took = value;
			return this;
		}

		/**
		 * API name: {@code _type}
		 */
		public Builder type(@Nullable String value) {
			this.type = value;
			return this;
		}

		/**
		 * Required - API name: {@code _version}
		 */
		public Builder version(long value) {
			this.version = value;
			return this;
		}

		/**
		 * Builds a {@link TermvectorsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TermvectorsResponse build() {

			return new TermvectorsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TermvectorsResponse}
	 */
	public static final JsonpDeserializer<TermvectorsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TermvectorsResponse::setupTermvectorsResponseDeserializer, Builder::build);

	protected static void setupTermvectorsResponseDeserializer(DelegatingDeserializer<TermvectorsResponse.Builder> op) {

		op.add(Builder::found, JsonpDeserializer.booleanDeserializer(), "found");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::termVectors, JsonpDeserializer.stringMapDeserializer(TermVector._DESERIALIZER), "term_vectors");
		op.add(Builder::took, JsonpDeserializer.longDeserializer(), "took");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "_type");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "_version");

	}

}
