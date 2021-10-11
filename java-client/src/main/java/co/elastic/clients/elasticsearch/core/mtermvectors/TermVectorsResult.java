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

package co.elastic.clients.elasticsearch.core.mtermvectors;

import co.elastic.clients.elasticsearch.core.termvectors.TermVector;
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

// typedef: _global.mtermvectors.TermVectorsResult
@JsonpDeserializable
public final class TermVectorsResult implements JsonpSerializable {
	private final boolean found;

	private final String id;

	private final String index;

	private final Map<String, TermVector> termVectors;

	private final long took;

	private final long version;

	// ---------------------------------------------------------------------------------------------

	public TermVectorsResult(Builder builder) {

		this.found = Objects.requireNonNull(builder.found, "found");
		this.id = Objects.requireNonNull(builder.id, "id");
		this.index = Objects.requireNonNull(builder.index, "index");
		this.termVectors = ModelTypeHelper.unmodifiableNonNull(builder.termVectors, "term_vectors");
		this.took = Objects.requireNonNull(builder.took, "took");
		this.version = Objects.requireNonNull(builder.version, "version");

	}

	public TermVectorsResult(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code found}
	 */
	public boolean found() {
		return this.found;
	}

	/**
	 * Required - API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * Required - API name: {@code term_vectors}
	 */
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
	 * Required - API name: {@code version}
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

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("index");
		generator.write(this.index);

		generator.writeKey("term_vectors");
		generator.writeStartObject();
		for (Map.Entry<String, TermVector> item0 : this.termVectors.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("took");
		generator.write(this.took);

		generator.writeKey("version");
		generator.write(this.version);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TermVectorsResult}.
	 */
	public static class Builder implements ObjectBuilder<TermVectorsResult> {
		private Boolean found;

		private String id;

		private String index;

		private Map<String, TermVector> termVectors;

		private Long took;

		private Long version;

		/**
		 * Required - API name: {@code found}
		 */
		public Builder found(boolean value) {
			this.found = value;
			return this;
		}

		/**
		 * Required - API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - API name: {@code term_vectors}
		 */
		public Builder termVectors(Map<String, TermVector> value) {
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
		 * Required - API name: {@code version}
		 */
		public Builder version(long value) {
			this.version = value;
			return this;
		}

		/**
		 * Builds a {@link TermVectorsResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TermVectorsResult build() {

			return new TermVectorsResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TermVectorsResult}
	 */
	public static final JsonpDeserializer<TermVectorsResult> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TermVectorsResult::setupTermVectorsResultDeserializer, Builder::build);

	protected static void setupTermVectorsResultDeserializer(DelegatingDeserializer<TermVectorsResult.Builder> op) {

		op.add(Builder::found, JsonpDeserializer.booleanDeserializer(), "found");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::termVectors, JsonpDeserializer.stringMapDeserializer(TermVector._DESERIALIZER), "term_vectors");
		op.add(Builder::took, JsonpDeserializer.longDeserializer(), "took");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");

	}

}
